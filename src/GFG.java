public class GFG {

    static final double EPSILON = 0.001;

    // An example function whose solution
    // is determined using Bisection Method.
    // The function is x^3 - x^2 + 2
    static double func(double x, double staticx, double lambda1,double lambda2,double lambda3 ,double lambda4)
    {  double exp1= lambda3*Math.pow(x, lambda3 -1);
        double exp2= lambda4*Math.pow(1-x,lambda4-1);
        double bexp1= Math.pow(x, lambda3);
        double bexp2= Math.pow(1-x,lambda4);
        double res2= ((bexp1-bexp2)/lambda2);
        double expx=lambda1+res2-staticx;
        // System.out.println(exp1);

        //System.out.println(expx);
        return expx;

    }

    // Derivative of the above function
    // which is 3*x^x - 2*x
    static double derivFunc(double u, double lambda2, double lambda3,double lambda4)
    {
        double temp= Math.pow(lambda3*u,lambda3-1)-(Math.pow(1-u,lambda4-1)*(-lambda4)) ;
        return temp/lambda2;
    }

    // Function to find the root
    public  double newtonRaphson(double x,double staticx, double lambda1,double lambda2,double lambda3 ,double lambda4)
    {
        double h = func(x,staticx,lambda1,lambda2,lambda3,lambda4) / derivFunc(x, lambda2,lambda3,lambda4);
        while (Math.abs(h) >= EPSILON)
        {
            h = func(x,staticx,lambda1,lambda2,lambda3,lambda4) / derivFunc(x,lambda2,lambda3,lambda4);

            // x(i+1) = x(i) - f(x) / f'(x)
            x = x - h;
        }

        System.out.print("The value of the"
                + " root is : "
                + Math.round(x * 100.0) / 100.0);
        return Math.round(x * 100.0) / 100.0;
    }

    // Driver code
    public static void main (String[] args)
    {

        // Initial values assumed
        double x0 = -20;
      //  newtonRaphson(x0,5,0,1,1,1);
    }
}