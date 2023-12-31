import java.io.*;
import java.util.*;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.GeometricDistribution;
import org.apache.commons.math3.distribution.GammaDistribution;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.special.Gamma;


public class exprVisitor extends StarBaseVisitor<Valor> {
    boolean ret=false;
    int contador =0;
    Map<String, Valor> memory = new HashMap<String, Valor>();
    private HashMap<Integer, HashMap<String, Valor>> locales = new HashMap<>();
    Map<String, ArrayList> arraymemory = new HashMap<String, ArrayList>();
    Object [] [] matrizconDatos;
    Map<String, ArrayList<double[]>> arraylistmemory = new HashMap<String, ArrayList<double[]>>();
    Map<String, TWModel> twmemory = new HashMap<String, TWModel>();
    Map<String,GammaDistribution > gammamemory = new HashMap<String, GammaDistribution>();
    Map<String,TDistribution > tmemory = new HashMap<String,TDistribution>();
    Map<String,NormalDistribution > normalmemory = new HashMap<String,NormalDistribution>();
    Map<String,GeometricDistribution > geometricmemory = new HashMap<String,GeometricDistribution>();
    Map<String,PoissonDistribution > poissonmemory = new HashMap<String,PoissonDistribution>();
    Map<String,ChiSquaredDistribution> chimemory = new HashMap<String,ChiSquaredDistribution>();


    Map<String, ArrayList<ArrayList>> matrixmemory = new HashMap<String, ArrayList<ArrayList>>();
    private Valor variable=null;

    Map<String, FunctionValor> funciones = new HashMap<String, FunctionValor>();
    HashMap<String, Valor> globales = new HashMap<>();

    @Override public Valor visitAlgoritmo(StarParser.AlgoritmoContext ctx) {
        String algorithmName = ctx.algorithm().ID().getText();
        System.out.println("Algorithm: " + algorithmName);
        if (ctx.algorithm().idlist() != null) {
            //System.out.println("lista no nulo");
            for(int i=0;i<ctx.algorithm().idlist().ID().size();i++){
                String x = ctx.algorithm().idlist().ID(i).getText();
                if(memory.containsKey(x)){

                        memory.replace(x,null);
                    }
                    else {
                        memory.put(x,null);

                }

            }
            //visitListdefvar(ctx.algorithm().listdefvar());
        }
        if (ctx.algorithm().statement() != null) {
           // System.out.println("statement no nulo");
            visitStatement(ctx.algorithm().statement());
        }

        return null;
    }

    @Override public Valor visitArraylist(StarParser.ArraylistContext ctx) {
        String id= ctx.ID().getText();
        if(ctx.ARRAYLIST()==null){
           return new Valor(arraylistmemory.get(id));
        }

        ArrayList<double[]> id2 = new ArrayList<>();
        if(arraylistmemory.containsKey(id)){
            arraylistmemory.replace(id,id2);
        }else{
            arraylistmemory.put(id,id2);
           // System.out.println("arraylist creado");
        }

        return null;
    }
    @Override public Valor visitArraylistop(StarParser.ArraylistopContext ctx) {
        String id=ctx.ID().getText();
        //System.out.println(id);

        if(arraylistmemory.containsKey(id)){
            if(ctx.LSIZE()!=null){
                //System.out.println(arraylistmemory.get(id).size());
                return new Valor(arraylistmemory.get(id).size());
            }
            ArrayList<Double> arreglo = (visit(ctx.array())).aVector();
            double[] doubleArray = new double[arreglo.size()];
            for (int i = 0; i < arreglo.size(); i++) {
                doubleArray[i] = arreglo.get(i);
            }
           // System.out.println(arreglo);
           // System.out.println("entro");
            if(ctx.LADD()!=null){

                arraylistmemory.get(id).add(doubleArray);
            }
            if(ctx.LDELETE()!=null){
                arraylistmemory.get(id).remove(doubleArray);
            }
            if(ctx.LGET()!=null){
                int intege=Integer.valueOf(ctx.INTEGER().getText());
               return new Valor (arraylistmemory.get(id).get(intege));
            }

            if(ctx.LCONTAINS()!=null){
               if(arraylistmemory.get(id).contains(arreglo)){
                   return new Valor(true);
               }else{return new Valor(false);
               }
            }
        }


        return null; }
    @Override public Valor visitTwoWaysModel(StarParser.TwoWaysModelContext ctx) {
        String nombre= ctx.ID().getText() ;
        double efectoModelo =Double.valueOf(ctx.REALNUMBER().getText());
        ArrayList<Double> bloques = new ArrayList<>();
        bloques=visit(ctx.array(0)).aVector();
        ArrayList<Double> tratamientos = visit(ctx.array(1)).aVector();

        ArrayList<double[]> matrizDatos = new ArrayList<>();
        for(int i=0;i<visit(ctx.arraylist()).aVector().size();i++){

        matrizDatos.add((double[]) visit(ctx.arraylist()).aVector().get(i));
        }
       /* for (int i=0;i<matrizDatos.size();i++){
            for (int j=0;j<matrizDatos.get(i).length;j++){
                double[] ar= matrizDatos.get(i);
                System.out.print(ar[j]);
                System.out.print(" ");
            }
            System.out.println();

        }*/
        TWModel nuevomodelo= new TWModel(efectoModelo,tratamientos,bloques,matrizDatos);
        matrizconDatos=nuevomodelo.crearMatrizConDatos();
        //nuevomodelo.crearMatrizR();
        nuevomodelo.imprimirMatrizConDatos();
        nuevomodelo.crearMatrizR();
        nuevomodelo.imprimirMatrizR();
       // nuevomodelo.imprimirMatrizConDatos();



        if(twmemory.containsKey(nombre)){
            twmemory.replace(nombre,nuevomodelo);
        }
        else{
            twmemory.put(nombre,nuevomodelo);
        }

        return null;
    }
    @Override public Valor visitNOperations(StarParser.NOperationsContext ctx) {
        String id= ctx.ID().getText();
        TWModel mod=twmemory.get(id);
        if(ctx.DOTDOT()!=null && ctx.N()!=null){
            System.out.println( mod.calcularNumeroTotalDatos());
            return new Valor( mod.calcularNumeroTotalDatos());
        }
        if(ctx.IDOT()!=null && ctx.N()!=null && ctx.INTEGER().size()<=1){
            int bloque= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.calcularNumeroTotalDatosBloque(bloque));
            return new Valor(mod.calcularNumeroTotalDatosBloque(bloque));
        }
        if(ctx.DOTJ()!=null && ctx.N()!=null ){
            System.out.print("datosbloque: ");
            int tratamiento= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.calcularNumeroTotalDatosTratamiento(tratamiento));
            return new Valor(mod.calcularNumeroTotalDatosTratamiento(tratamiento));
        }
        if(ctx.INTEGER().size()==3 && ctx.X()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            int k= Integer.valueOf(ctx.INTEGER(2).getText());
            double valor=mod.datoMatrizN(i,j,k);
            System.out.println(valor);
            return new Valor(valor);
        }
        if(ctx.IDOT()!=null && ctx.X()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            System.out.println((mod.matrizNsumaijPunto(i,j)));
            return new Valor(mod.matrizNsumaijPunto(i,j));
        }
        if(ctx.IDOT()!=null && ctx.XAVERAGE()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            System.out.println((mod.promedioNSumaijPunto(i,j)));
            return new Valor(mod.promedioNSumaijPunto(i,j));
        }
        if(ctx.DOTDOTSPACE()!=null && ctx.X()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.matrizNsumaiPuntoPunto(i));
            return new Valor(mod.matrizNsumaiPuntoPunto(i));
        }
        if(ctx.DOT().size()==2 && ctx.X()!=null){ //suma rachas tratamiento j
            int j= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.matrizNpuntojPunto(j));
            return new Valor(mod.matrizNpuntojPunto(j));
        }
        if(ctx.DOTDOTSPACE()!=null && ctx.XAVERAGE()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.matrizNpromedioiPuntoPunto(i));
            return new Valor(mod.matrizNpromedioiPuntoPunto(i));
        }
        if(ctx.DOT().size()==2 && ctx.XAVERAGE()!=null){ //suma rachas tratamiento j
            int j= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.matrizNpromedioPuntojPunto(j));
            return new Valor(mod.matrizNpromedioPuntojPunto(j));
        }
        if(ctx.DOTDOTDOT()!=null && ctx.X()!=null){ //suma rachas todo el modelo
            System.out.println(mod.matrizNsumaRachasModeloTotal());
            return new Valor(mod.matrizNsumaRachasModeloTotal());
        }
        if(ctx.DOTDOTDOT()!=null && ctx.XAVERAGE()!=null){ //promedio rachas todo el modelo
            System.out.println(mod.matrizNpromedioTotalRachasModelo());
            return new Valor(mod.matrizNpromedioTotalRachasModelo());

        }
        return null;}
    @Override public Valor visitXOperations(StarParser.XOperationsContext ctx) {
        String id= ctx.ID().getText();
        TWModel mod=twmemory.get(id);
        if(ctx.DOTDOT()!=null && ctx.X()!=null){
            System.out.println( mod.obtenerDatosMatriz());
            return new Valor( mod.obtenerDatosMatriz());
        }
        if(ctx.IDOT()!=null && ctx.X()!=null){
            int bloque= Integer.valueOf(ctx.INTEGER().getText());
            System.out.println(mod.obtenerDatosBloque(bloque));
            return new Valor(mod.obtenerDatosBloque(bloque));
        }
        if(ctx.DOTJ()!=null && ctx.X()!=null){
            int tratamiento= Integer.valueOf(ctx.INTEGER().getText());
            System.out.println(mod.obtenerDatosTratamiento(tratamiento));
            return new Valor(mod.obtenerDatosTratamiento(tratamiento));
        }
        if(ctx.DOTDOT()!=null && ctx.R()!=null){
            System.out.println( mod.obtenerDatosMatrizR());
            return new Valor( mod.obtenerDatosMatrizR());
        }
        if(ctx.IDOT()!=null && ctx.R()!=null){
            int bloque= Integer.valueOf(ctx.INTEGER().getText());
            System.out.println(mod.obtenerDatosBloqueMatrizR(bloque));
            return new Valor(mod.obtenerDatosBloqueMatrizR(bloque));
        }
        if(ctx.DOTJ()!=null && ctx.R()!=null){
            int tratamiento= Integer.valueOf(ctx.INTEGER().getText());
            System.out.println(mod.obtenerDatosTratamientoMatrizR(tratamiento));
            return new Valor(mod.obtenerDatosTratamientoMatrizR(tratamiento));
        }
        if(ctx.C()!=null){
            int i = Integer.valueOf(ctx.INTEGER().getText());
            System.out.println(mod.encontrarCi(i));
            return new Valor(mod.encontrarCi(i));
        }
        return null;
    }
    @Override public Valor visitROperations(StarParser.ROperationsContext ctx) {
        String id= ctx.ID().getText();
        TWModel mod=twmemory.get(id);
        if(ctx.INTEGER().size()==3 && ctx.R()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            int k= Integer.valueOf(ctx.INTEGER(2).getText());
            double valor=mod.datoMatrizR(i,j,k);
            System.out.println(valor);
            return new Valor(valor);
        }
        if(ctx.IDOT()!=null && ctx.R()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            System.out.println((mod.sumaijPunto(i,j)));
            return new Valor(mod.sumaijPunto(i,j));
        }
        if(ctx.IDOT()!=null && ctx.RAVERAGE()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            int j= Integer.valueOf(ctx.INTEGER(1).getText());
            System.out.println((mod.promedioSumaijPunto(i,j)));
            return new Valor(mod.promedioSumaijPunto(i,j));
        }
        if(ctx.DOTDOTSPACE()!=null && ctx.R()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.sumaiPuntoPunto(i));
            return new Valor(mod.sumaiPuntoPunto(i));
        }
        if(ctx.DOT().size()==2 && ctx.R()!=null){ //suma rachas tratamiento j
            int j= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.puntojPunto(j));
            return new Valor(mod.puntojPunto(j));
        }
        if(ctx.DOTDOTSPACE()!=null && ctx.RAVERAGE()!=null){
            int i= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.promedioiPuntoPunto(i));
            return new Valor(mod.promedioiPuntoPunto(i));
        }
        if(ctx.DOT().size()==2 && ctx.RAVERAGE()!=null){ //suma rachas tratamiento j
            int j= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(mod.promedioPuntojPunto(j));
            return new Valor(mod.promedioPuntojPunto(j));
        }
        if(ctx.DOTDOTDOT()!=null && ctx.R()!=null){ //suma rachas todo el modelo
            System.out.println(mod.sumaRachasModeloTotal());
            return new Valor(mod.sumaRachasModeloTotal());
        }
        if(ctx.DOTDOTDOT()!=null && ctx.RAVERAGE()!=null){ //promedio rachas todo el modelo
            System.out.println(mod.promedioTotalRachasModelo());
            return new Valor(mod.promedioTotalRachasModelo());

        }
        return null; }
    @Override public Valor visitTwoWaysModelop(StarParser.TwoWaysModelopContext ctx) {
        if(ctx.nOperations()!=null){
            return new Valor(visit(ctx.nOperations()));
        }
        if(ctx.xOperations()!=null){
            return new Valor(visit(ctx.xOperations()));
        }
        if(ctx.rOperations()!=null){
            return new Valor(visit(ctx.rOperations()));
        }
        String id= ctx.ID().getText();
        TWModel mod=twmemory.get(id);

        if(ctx.ALPHA()!=null){
            return new Valor(mod.getAlpha());
        }

        return null; }
    @Override public Valor visitNOP(StarParser.NOPContext ctx) {
        return new Valor(visit(ctx.nOperations()));
    }
    @Override public Valor visitROP(StarParser.ROPContext ctx) {
        return new Valor(visit(ctx.rOperations()));
    }

    @Override public Valor visitMd(StarParser.MdContext ctx) {
        Valor izq = new Valor((visit(ctx.algexpr(0)).toString()));
        Valor der = new Valor((visit(ctx.algexpr(1)).toString()));
        Double left ;
        Double right;
        if(memory.containsKey(izq)){
            left = Double.valueOf(memory.get(izq).toString());
        }
        else{
            left = Double.valueOf(izq.toString());
        }
        if(memory.containsKey(der)){
            right = Double.valueOf(memory.get(der).toString());
        }
        else{
            right = Double.valueOf(visit(ctx.algexpr(1)).toString());
        }
        Valor total;

        return total=new Valor(left % right);
    }
    @Override public Valor visitRelexpr(StarParser.RelexprContext ctx) {
        Double val1= Double.valueOf(visit(ctx.algexpr(0)).toString());
        Double val2= Double.valueOf(visit(ctx.algexpr(1)).toString());
        if (ctx.opl != null) {
            switch (ctx.opl.getText()) {
                case ">":
                    if(val1>val2){
                       // System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                       // System.out.println("false");
                        return new Valor(false);

                    }
                case "<":
                    if(val1<val2){
                        //System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                       // System.out.println("false");
                        return new Valor(false);

                    }
                case "==":
                    if(val1.equals(val2)){
                        //System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                       // System.out.println("false");
                        return new Valor(false);

                    }
                case "!=":
                    if(val1!=val2){
                        //System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                        // System.out.println("false");
                        return new Valor(false);

                    }
                case "<=":
                    if(val1<=val2){
                       // System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                       // System.out.println("false");
                        return new Valor(false);

                    }
                case ">=":
                    if(val1>=val2){
                        //System.out.println("true");
                        return new Valor(true);
                    }
                    else{
                       // System.out.println("false");
                        return new Valor(false);

                    }

                default:
                    break;
            }
        }

        return null;
    }
    @Override public Valor visitRelationals(StarParser.RelationalsContext ctx) {
        return visit(ctx.relexpr());
    }
    @Override public Valor visitRelParenthesis(StarParser.RelParenthesisContext ctx) {
        return visit(ctx.relexpr());}
    @Override public Valor visitBTrue(StarParser.BTrueContext ctx) {
        Boolean x=true;
        Valor value = new Valor (x);
        return value;
    }
    @Override public Valor visitBFalse(StarParser.BFalseContext ctx) {
        Boolean x=false;
        Valor value = new Valor (x);
        return value;
    }
    @Override public Valor visitBID(StarParser.BIDContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return new Valor(memory.get(id));
        return new Valor(id);
    }
    @Override public Valor visitBParenthesis(StarParser.BParenthesisContext ctx) {
        return visit(ctx.bexpression());
    }
    @Override public Valor visitBNeg(StarParser.BNegContext ctx) {
        Boolean f=false;
        Boolean t=true;
        boolean v1 = false;
        if(visit(ctx.bfactor()).aBoolean()==true)  v1=t;
        if(visit(ctx.bfactor()).aBoolean()==false) v1 =f;
       // System.out.println(!v1);

        return new Valor (!v1);
    }
    @Override public Valor visitIf_statement(StarParser.If_statementContext ctx) {
        if(visit(ctx.bexpression()).aBoolean()==true){
        if (ctx.statement(0)!=null){
           // System.out.println(visit(ctx.statement(0)).toString());
            //visit(ctx.statement(0));
            return this.visit(ctx.statement(0));

            }

        }
        else {
            if (ctx.ELSE() != null) {
                return this.visit(ctx.statement(1));
            }
        }
     return visit(ctx);
    }
    public static void escribirEnArchivo(String rutaArchivo, String text) {
        try (FileWriter escritor = new FileWriter(rutaArchivo)) {
            escritor.write(text);
            System.out.println("Se ha escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override public Valor visitFwrite_statement(StarParser.Fwrite_statementContext ctx) {
        String ruta;
        if(ctx.CADENA().size()>1){
            ruta= ctx.CADENA(1).getText();
        }
        else{
             ruta= ctx.CADENA(0).getText();
        }

        String filePath = ruta.replaceAll("\"", "");
        System.out.println(filePath);

        try {
            File archivo = new File(filePath);
            if (archivo.createNewFile()) {
                System.out.println("El archivo" +archivo.getName()+" se ha creado correctamente.");
            } else {
               // System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
        if(ctx.idlist()!=null){
            for (int i = 0; i < ctx.idlist().ID().size(); i++) {
                String x = ctx.idlist().ID(i).getText();
                if(memory.containsKey(x)){
                    //System.out.println("i= "+i);
                    String var=x+':';
                    var=var+memory.get(x);
                    //System.out.println(var);
                    try {
                        FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(var);
                        bufferedWriter.newLine();

                        bufferedWriter.close(); // Cierra el BufferedWriter
                        //System.out.println("Texto agregado al archivo correctamente.");
                    } catch (IOException e) {
                        System.out.println("Error al agregar texto al archivo: " + e.getMessage());
                    }
                }
            }

        }
        if(ctx.matrix()!=null){
            ArrayList<ArrayList> matriz = visit(ctx.matrix()).aMatriz();
            if(ctx.INTEGER().size()>=1){
                int indice1= Integer.valueOf(ctx.INTEGER(0).getText());
                int indice2= Integer.valueOf(ctx.INTEGER(1).getText());
                try {
                    FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(matriz.get(indice1).get(indice2).toString());
                    bufferedWriter.newLine(); // Agrega una nueva línea después del texto
                    bufferedWriter.close(); // Cierra el BufferedWriter
                    System.out.println("Texto agregado al archivo correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al agregar texto al archivo: " + e.getMessage());
                }
            }
        }
        if(ctx.arrayexpr()!=null){
            ArrayList<Double> expr= visit(ctx.arrayexpr()).aVector();
            System.out.println(expr);
            try {
                FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(expr.toString());
                bufferedWriter.newLine(); // Agrega una nueva línea después del texto
                bufferedWriter.close(); // Cierra el BufferedWriter
                System.out.println("Texto agregado al archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Error al agregar texto al archivo: " + e.getMessage());
            }
        }
        if(ctx.CADENA(1)!=null){
            try {
                FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String val1= ctx.CADENA(0).getText().replaceAll("\"", "");
                bufferedWriter.write(val1);
                bufferedWriter.newLine(); // Agrega una nueva línea después del texto

                bufferedWriter.close(); // Cierra el BufferedWriter
                System.out.println("Texto agregado al archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Error al agregar texto al archivo: " + e.getMessage());
            }
        }
        if(ctx.array()!=null){
            ArrayList arreglo = visit(ctx.array()).aVector();
            int indice= Integer.valueOf(ctx.INTEGER(0).getText());
            try {
                FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(arreglo.get(indice).toString());
                bufferedWriter.newLine(); // Agrega una nueva línea después del texto
                bufferedWriter.close(); // Cierra el BufferedWriter
                System.out.println("Texto agregado al archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Error al agregar texto al archivo: " + e.getMessage());
            }
        }
        if(ctx.algexpr()!=null){
            try {
                FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro "true" indica que se va a agregar al archivo existente
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(visit(ctx.algexpr()).toString());
                bufferedWriter.newLine(); // Agrega una nueva línea después del texto

                bufferedWriter.close(); // Cierra el BufferedWriter
                System.out.println("Texto agregado al archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Error al agregar texto al archivo: " + e.getMessage());
            }
        }
        return null;
    }
    @Override public Valor visitFread_statement(StarParser.Fread_statementContext ctx) {
        String ruta;
        if(ctx.CADENA().size()>1){
            ruta= ctx.CADENA(1).getText();
        }
        else{
            ruta= ctx.CADENA(0).getText();
        }
        String filePath = ruta.replaceAll("\"", "");
        if(ctx.idlist()!=null){
            for (int i = 0; i < ctx.idlist().ID().size(); i++) {
                String x = ctx.idlist().ID(i).getText();
                if(memory.containsKey(x)){
                    try {
                        FileReader fileReader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        String linea;
                        while ((linea = bufferedReader.readLine()) != null) {
                            String v=String.valueOf(linea.toCharArray()[0]);
                            String value= String.valueOf(linea.toCharArray()[2]);
                            if(v.equals(x)){
                                memory.replace(x,new Valor(value));
                            }
                        }

                        bufferedReader.close(); // Cierra el BufferedReader
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                }else{
                    try {
                        FileReader fileReader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        String linea;
                        while ((linea = bufferedReader.readLine()) != null) {
                            //System.out.println("reader no vacio");
                            String v=String.valueOf(linea.toCharArray()[0]);
                            String value= String.valueOf(linea.toCharArray()[2]);
                            if(x.equals(v)){
                                memory.put(x,new Valor(value));
                            }
                        }

                        bufferedReader.close(); // Cierra el BufferedReader
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                }
            }
        }
        if(ctx.CADENA(1)!=null){
            try {
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }

                bufferedReader.close(); // Cierra el BufferedReader
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
        return null;
    }
    @Override public Valor visitFor_statement(StarParser.For_statementContext ctx) {
        if(ctx.assignment_statement(0)!=null){
            visit(ctx.assignment_statement(0));

        }
        while(visit(ctx.bexpression()).aBoolean()==true){

            if (ctx.statement()!=null){
                visit(ctx.statement());

            }
            if(ctx.assignment_statement(1)!=null){
                visit(ctx.assignment_statement(1));

            }
        }
        return null;
    }
    @Override public Valor visitWhile_statement(StarParser.While_statementContext ctx) {
        while(visit(ctx.bexpression()).aBoolean()==true){
        if (ctx.statement()!=null){
            visit(ctx.statement());

        }
        }
        return null;
    }
    @Override public Valor visitFun_statement(StarParser.Fun_statementContext ctx) {

        FunctionValor funcion = new FunctionValor(null);
        funcion.statement = ctx.statement();
        funcion.tipo = "funcion";
        for (int i = 0; i < ctx.idlist().ID().size(); i++) {
            funcion.parametros.add(ctx.idlist().ID(i).getText());
        }
        funciones.put(ctx.ID().getText(),funcion);

        return new Valor(null);
    }
    @Override public Valor visitBterm1(StarParser.Bterm1Context ctx) {
        Boolean f=false;
        Boolean t=true;
        boolean v1 = false;
        boolean v2 = false;
        if(visit(ctx.bterm()).aBoolean()==true)  v1=t;
        if(visit(ctx.bterm()).aBoolean()==false) v1 =f;
        if(visit(ctx.bfactor()).aBoolean()==true) v2=t;
        if(visit(ctx.bfactor()).aBoolean()==false) v2=f;
        if(v1 && v2) {
            System.out.println(t);
            return new Valor(t);}
        System.out.println(f);
        return new Valor(f);
    }
    @Override public Valor visitBterm2(StarParser.Bterm2Context ctx) {
        return visit(ctx.bfactor());
    }
    @Override public Valor visitBexp1(StarParser.Bexp1Context ctx) {
        Boolean f=false;
        Boolean t=true;
        boolean v1 = false;
        boolean v2 = false;
        if(visit(ctx.bexpression()).aBoolean()==true)  v1=t;
        if(visit(ctx.bexpression()).aBoolean()==false) v1 =f;
        if(visit(ctx.bterm()).aBoolean()==true) v2=t;
        if(visit(ctx.bterm()).aBoolean()==false) v2=f;
        if(v1 || v2) {
            System.out.println(t);
            return new Valor(t);}
        System.out.println(f);
        return new Valor(f);
    }
    @Override public Valor visitBexp2(StarParser.Bexp2Context ctx) {
        return visit(ctx.bterm());
    }

    @Override public Valor visitArray(StarParser.ArrayContext ctx) {
        if(ctx.arrayexpr()!=null){
           // System.out.println(this.visit(ctx.arrayexpr()).aVector());
            return this.visit(ctx.arrayexpr());
        }
        if(ctx.xOperations()!=null){
            // System.out.println(this.visit(ctx.arrayexpr()).aVector());
            return this.visit(ctx.xOperations());
        }
        if(ctx.ID()!=null){
            String id = ctx.ID().getText();
            //System.out.println(arraymemory.get(id));
           return new Valor(arraymemory.get(id));
        }
        else{
            ArrayList<Double> arreglo = new ArrayList<>();
            for (int i=0; i<ctx.algexpr().size();i++){
                arreglo.add(Double.valueOf(visit(ctx.algexpr(i)).toString()));

            }
            return new Valor(arreglo);
        }

    }
    @Override public Valor visitRandomFunction(StarParser.RandomFunctionContext ctx) {
        long valor= Double.valueOf(ctx.REALNUMBER().getText()).longValue();
        Random random = new Random(valor);
        double numeroAleatorio = random.nextDouble();
        System.out.println(numeroAleatorio);
        return new Valor(numeroAleatorio); }
    @Override public Valor visitAssignment_statement(StarParser.Assignment_statementContext ctx) {
        String id = ctx.ID().getText();

        if(ctx.algexpr()!=null){
            Valor value = visit(ctx.algexpr());

            if(memory.containsKey(id)){
                //System.out.println("id ya existente, remplazando");
                memory.replace(id,value);

            }
            else{
                memory.put(id,value);
            }
        }
        if(ctx.CADENA()!=null){

            String val1 = ctx.CADENA().getText().replaceAll("\"", "");

            if(memory.containsKey(id)){
                memory.replace(id,new Valor(val1));
            }
            else {
                // id is left-hand side of '='
                // compute value of expression on right


                memory.put(id,new Valor(val1));
                // System.out.println(val1);
            }
        }
        if(ctx.usefunction()!=null){
           // System.out.println(contador);
            Valor value = visit(ctx.usefunction());
            memory.put(id,value);

            /*
            if(ret){
                ret=false;
                if(memory.containsKey(id)){
                    memory.replace(id,variable);

                }
                else{
                    memory.put(id,variable);
                }
                variable=null;
            }

             */

        }
        if(ctx.matrix()!=null){
            if(matrixmemory.containsKey(id)){
                //System.out.println("id ya existente, remplazando");
                matrixmemory.replace(id,visit(ctx.matrix()).aMatriz());
            }
            else{
                matrixmemory.put(id,visit(ctx.matrix()).aMatriz());
            }

        }
        if(ctx.array()!=null){
            //System.out.println(visit(ctx.array()));
            if(ctx.array().xOperations()!=null){
                if(arraymemory.containsKey(id)){
                    arraymemory.replace(id ,visit(ctx.array().xOperations()).aVector());
                }
                else{
                    //  System.out.println("entro");
                    arraymemory.put(id ,visit(ctx.array().xOperations()).aVector());
                }
                return null;
            }
            if(ctx.array().arrayexpr()!=null){
                if(arraymemory.containsKey(id)){
                    arraymemory.replace(id ,visit(ctx.array()).aVector());
                }
                else{
                  //  System.out.println("entro");
                    arraymemory.put(id ,visit(ctx.array()).aVector());
                }
                return null;
            }
            else{
                if(arraymemory.containsKey(id)){
                    //System.out.println("id ya existente, remplazando");
                    arraymemory.replace(id ,visit(ctx.array()).aVector());
                }
                else{
                    arraymemory.put(id ,visit(ctx.array()).aVector());
                }

            }


        }


return new Valor(null);
    }


    @Override public Valor visitProbFunction(StarParser.ProbFunctionContext ctx) {
        if (ctx.distributionFunction()!=null){
            return this.visit(ctx.distributionFunction());
        }
        if (ctx.randomFunction()!=null){
            return this.visit(ctx.distributionFunction());
        }
        return visitChildren(ctx);
    }
    private static double expTerm(double t, int x) {
        return Math.exp(t * x);
    }
    @Override public Valor visitMomentumGenerationFunction(StarParser.MomentumGenerationFunctionContext ctx) {
        String id= ctx.ID().getText();
        if(gammamemory.get(id)!=null){
            GammaDistribution gammaDistribution = gammamemory.get(id);
            double t= Double.valueOf(ctx.REALNUMBER(0).getText());
            double m = Math.pow(1 - (gammaDistribution.getScale() * t), -gammaDistribution.getShape());
            System.out.println(m);
            return new Valor(m);

        }
        if(geometricmemory.get(id)!=null){
           GeometricDistribution geometricDistribution = geometricmemory.get(id);
            double t= Double.valueOf(ctx.REALNUMBER(1).getText());
            double p= Double.valueOf(ctx.REALNUMBER(2).getText());
            double m = (1 - p) / (1 - p * expTerm(t, 1));
            return new Valor(m);

        }
        if(tmemory.get(id)!=null){
            TDistribution tDistribution = tmemory.get(id);
            double degreesOfFreedom= tDistribution.getDegreesOfFreedom();
            double t= Double.valueOf(ctx.REALNUMBER(0).getText());
            double m = Math.pow(1 + (t * t) / degreesOfFreedom, -((degreesOfFreedom + 1) / 2.0));
            System.out.println(m);
            return new Valor(m); // Segunda muestra de t de Student

        }
        if (chimemory.get(id)!=null){
           ChiSquaredDistribution chiSquaredDistribution = chimemory.get(id);
            double degreesOfFreedom = chiSquaredDistribution.getDegreesOfFreedom(); // Grados de libertad para la distribución chi-cuadrado
            double t= Double.valueOf(ctx.REALNUMBER(0).getText());
            double m = Math.pow(1 - 2 * t, -degreesOfFreedom / 2.0);
            System.out.println(m);
            return new Valor(m);
        }
        if(poissonmemory.get(id)!=null){

            PoissonDistribution pd = poissonmemory.get(id);
            double t= Double.valueOf(ctx.REALNUMBER(0).getText());
            double lambda= Double.valueOf(ctx.REALNUMBER(1).getText());
            double m =  Math.exp(lambda * (expTerm(t, 1) - 1));
            System.out.println(m);
            return new Valor(m);
        }



        if(normalmemory.get(id)!=null){
          NormalDistribution normalDistribution = normalmemory.get(id);
            double mean=normalDistribution.getMean();
            double standardDeviation= normalDistribution.getStandardDeviation();

            double t=Double.valueOf(ctx.REALNUMBER(0).getText());

            double moment = Math.exp(mean + (standardDeviation * t * t) / 2);
            System.out.println(moment);
            return new Valor(moment);
        }
        return null; }

    @Override public Valor visitFamilyDistribution(StarParser.FamilyDistributionContext ctx) {
        String id= ctx.ID().getText();
        if(ctx.GAMMADISTRIBUTION()!=null){
            double shape = Double.valueOf(ctx.REALNUMBER(0).getText()); // Parámetro de forma para la distribución gamma
            double scale = Double.valueOf(ctx.REALNUMBER(1).getText()); // Parámetro de escala para la distribución gamma
            GammaDistribution gammaDistribution = new GammaDistribution(shape, scale);
            gammamemory.put(id ,gammaDistribution);

        }
        if(ctx.GEOMETRICDISTRIBUTION()!=null){
            double successProbability = Double.valueOf(ctx.REALNUMBER(0).getText()); // Probabilidad de éxito para la distribución geométrica
            GeometricDistribution geometricDistribution = new GeometricDistribution(successProbability);
            geometricmemory.put(id,geometricDistribution);

        }
        if(ctx.TDISTRIBUTION()!=null){
            int degreesOfFreedom = Integer.valueOf(ctx.INTEGER().getText()); // Grados de libertad para la distribución t de Student
            TDistribution tDistribution = new TDistribution(degreesOfFreedom);
            tmemory.put(id,tDistribution);

        }
        if (ctx.CHISQUAREDDISTRIBUTION()!=null){
            int degreesOfFreedom = Integer.valueOf(ctx.INTEGER().getText()); // Grados de libertad para la distribución chi-cuadrado
            ChiSquaredDistribution chiSquaredDistribution = new ChiSquaredDistribution(degreesOfFreedom);
            chimemory.put(id ,chiSquaredDistribution);
        }
        if(ctx.POISSONDISTRIBUTION()!=null){
            double lambda=Double.valueOf(ctx.REALNUMBER(0).getText());
            PoissonDistribution pd = new PoissonDistribution(lambda);
            poissonmemory.put(id,pd);
        }
        if(ctx.NORMALDISTRIBUTION()!=null){
            double mean=Double.valueOf(ctx.REALNUMBER(0).getText());
            double standardDeviation= Double.valueOf(ctx.REALNUMBER(1).getText());
            NormalDistribution normalDistribution = new NormalDistribution(mean, standardDeviation);
            normalmemory.put(id,normalDistribution);
                 }
        return null;
    }
    @Override public Valor visitDistributionFunction(StarParser.DistributionFunctionContext ctx) {
         String id= ctx.ID().getText();

        if(gammamemory.get(id)!=null){
            GammaDistribution gammaDistribution = gammamemory.get(id);
            double p= Double.valueOf(ctx.REALNUMBER().getText());
            double cumulative= gammaDistribution.cumulativeProbability(p);
            return new Valor(cumulative);
        }
        if(geometricmemory.get(id)!=null){
            GeometricDistribution geometricDistribution = geometricmemory.get(id);
            int p= Integer.valueOf(ctx.INTEGER().getText());
            double cumulative= geometricDistribution.cumulativeProbability(p);
            return new Valor(cumulative);

        }
        if(tmemory.get(id)!=null){
           TDistribution tDistribution = tmemory.get(id);
           double p= Double.valueOf(ctx.REALNUMBER().getText());
           double cumulative= tDistribution.cumulativeProbability(p);

         return new Valor(cumulative); // Segunda muestra de t de Student

       }
       if (chimemory.get(id)!=null){
           ChiSquaredDistribution chiSquaredDistribution = chimemory.get(id);
           double p= Double.valueOf(ctx.REALNUMBER().getText());
           double cumulative= chiSquaredDistribution.cumulativeProbability(p);
           return new Valor(cumulative);
       }
        if(poissonmemory.get(id)!=null){
            PoissonDistribution pd = poissonmemory.get(id);
            int p= Integer.valueOf(ctx.INTEGER().getText());
            double cumulative= pd.cumulativeProbability(p);
            return new Valor(cumulative);
        }


        if(normalmemory.get(id)!=null){
            NormalDistribution normalDistribution = normalmemory.get(id);
            double p=Double.valueOf(ctx.REALNUMBER().getText());
            double cumulative=normalDistribution.cumulativeProbability(p);
            return new Valor(cumulative);
        }
        return null; }
    @Override public Valor visitStringOp(StarParser.StringOpContext ctx) {
        if(ctx.TOARRAY()!=null){
            String id = ctx.ID(0).getText();
            String value=memory.get(id).toString();
            char[] charArray = value.toCharArray();
            ArrayList charList = new ArrayList<>();
            for(char c: charArray){
                charList.add(c);
                System.out.println(c);
            }
            return new Valor(charList);
        }
        if(ctx.LENGTH()!=null){
            String id = ctx.ID(0).getText();
            String value=memory.get(id).toString();
            int size = value.length();
            System.out.println(size);
            return new Valor(size);

        }
        if(ctx.CONCAT()!=null){
            String id1= ctx.ID(0).getText();
            String id2= ctx.ID(1).getText();
            String value1=memory.get(id1).toString();
            String value2=memory.get(id2).toString();
            String result= value1.concat(value2);
            System.out.println(result);
            return new Valor (result);
        }
        if(ctx.SUBSTRING()!=null){
            String id1= ctx.ID(0).getText();
            String value1=memory.get(id1).toString();
            int left = Integer.valueOf(ctx.INTEGER(0).getText());
            int right = Integer.valueOf(ctx.INTEGER(1).getText());
            String substr= value1.substring(left,right);
            System.out.println(substr);
            return new Valor(substr);
        }
        if(ctx.REPLACE()!=null){
            String id1= ctx.ID(0).getText();
            String value1=memory.get(id1).toString();
            String cadena1 = ctx.CADENA(0).getText().replaceAll("\"", "");
            String cadena2 = ctx.CADENA(1).getText().replaceAll("\"", "");
            String result= value1.replace(cadena1, cadena2);
            System.out.println(result);
            return new Valor(result);
        }

        return visitChildren(ctx);
    }


    @Override public Valor visitAssign(StarParser.AssignContext ctx) {
        return visit(ctx.assignment_statement()); }
    @Override
    public Valor visitParenthesis(StarParser.ParenthesisContext ctx) {
        return visit(ctx.algexpr());

    }
    @Override public Valor visitLambdaFamily(StarParser.LambdaFamilyContext ctx) {

        if(ctx.DENSITY()!=null){
            double x= Double.valueOf(ctx.REALNUMBER(0).getText());
            double lambda1= Double.valueOf(ctx.REALNUMBER(1).getText());
            double lambda2= Double.valueOf(ctx.REALNUMBER(2).getText());
            double lambda3= Double.valueOf(ctx.REALNUMBER(3).getText());
            double lambda4= Double.valueOf(ctx.REALNUMBER(4).getText());
            double exp1= lambda3*Math.pow(x, lambda3 -1);
            double exp2= lambda4*Math.pow(1-x,lambda4-1);
            double bexp1= Math.pow(x, lambda3);
            double bexp2= Math.pow(1-x,lambda4);
            double res2= ((bexp1-bexp2)/lambda2);
            double expx=lambda1+res2;
            System.out.println(expx);
            return new Valor(expx);
        }
        if(ctx.PERCENTIL()!=null){
            double x= Double.valueOf(ctx.REALNUMBER(0).getText()); //staticx
            double lambda1= Double.valueOf(ctx.REALNUMBER(1).getText());
            double lambda2= Double.valueOf(ctx.REALNUMBER(2).getText());
            double lambda3= Double.valueOf(ctx.REALNUMBER(3).getText());
            double lambda4= Double.valueOf(ctx.REALNUMBER(4).getText());
            GFG xd= new GFG() ;
            double x0=5;
            double u=xd.newtonRaphson(x0,x,lambda1,lambda2,lambda3,lambda4);
            double exp1= lambda3*Math.pow(u, lambda3 -1);
            double exp2= lambda4*Math.pow(1-u,lambda4-1);
            double bexp1= lambda3*Math.pow(u, lambda3);
            double bexp2= lambda4*Math.pow(1-u,lambda4);
            double res2= lambda1+((bexp1-bexp2)/lambda2);
            // System.out.println(exp1);
            double res= (lambda2)/(exp1+exp2);
            System.out.println(res);
            System.out.println(res2);
            return new Valor(res);

        }
        return null;
    }
    @Override public Valor visitDensityFunction(StarParser.DensityFunctionContext ctx) {
        String id= ctx.ID().getText();
        if(normalmemory.get(id)!=null){
         NormalDistribution normalDistribution = normalmemory.get(id);
            double density= Double.valueOf(ctx.REALNUMBER().getText());
           // System.out.println(density);
            return new Valor( normalDistribution.density(density));
        }
        if(tmemory.get(id)!=null){
            TDistribution tDistribution = tmemory.get(id);
            double density= Double.valueOf(ctx.REALNUMBER().getText());
            return new Valor (tDistribution.density(density));
        }
        if(chimemory.get(id)!=null){
            ChiSquaredDistribution chiSquaredDistribution = chimemory.get(id);
            double density = Double.valueOf(ctx.REALNUMBER().getText());
            return new Valor(chiSquaredDistribution.density(density));
        }
        if(poissonmemory.get(id)!=null){
            int density= Integer.valueOf(ctx.REALNUMBER().getText());
            PoissonDistribution poissonDistribution = poissonmemory.get(id);
            double maxK = poissonDistribution.probability(density);
            return new Valor(maxK);
        }
        if(geometricmemory.get(id)!=null){
          GeometricDistribution geometricDistribution = geometricmemory.get(id);
            int density= Integer.valueOf(ctx.REALNUMBER().getText());
            double maxK = geometricDistribution.probability(density);
            return new Valor(maxK);

        }
        if(gammamemory!=null){
           GammaDistribution gammaDistribution = gammamemory.get(id);
            double density= Double.valueOf(ctx.REALNUMBER().getText());
            double density2 = gammaDistribution.density(density);
            return new Valor(density2);

        }

        return null;
    }
    @Override public Valor visitPercentilFunction(StarParser.PercentilFunctionContext ctx) {
        String id= ctx.ID().getText();
        if(normalmemory.get(id)!=null){
            NormalDistribution normalDistribution = normalmemory.get(id);
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            return new Valor(normalDistribution.inverseCumulativeProbability(confidenceLevel));
        }
        if(tmemory.get(id)!=null){
            TDistribution tDistribution = tmemory.get(id);
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            return new Valor (tDistribution.inverseCumulativeProbability(1.0 - (1.0 - confidenceLevel) / 2.0));
        }
        if(chimemory.get(id)!=null){
          ChiSquaredDistribution chiSquaredDistribution = chimemory.get(id);
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            return new Valor(chiSquaredDistribution.inverseCumulativeProbability(1.0- confidenceLevel));
        }
        if(poissonmemory.get(id)!=null){
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            PoissonDistribution poissonDistribution = poissonmemory.get(id);
            int maxK = poissonDistribution.inverseCumulativeProbability(1 - confidenceLevel);
            double percentile = poissonDistribution.probability(maxK);
            return new Valor(percentile);
        }
        if(geometricmemory.get(id)!=null){
          GeometricDistribution geometricDistribution = geometricmemory.get(id);
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            int maxK = geometricDistribution.inverseCumulativeProbability(1 - confidenceLevel);
            double percentile = geometricDistribution.probability(maxK);
            return new Valor(percentile);
        }
        if(gammamemory.get(id)!=null){
            GammaDistribution gammaDistribution = gammamemory.get(id);
            double confidenceLevel= Double.valueOf(ctx.REALNUMBER().getText());
            double percentile = gammaDistribution.inverseCumulativeProbability(confidenceLevel);
            return new Valor(percentile);
        }
        return null;
    }
    @Override public Valor visitTrigFunction(StarParser.TrigFunctionContext ctx) {
        Double arg= Double.valueOf(visit(ctx.algexpr()).toString());
        if(ctx.SIN()!=null){
            return new Valor(Math.sin(arg));
        }
        if(ctx.COS()!=null){
            return new Valor(Math.cos(arg));
        }
        if(ctx.TAN()!=null){
            return new Valor(Math.tan(arg));
        }
        if(ctx.ARCSIN()!=null){
            return new Valor(Math.asin(arg));
        }
        if(ctx.ACOS()!=null){
            return new Valor(Math.acos(arg));
        }
        if(ctx.ARCTAN()!=null){
            return new Valor(Math.atan(arg));
        }
        if(ctx.SINH()!=null){
            return new Valor(Math.sinh(arg));
        }
        if(ctx.COSH()!=null){
            return new Valor(Math.cosh(arg));
        }
        if(ctx.TANH()!=null){
            return new Valor(Math.tanh(arg));
        }
        return null;
    }
    @Override public Valor visitTrigf(StarParser.TrigfContext ctx) {

        return visit(ctx.function());
    }
    @Override
    public Valor visitPrintExpr(StarParser.PrintExprContext ctx) {
        Valor value = visit(ctx.algexpr()); // evaluate the expr child
        System.out.println(Double.valueOf(value.toString()));         // print the result
        return value;                          // return dummy value
    }
    @Override public Valor visitArrayexpr(StarParser.ArrayexprContext ctx) {
        ArrayList<Double> ar1 = visit(ctx.array(0)).aVector();
        if(ctx.ARRAYSIZE()!=null){
            ArrayList<Double> suma = new ArrayList<>();
            double res= ar1.size();
            suma.add(res);
            return new Valor(suma);
        }
        ArrayList<Double> ar2 = visit(ctx.array(1)).aVector();


        if(ctx.ARRAYADD()!=null){
            if (ar1.size() == ar2.size()) {
                ArrayList<Double> suma = new ArrayList<>();

                // Realizar la suma de los elementos correspondientes
                for (int i = 0; i < ar1.size(); i++) {
                    suma.add(ar1.get(i) + ar2.get(i));
                }
                return new Valor(suma);

            } else {
                System.out.println("Los vectores no tienen la misma longitud.");
            }

        }
        if(ctx.ARRAYSUBS()!=null){
            if (ar1.size() == ar2.size()) {
                ArrayList<Double> resta = new ArrayList<>();

                // Realizar la suma de los elementos correspondientes
                for (int i = 0; i < ar1.size(); i++) {
                    resta.add(ar1.get(i) - ar2.get(i));
                }
                return new Valor(resta);

            } else {
                System.out.println("Los vectores no tienen la misma longitud.");
            }

        }
        if(ctx.ARRAYDOT()!=null){
            if (ar1.size() == ar2.size()) {
                double productoPunto = 0.0;

                // Calcular el producto punto
                for (int i = 0; i < ar1.size(); i++) {
                    productoPunto += ar1.get(i) * ar2.get(i);
                }
                ArrayList<Double> punto= new ArrayList<Double>();
                punto.add(productoPunto);
                return new Valor(punto);

            } else {
                System.out.println("Los vectores no tienen la misma longitud.");
                 }
        }
        if(ctx.ARRAYCROSS()!=null){
                if (ar1.size() == 3 && ar2.size() == 3) {
                ArrayList<Double> productoCruz = new ArrayList<>();
                // Calcular el producto cruz
                productoCruz.add(ar1.get(1) * ar2.get(2) - ar1.get(2) * ar2.get(1));
                productoCruz.add(ar1.get(2) * ar2.get(0) - ar1.get(0) * ar2.get(2));
                productoCruz.add(ar1.get(0) * ar2.get(1) - ar1.get(1) * ar2.get(0));

                // Imprimir el producto cruz

                return new Valor(productoCruz);
            } else {
                System.out.println("Los vectores no son de 3 dimensiones.");
            }
        }
        return null; }
    int usarfuncion=0;
    @Override public Valor visitUsefunction(StarParser.UsefunctionContext ctx) {
        usarfuncion++;
        String id=ctx.ID().getText();
        FunctionValor funcion = funciones.get(id);
        if(ctx.algexpr()!=null){
            for (int i = 0; i <  funcion.parametros.size(); i++) {
              // System.out.println("parametros not null");
               memory.put(funcion.parametros.get(i) , new Valor(visit(ctx.algexpr(i))));
               //System.out.print(funcion.parametros.get(i).toString() +':' + ctx.algexpr(i).getText() + " ");
           }
           //System.out.println();
       }
       if(ctx.idlist()!=null){
           for (int i = 0; i < ctx.idlist().ID().size(); i++) {
                memory.put(funcion.parametros.get(i),new Valor(memory.get(ctx.idlist().ID(i))));
           }

       }
        return new Valor(visit(funcion.statement));
    }

    @Override public Valor visitRead_statement(StarParser.Read_statementContext ctx) {

        if(ctx.idlist()!=null){
            for (int i = 0; i < ctx.idlist().ID().size(); i++) {
                String x = ctx.idlist().ID(i).getText();
                if(memory.containsKey(x)){
                    try{
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        memory.replace(x, new Valor(reader.readLine()));
                    }
                    catch(IOException e){
                        System.out.println("error");                    }
                }else{
                    try{
                        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(System.in));
                        memory.put(x, new Valor(reader.readLine()));
                    }
                    catch(IOException e){
                        System.out.println("error");
                    }
                }


            }

        }
        if(ctx.CADENA()!=null){
            String filePathraw = ctx.CADENA().getText();
            String filePath = filePathraw.replaceAll("\"", "");
            System.out.println(filePath);
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                String total="";
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    total=total+line;
                }
           return new Valor(total);
        }
            catch(IOException e){
                System.out.println("error leyendo archivo");
            }
        }

        return null;
    }
    @Override public Valor visitMatrix(StarParser.MatrixContext ctx) {
        if(ctx.ID()!=null){
           return new Valor(matrixmemory.get(ctx.ID().getText()));
        }
        else{
          //  System.out.println("matriz visitado, "+ ctx.array().size());
            ArrayList<ArrayList> matrix = new ArrayList<ArrayList>();
            for (int i=0; i<ctx.array().size();i++){
                // visit(ctx.array(i));
                matrix.add(visit(ctx.array(i)).aVector());
            }
            return new Valor(matrix);
        }

    }
    @Override public Valor visitFunction(StarParser.FunctionContext ctx) {
       // System.out.println("funcion visitada");
        if(ctx.usefunction()!=null){
            return new Valor(visit(ctx.usefunction()));
        }
        if(ctx.mathFunction()!=null){
            return new Valor(visit(ctx.mathFunction()));
        }

        return null;
    }
    @Override public Valor visitMathFunction(StarParser.MathFunctionContext ctx) {
        if(ctx.logFunction()!=null){
            return new Valor(visit(ctx.logFunction()));
        }
        if(ctx.trigFunction()!=null){
            return new Valor(visit(ctx.trigFunction()));
        }
        if(ctx.probFunction()!=null){
            return new Valor(visit(ctx.probFunction()));
        }
        return null;
    }
    @Override public Valor visitLogFunction(StarParser.LogFunctionContext ctx) {
        Double valore = Double.valueOf(visit(ctx.algexpr()).toString());
        return new Valor(Math.log(valore));
    }
    @Override public Valor visitWrite_statement(StarParser.Write_statementContext ctx) {
        //System.out.println("write visitado");

        if(ctx.array()!=null){
            ArrayList arreglo = visit(ctx.array()).aVector();
            int indice= Integer.valueOf(ctx.INTEGER(0).getText());
            System.out.println(arreglo.get(indice));
            return null;
        }
       
        if(ctx.arrayexpr()!=null){
            ArrayList<Double> expr= visit(ctx.arrayexpr()).aVector();
            System.out.println(expr);
            return null;
        }
        if(ctx.usefunction()!=null){
            System.out.println("aca");
            System.out.println(visit(ctx.usefunction()).toString());
            return null;
        }
        if(ctx.matrix()!=null){
            ArrayList<ArrayList> matriz = visit(ctx.matrix()).aMatriz();
            if(ctx.INTEGER().size()>=1){
                int indice1= Integer.valueOf(ctx.INTEGER(0).getText());
                int indice2= Integer.valueOf(ctx.INTEGER(1).getText());
                System.out.println(matriz.get(indice1).get(indice2));
            }
        return null;
        }
        if(ctx.algexpr()!=null){
            Double val1= Double.valueOf(visit(ctx.algexpr()).toString());
            System.out.println(val1);
        }
        if(ctx.CADENA()!=null){
            String val1= ctx.CADENA().getText().replaceAll("\"", "");
            System.out.println(val1);
        }
        if(ctx.idlist()!=null){
          //  System.out.println("entro idlist");
            for (int i = 0; i < ctx.idlist().ID().size(); i++) {
                String x = ctx.idlist().ID(i).getText();
                if(memory.containsKey(x)){
                    System.out.print(x + ':');
                    System.out.println(memory.get(x));}
                if(arraymemory.containsKey(x)){
                    System.out.print(x + ':');
                    System.out.println(arraymemory.get(x));}
                }

            }
           return new Valor(null);
    }
    // Visit type
    @Override public Valor visitTipoInt(StarParser.TipoIntContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Valor visitTipoFloat(StarParser.TipoFloatContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Valor visitTipoVector(StarParser.TipoVectorContext ctx) {
        return visitChildren(ctx);
    }
    @Override public Valor visitStatement(StarParser.StatementContext ctx) {
        if (ctx.read_statement() != null) {
            return this.visit(ctx.read_statement());
        }
        if (ctx.write_statement() != null) {
           // System.out.println("write visitado");
            return this.visit(ctx.write_statement());
        }
        if (ctx.fwrite_statement() != null) {
            // System.out.println("write visitado");
            return this.visit(ctx.fwrite_statement());
        }
        if (ctx.fread_statement() != null) {
            // System.out.println("write visitado");
            return this.visit(ctx.fread_statement());
        }
        if (ctx.while_statement()!=null) {
            return this.visit(ctx.while_statement());
        }

        if (ctx.if_statement()!=null) {
            //System.out.println(visit(ctx.if_statement()));
           return new Valor(visit(ctx.if_statement()));
        }
        if (ctx.for_statement()!=null) {
           return this.visit(ctx.for_statement());
        }

        if (ctx.fun_statement()!=null) {
            return this.visit(ctx.fun_statement());
        }
        if (ctx.usefunction()!=null) {
           return this.visit(ctx.usefunction());
        }
        if (ctx.assignment_statement() != null) {
            return new Valor(visit(ctx.assignment_statement()));
            //return this.visit(ctx.assignment_statement());
        }
        if (ctx.return_statement() != null) {

           return new Valor(visit(ctx.return_statement()));
            //return this.visit(ctx.return_statement());
        }

        if (ctx.algexpr() != null) {
            // System.out.println("stat no nulo");
            return this.visit(ctx.algexpr());
        }
        if (ctx.arrayexpr() != null) {
            // System.out.println("stat no nulo");
            return this.visit(ctx.arrayexpr());
        }
        if (ctx.block() != null) {
           return this.visit(ctx.block());
        }


        return visit(ctx); }
    @Override public Valor visitBlock(StarParser.BlockContext ctx) {
        Valor resultado=null;
        if(ctx.statement()!=null){
            for (int i=0; i<ctx.statement().size();i++){

             visit(ctx.statement(i));



            }
        }
        if(ret){return variable;}
        return null;
         }
    @Override
    public Valor visitNegation(StarParser.NegationContext ctx) {
        return new Valor(Double.valueOf(visit(ctx.algexpr()).toString())*-1 ); }

    @Override
    public Valor visitNumber(StarParser.NumberContext ctx) {
        Valor total= new Valor(Double.valueOf(ctx.REALNUMBER().getText()));
        return total;
    }
    @Override public Valor visitId(StarParser.IdContext ctx) {
       // System.out.println("id visitado");
        String id = ctx.ID().getText();
        if(ctx.INTEGER()!=null){
            if(arraymemory.containsKey(id)){
               return new Valor(arraymemory.get(id).get(Integer.valueOf(ctx.INTEGER().getText())));
            }
        }
        if ( memory.containsKey(id) ) return new Valor(memory.get(id));
       return new Valor(id);
    }
    @Override public Valor visitReturn_statement(StarParser.Return_statementContext ctx) {
        ret=true;

          //System.out.println("return visitado");
        if(ctx.usefunction()!=null){
           // variable= visit(ctx.usefunction());
            return new Valor(visit(ctx.usefunction()));


        }
        if(ctx.algexpr()!=null){
            if(variable!=null){
                contador++;
               // return new Valor(variable.aDouble()*contador);
            }
            //ret=true;
            variable= visit(ctx.algexpr());
            return this.visit(ctx.algexpr());
        }

       // System.out.println(variable);
      //  return new Valor (visit(ctx.algexpr()));
      return new Valor(0);
    }
    @Override public Valor visitMulDiv(StarParser.MulDivContext ctx) {
        Valor izq = new Valor((visit(ctx.algexpr(0)).toString()));
        Valor der = new Valor((visit(ctx.algexpr(1)).toString()));
        Double left ;
        Double right;
        if(memory.containsKey(izq)){
            left = Double.valueOf(memory.get(izq).toString());
        }
        else{
            left = Double.valueOf(izq.toString());
        }
        if(memory.containsKey(der)){
            right = Double.valueOf(memory.get(der).toString());
        }
        else{
            right = Double.valueOf(visit(ctx.algexpr(1)).toString());
        }

        Valor total;
        if ( ctx.op.getType() == StarParser.MULT ) return total=new Valor(left * right);

        return total=new Valor(left / right); }

    @Override public Valor visitAddSub(StarParser.AddSubContext ctx) {
        Valor izq = new Valor((visit(ctx.algexpr(0)).toString()));
        Valor der = new Valor((visit(ctx.algexpr(1)).toString()));
        Double left ;
        Double right;

        if(memory.containsKey(izq)){
            left = Double.valueOf(memory.get(izq).toString());
        }
        else{
            left = Double.valueOf(izq.toString());
        }
        if(memory.containsKey(der)){
            right = Double.valueOf(memory.get(der).toString());
        }
        else{
            right = Double.valueOf(visit(ctx.algexpr(1)).toString());
        }
        Valor total;
        if ( ctx.op.getType() == StarParser.ADD ) return total=new Valor(left + right);
        return total=new Valor(left - right);  }

    @Override public Valor visitPowerRoot(StarParser.PowerRootContext ctx) {
        Valor izq = new Valor((visit(ctx.algexpr(0)).toString()));
        Valor der = new Valor((visit(ctx.algexpr(1)).toString()));
        Double left ;
        Double right;
        if(memory.containsKey(izq)){
            left = Double.valueOf(memory.get(izq).toString());
        }
        else{
            left = Double.valueOf(izq.toString());
        }
        if(memory.containsKey(der)){
            right = Double.valueOf(memory.get(der).toString());
        }
        else{
            right = Double.valueOf(visit(ctx.algexpr(1)).toString());
        }
        Valor total;
        return total=new Valor(Math.pow(left,right));
        }


    @Override public Valor visitENT(StarParser.ENTContext ctx)
    {   Valor total=new Valor(Integer.valueOf(ctx.INTEGER().getText()));
        return total;

    }
}