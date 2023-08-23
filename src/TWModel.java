import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TWModel {
    private double alpha;
    private ArrayList<Double> efectosTratamientos;
    private ArrayList<Double> efectosBloques;
    private ArrayList<double[]> matrizDatos;
    private Object[][] matrizConDatos; //modelo dos vias
    private Object[][] matrizR; //modelo dos vias
    private int [] vectorC;
    private ArrayList<ArrayList> vectoresC= new ArrayList<>();

    public TWModel(double alpha, ArrayList<Double> efectosTratamientos,
                   ArrayList<Double> efectosBloques,
                   ArrayList<double[]> matrizDatos) {

        this.alpha = alpha;
        this.efectosTratamientos = efectosTratamientos;
        this.efectosBloques = efectosBloques;
        this.matrizDatos = matrizDatos;
        //this.matrizConDatos = crearMatrizConDatos();
       // this.matrizR=crearMatrizR();
    }
    public Object[][] getMatrizConDatos() {
        return matrizConDatos;
    }



    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public ArrayList<Double> getEfectosTratamientos() {
        return efectosTratamientos;
    }

    public void setEfectosTratamientos(ArrayList<Double> efectosTratamientos) {
        this.efectosTratamientos = efectosTratamientos;
    }

    public ArrayList<Double> getEfectosBloques() {
        return efectosBloques;
    }

    public void setEfectosBloques(ArrayList<Double> efectosBloques) {
        this.efectosBloques = efectosBloques;
    }

    public ArrayList<double[]> getMatrizDatos() {
        return matrizDatos;
    }

    public void setMatrizDatos(ArrayList<double[]> matrizDatos) {
        this.matrizDatos = matrizDatos;
    }

    public void imprimirMatrizConDatos() {
        for (Object[] fila : matrizConDatos) {
            for (Object objeto : fila) {
                System.out.print("[ ");
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        System.out.print(valor + " ");
                    }
                }
                System.out.print(" ]");
            }
            System.out.println();
        }
    }
    public void imprimirMatrizR() {
        for (Object[] fila : matrizR) {
            for (Object objeto : fila) {
                System.out.print("[ ");
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        System.out.print(valor + " ");
                    }
                } else {
                    System.out.print(objeto + " ");
                }
                System.out.print(" ]");
            }
            System.out.println();
        }
    }
    public int calcularNumeroTotalDatosTratamiento(int tratamiento) {
        if (tratamiento < 0 || tratamiento >= efectosTratamientos.size()) {
            return 0;
        }


        int contador = 0;
        for (Object[] fila : matrizConDatos) {
            Object objeto = fila[tratamiento];
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                contador += arreglo.length;
            } else {
                contador++;
            }
        }
        return contador;
    }
    public ArrayList<Double> obtenerDatosTratamiento(int tratamiento) {
        ArrayList<Double> datos = new ArrayList<>();
        if (tratamiento < 0 || tratamiento >= efectosTratamientos.size()) {
            return datos;
        }
        for (Object[] fila : matrizConDatos) {
            Object objeto = fila[tratamiento];
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    datos.add(valor);
                }
            }

        }
        return datos;
    }
    public ArrayList<Double> obtenerDatosTratamientoMatrizR(int tratamiento) {
        ArrayList<Double> datos = new ArrayList<>();
        if (tratamiento < 0 || tratamiento >= efectosTratamientos.size()) {
            return datos;
        }
        for (Object[] fila : matrizR) {
            Object objeto = fila[tratamiento];
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    datos.add(valor);
                }
            }

        }
        return datos;
    }
    public ArrayList<Double> obtenerDatosBloque(int bloque) {
        ArrayList<Double> datos = new ArrayList<>();
        if (bloque < 0 || bloque >= efectosBloques.size()) {
            return datos;
        }
        Object[] fila = matrizConDatos[bloque];
        for (Object objeto : fila) {
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    datos.add(valor);
                }

        }
    }
        return datos;
    }
    public ArrayList<Double> obtenerDatosBloqueMatrizR(int bloque) {
        ArrayList<Double> datos = new ArrayList<>();
        if (bloque < 0 || bloque >= efectosBloques.size()) {
            return datos;
        }
        Object[] fila = matrizR[bloque];
        for (Object objeto : fila) {
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    datos.add(valor);
                }

            }
        }
        return datos;
    }

    public int[] obtenerDatoBloque(double dato, int bloque)  {
        int[] ubicacion = new int[3];
        if (bloque < 0 || bloque >= efectosBloques.size()) {
            return ubicacion;
        }
        Object[] fila = matrizConDatos[bloque];
        int i=bloque;
        int j=0;

        for (Object objeto : fila) {

            int k=0;
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {

                   if(valor==dato){
                      // System.out.println("encontrado");
                       ubicacion[0]=i;
                       ubicacion[1]=j;
                       ubicacion[2]=k;
                       k++;
                       return ubicacion;
                   }
                    k++;
                }

            }
            j++;
        }
        return ubicacion;
    }


        // Si no se encuentra el dato en el bloque, se devuelve una ubicación inválida (-1, -1)
    public int rachasHastaDatoVectorC(ArrayList<Integer> c, int pos){
        if(pos>=c.size()){
            System.out.println("index error");
            return 0;
        }
        int rachas=1;
        int temp=c.get(0);
        for(int i=1;i<=pos;i++){
            if(rachas==0){
                rachas++;
            }
            if(!(temp==c.get(i))){
                    rachas++;
                    temp=c.get(i);
                }
        }
        return rachas;
    }
    public static int encontrarPosicion(ArrayList<Double> lista, double numero) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == numero) {
                return i;
            }
        }
        System.out.println("dato no esta en el arreglo");
        return -1;  // Devolver -1 si el número no se encuentra en el arreglo
    }

    public ArrayList<ArrayList> transformacionvectorCamatrizR(){
        int numFilas = efectosBloques.size();
        int numColumnas = efectosTratamientos.size();
        ArrayList<ArrayList> total = new ArrayList<>();
        for (int i=0; i<efectosBloques.size();i++){
            int k=0;
            ArrayList<Double> datos =obtenerDatosBloque(i);
            ArrayList<Double> datosOrdenados=obtenerDatosBloque(i);
            Collections.sort(datosOrdenados);
            System.out.println(datos);
            System.out.print("vector x:");
            System.out.println(datosOrdenados);
            ArrayList<Integer> c = new ArrayList<>();
            System.out.print("vector c:[");
            for(Double numero: datosOrdenados){
                //System.out.println(datos.get(k));
                int[] location =obtenerDatoBloque(datosOrdenados.get(k),i);
                c.add(location[1]);
                System.out.print(c.get(k));
                System.out.print(" ");
               /* System.out.print(location[0]);
                System.out.print(" ");
                System.out.print(location[1]);
                System.out.print(" ");
                System.out.print(location[2]);
                System.out.println(); */
                k++;

            }

            vectoresC.add(c);

            System.out.print("]");
            System.out.println();
            ArrayList<Integer> arreglo= new ArrayList<Integer>();

            for(double dato: datos){
                int pos=encontrarPosicion(datosOrdenados,dato);
                arreglo.add(rachasHastaDatoVectorC(c,pos));
                // System.out.println("dato: " +dato+" localizacion en x:"+pos)

            }

            total.add(arreglo);



        }

        return total;
    }
    public ArrayList encontrarCi(int i){
        return vectoresC.get(i);
    }
    public double datoMatrizR(int i, int j, int k){
        int n=0;
        double[] arreglo = (double[]) matrizR[i][j];
        for(double numero:arreglo){
            if(n==k){
                return numero;
            }
           n++;
        }

        return 0;
            }
    public double datoMatrizN(int i, int j, int k){
        int n=0;
        double[] arreglo = (double[]) matrizConDatos[i][j];
        for(double numero:arreglo){
            if(n==k){
                return numero;
            }
            n++;
        }

        return 0;
    }
    public double sumaijPunto(int i, int j){
     double total=0;
        double[] arreglo = (double[]) matrizR[i][j];
        //System.out.println(arreglo.length);
       for(double numero:arreglo){
           total=total+numero;
       }
        return total;
    }
    public double matrizNsumaijPunto(int i, int j){
        double total=0;
        double[] arreglo = (double[]) matrizConDatos[i][j];
        for(double numero:arreglo){
            total=total+numero;
        }
        return total;
    }
    public double sumaiPuntoPunto(int i){
        double total=0;
        Object[] fila= matrizR[i];
        for (Object objeto : fila) {
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    total=total+valor;
                }
            }
        }
        return total;
    }
    public double matrizNsumaiPuntoPunto(int i){
        double total=0;
        Object[] fila= matrizConDatos[i];
        for (Object objeto : fila) {
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (double valor : arreglo) {
                    total=total+valor;
                }
            }
        }
        return total;
    }
    public double promedioiPuntoPunto(int i){
        Object [] fila= matrizR[i];
       return sumaiPuntoPunto(i)/fila.length;

    }
    public double matrizNpromedioiPuntoPunto(int i){
        Object [] fila= matrizConDatos[i];
        return matrizNsumaiPuntoPunto(i)/fila.length;

    }
    public double promedioPuntojPunto(int j){

        return puntojPunto(j)/matrizR.length;

    }
    public double matrizNpromedioPuntojPunto(int j){

        return matrizNpuntojPunto(j)/matrizConDatos.length;

    }
    public double puntojPunto(int j){
        double total=0;
        for (Object[] fila : matrizR) {
             Object objeto=fila[j];
             if (objeto instanceof double[]) {
                 double[] arreglo = (double[]) objeto;
                    for (int i=0;i<arreglo.length;i++) {
                        total=total+arreglo[i];
                    }
                }
        }
        return total;
    }
    public double matrizNpuntojPunto(int j){
        double total=0;
        for (Object[] fila : matrizConDatos) {
            Object objeto=fila[j];
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                for (int i=0;i<arreglo.length;i++) {
                    total=total+arreglo[i];
                }
            }
        }
        return total;
    }
    public double sumaRachasModeloTotal(){
       double total=0;
        for (Object[] fila : matrizR) {
            for (Object objeto : fila) {
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        total=total+valor;
                    }
                }
            }
        }
        return total;
    }
    public double matrizNsumaRachasModeloTotal(){
        double total=0;
        for (Object[] fila : matrizConDatos) {
            for (Object objeto : fila) {
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        total=total+valor;
                    }
                }
            }
        }
        return total;
    }
    public double promedioTotalRachasModelo(){
        return sumaRachasModeloTotal()/calcularNumeroTotalDatos();
    }
    public double matrizNpromedioTotalRachasModelo(){
        return matrizNsumaRachasModeloTotal()/calcularNumeroTotalDatos();
    }
    public double promedioSumaijPunto(int i, int j){
        double total=0;
        double[] arreglo = (double[]) matrizR[i][j];
        //System.out.println(arreglo.length);
        for(double numero:arreglo){
            total=total+numero;
        }
        return total/arreglo.length;
    }
    public double promedioNSumaijPunto(int i, int j){
        double total=0;
        double[] arreglo = (double[]) matrizConDatos[i][j];
        //System.out.println(arreglo.length);
        for(double numero:arreglo){
            total=total+numero;
        }
        return total/arreglo.length;
    }
    public Object[][] crearMatrizR() {
        int numFilas = efectosBloques.size();
        int numColumnas = efectosTratamientos.size();
        Object[][] matriz = new Object[numFilas][numColumnas];
        ArrayList<ArrayList> arreglos= transformacionvectorCamatrizR();

        ArrayList<Double> totalpasarR= new ArrayList<>();
        for (ArrayList<Integer> innerList : arreglos) {
            for (Integer number : innerList) {
                totalpasarR.add(Double.valueOf(number));
            }
        }

        //System.out.println(totalpasarR);
        int count=0;
        ArrayList<double[]> matrizDato = new ArrayList<>();
        for( double[] arr:matrizDatos){
            matrizDato.add(arr.clone());
        }

       // System.out.println(matrizDato.size());
         for(int i=0; i<matrizDato.size(); i++){
             for (int j=0; j<matrizDato.get(i).length; j++){
                 matrizDato.get(i)[j]=totalpasarR.get(count);
                 count++;

             }
         }

         int g=0;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz[i][j] = matrizDato.get(g);
                g++;
            }
        }
        matrizR=matriz;
        return matriz;
    }
    public ArrayList<Double> obtenerDatosMatriz() {
        ArrayList<Double> datos = new ArrayList<>();

        for (Object[] fila : matrizConDatos) {
            for (Object objeto : fila) {
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        datos.add(valor);
                    }
                }
            }
        }

        return datos;
    }
    public ArrayList<Double> obtenerDatosMatrizR() {
        ArrayList<Double> datos = new ArrayList<>();

        for (Object[] fila : matrizR) {
            for (Object objeto : fila) {
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    for (double valor : arreglo) {
                        datos.add(valor);
                    }
                }
            }
        }

        return datos;
    }
    public int calcularNumeroTotalDatosBloque(int bloque) {
        if (bloque < 0 || bloque >= efectosBloques.size()) {
            return 0;
        }

        int contador = 0;
        Object[] fila = matrizConDatos[bloque];
        for (Object objeto : fila) {
            if (objeto instanceof double[]) {
                double[] arreglo = (double[]) objeto;
                contador += arreglo.length;
            } else {
                contador++;
            }
        }
        return contador;
    }
    public int calcularNumeroTotalDatos() {
        int contador = 0;
        for (Object[] fila : matrizConDatos) {
            for (Object objeto : fila) {
                if (objeto instanceof double[]) {
                    double[] arreglo = (double[]) objeto;
                    contador += arreglo.length;
                } else {
                    contador++;
                }
            }
        }
        return contador;
    }
    public Object[][] crearMatrizConDatos() {
        int numFilas = efectosBloques.size();
        int numColumnas = efectosTratamientos.size();
        Object[][] matriz = new Object[numFilas][numColumnas];
        int g=0;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz[i][j] = matrizDatos.get(g);
                g++;
            }
        }
        matrizConDatos=matriz;
        return matriz;
    }

    public static void main(String[] args) {
        // Crear una instancia de ModeloDatos con los valores proporcionados
        double alpha = 4.7;
        ArrayList<Double> efectosTratamientos = new ArrayList<>();
        efectosTratamientos.add(-7.4);
        efectosTratamientos.add(1.2);
        efectosTratamientos.add(0.58);

        ArrayList<Double> efectosBloques = new ArrayList<>();
        efectosBloques.add(5.4);
        efectosBloques.add(-9.2);

        ArrayList<double[]> matrizDatos = new ArrayList<>();
        double[] fila1 = {1.1, 2.2};
        double[] fila2 = {1.2, 2.3, 0};
        double[] fila3 = {2.1};
        double[] fila4 = {1.3, 4, 0};
        matrizDatos.add(fila1);
        matrizDatos.add(fila2);
        matrizDatos.add(fila3);
        matrizDatos.add(fila4);
        matrizDatos.add(fila4);
        // matrizDatos.add(fila2);

        TWModel modelo = new TWModel(alpha, efectosTratamientos, efectosBloques, matrizDatos);

        // Obtener y imprimir la matriz con datos
        Object[][] matrizConDatos = modelo.getMatrizConDatos();


    }
}

