import java.util.ArrayList;

//Clase que almacenará los átomos del lenguaje
public class Valor implements Comparable {
    final Object valor;

    //Constructor
    public Valor(Object valor) {
        this.valor = valor;
    }

    //Convierte el valor asignado a Boolean
    public Boolean aBoolean() {
        try {
            //Asigna un valor booleano a un número
            Double x = (Double) valor;
            if (x != null)
                return x != 0;
        } catch (Exception e){
            //Asigna un valor booleano a un String
            try {
                String y = (String) valor;
                if(y.equals("verdadero"))
                    return true;
                else if(y.equals("falso"))
                    return false;
            } catch (Exception e2){

            }
        }
        //Valor booleano original
        return (Boolean) valor;
    }

    //Valor Double original
    public Double aDouble() {
        return (Double) valor;
    }

    //Valor Complejo original
    public Complex aComplejo() {
        return (Complex) valor;
    }

    //Convierte el valor a un String
    public String aString() {
        return String.valueOf(valor);
    }

    //Valor Vector original
    public ArrayList aVector() {
        return (ArrayList) valor;
    }

    //Valor Matriz original
    public ArrayList<ArrayList> aMatriz() {
        return (ArrayList<ArrayList>) valor;
    }

    //Determina si el valor es un Double
    public boolean esDouble() {
        return valor instanceof Double || Double.class.isInstance(valor);
    }

    //Determina si el valor es un Vector
    public boolean esVector() {
        return valor instanceof ArrayList && !esMatriz();
    }

    //Determina si el valor es una Matriz
    public boolean esMatriz() {
        if(valor.getClass()== ArrayList.class){
            try{
                ArrayList<ArrayList> aux = (ArrayList<ArrayList>) valor;
                aux.get(0).size();
                return true;
            }catch (Exception e){
                return false;
            }
        }
        else
            return false;
    }

    //Determina si el valor es Complejo
    public boolean esComplejo() {
        return valor.getClass()== Complejo.class;
    }

    @Override
    public int hashCode() {
        if(valor == null) {
            return 0;
        }
        return this.valor.hashCode();
    }

    //Criterio de igualdad
    @Override
    public boolean equals(Object o) {
        if(valor == o) {
            return true;
        }
        if(valor == null || o == null || o.getClass() != valor.getClass()) {
            return false;
        }
        Valor otro = (Valor)o;
        return this.valor.equals(otro.valor);
    }

    //Traducción de los output por defecto
    @Override
    public String toString() {
        if(valor instanceof Boolean)
            return (Boolean) valor ?"verdadero":"falso";
        return String.valueOf(valor ==null?"nulo": valor);
    }

    //Criterio de comparación
    @Override
    public int compareTo(Object o) {
        Valor aux = (Valor) o;
        if(this.valor.equals(aux.valor))
            return 0;
        else
            return -1;
    }
}

//Traducción de la clase ComplexNumber (Complex) obtenida de: https://github.com/abdulfatir/jcomplexnumber/blob/master/com/abdulfatir/jcomplexnumber/ComplexNumber.java
class Complejo extends Complex {
    public static Complex suma(Complex x, Complex y){ return Complex.add(x, y); }
    public static Complex resta(Complex x, Complex y){ return Complex.subtract(x, y); }
    public static Complex producto(Complex x, Complex y){ return Complex.multiply(x, y); }
    public static Complex division(Complex x, Complex y){ return Complex.divide(x, y); }
    public static Complex parseComplejo(String x){ return Complex.parseComplex(x); }
    public static Complex tan(Complex x){ return Complex.tan(x); }
    public static Complex sen(Complex x){ return Complex.sin(x); }
    public static Complex cos(Complex x){ return Complex.cos(x); }
    public static Complex csc(Complex x){ return Complex.cosec(x); }
    public static Complex cot(Complex x){ return Complex.cot(x); }
    public static Complex sec(Complex x){ return Complex.sec(x); }
    public static Complex pow(Complex x, int y){ return Complex.pow(x, y); }
}