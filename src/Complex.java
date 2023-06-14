public class Complex
{
    public static final int XY = 0;
    public static final int RCIS = 1;
    private double real;
    private double imaginary;

    public Complex()
    {
        real = 0.0;
        imaginary = 0.0;
    }

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex z)
    {
        set(add(this,z));
    }

    public void subtract(Complex z)
    {
        set(subtract(this,z));
    }

    public void multiply(Complex z)
    {
        set(multiply(this,z));
    }

    public void divide(Complex z)
    {
        set(divide(this,z));
    }

    public void set(Complex z)
    {
        this.real = z.real;
        this.imaginary = z.imaginary;
    }

    public static Complex add(Complex z1, Complex z2)
    {
        return new Complex(z1.real + z2.real, z1.imaginary + z2.imaginary);
    }

    public static Complex subtract(Complex z1, Complex z2)
    {
        return new Complex(z1.real - z2.real, z1.imaginary - z2.imaginary);
    }

    public static Complex multiply(Complex z1, Complex z2)
    {
        double _real = z1.real*z2.real - z1.imaginary*z2.imaginary;
        double _imaginary = z1.real*z2.imaginary + z1.imaginary*z2.real;
        return new Complex(_real,_imaginary);
    }

    public static Complex divide(Complex z1, Complex z2)
    {
        Complex output = multiply(z1,z2.conjugate());
        double div = Math.pow(z2.mod(),2);
        return new Complex(output.real/div,output.imaginary/div);
    }

    public Complex conjugate()
    {
        return new Complex(this.real,-this.imaginary);
    }

    public double mod()
    {
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    public Complex square()
    {
        double _real = this.real*this.real - this.imaginary*this.imaginary;
        double _imaginary = 2*this.real*this.imaginary;
        return new Complex(_real,_imaginary);
    }

    @Override
    public String toString()
    {
        String re = this.real+"";
        String im = "";
        if(this.imaginary < 0)
            im = this.imaginary+"i";
        else
            im = "+"+this.imaginary+"i";
        return re+im;
    }

    public static Complex exp(Complex z)
    {
        double a = z.real;
        double b = z.imaginary;
        double r = Math.exp(a);
        a = r*Math.cos(b);
        b = r*Math.sin(b);
        return new Complex(a,b);
    }

    public static Complex pow(Complex z, int power)
    {
        Complex output = new Complex(z.getRe(),z.getIm());
        for(int i = 1; i < power; i++)
        {
            double _real = output.real*z.real - output.imaginary*z.imaginary;
            double _imaginary = output.real*z.imaginary + output.imaginary*z.real;
            output = new Complex(_real,_imaginary);
        }
        return output;
    }

    public static Complex sin(Complex z)
    {
        double x = Math.exp(z.imaginary);
        double x_inv = 1/x;
        double r = Math.sin(z.real) * (x + x_inv)/2;
        double i = Math.cos(z.real) * (x - x_inv)/2;
        return new Complex(r,i);
    }

    public static Complex cos(Complex z)
    {
        double x = Math.exp(z.imaginary);
        double x_inv = 1/x;
        double r = Math.cos(z.real) * (x + x_inv)/2;
        double i = -Math.sin(z.real) * (x - x_inv)/2;
        return new Complex(r,i);
    }

    public static Complex tan(Complex z)
    {
        return divide(sin(z),cos(z));
    }

    public static Complex cot(Complex z)
    {
        return divide(new Complex(1,0),tan(z));
    }

    public static Complex sec(Complex z)
    {
        return divide(new Complex(1,0),cos(z));
    }

    public static Complex cosec(Complex z)
    {
        return divide(new Complex(1,0),sin(z));
    }

    public double getRe()
    {
        return this.real;
    }

    public double getIm()
    {
        return this.imaginary;
    }

    public double getArg()
    {
        return Math.atan2(imaginary,real);
    }

    public static Complex parseComplex(String s)
    {
        s = s.replaceAll(" ","");
        Complex parsed = null;
        if(s.contains(String.valueOf("+")) || (s.contains(String.valueOf("-")) && s.lastIndexOf('-') > 0))
        {
            String re = "";
            String im = "";
            s = s.replaceAll("i","");
            s = s.replaceAll("I","");
            if(s.indexOf('+') > 0)
            {
                re = s.substring(0,s.indexOf('+'));
                im = s.substring(s.indexOf('+')+1,s.length());
                parsed = new Complex(Double.parseDouble(re),Double.parseDouble(im.equals("")?"1":im));
            }
            else if(s.lastIndexOf('-') > 0)
            {
                re = s.substring(0,s.lastIndexOf('-'));
                im = s.substring(s.lastIndexOf('-')+1,s.length());
                parsed = new Complex(Double.parseDouble(re),-Double.parseDouble(im));
            }
        }
        else
        {
            // Pure imaginary number
            if(s.endsWith("i") || s.endsWith("I"))
            {
                s = s.replaceAll("i","");
                s = s.replaceAll("I","");
                parsed = new Complex(0, Double.parseDouble(s));
            }
            // Pure real number
            else
            {
                parsed = new Complex(Double.parseDouble(s),0);
            }
        }
//        System.out.println(parsed);
        return parsed;
    }

    @Override
    public final boolean equals(Object z)
    {
        if (!(z instanceof Complex))
            return false;
        Complex a = (Complex) z;
        return (real == a.real) && (imaginary == a.imaginary);
    }

    public Complex inverse()
    {
        return divide(new Complex(1,0),this);
    }

    public String format(int format_id) throws IllegalArgumentException
    {
        String out = "";
        if(format_id == XY)
            out = toString();
        else if(format_id == RCIS)
        {
            out = mod()+" cis("+getArg()+")";
        }
        else
        {
            throw new IllegalArgumentException("Unknown Complex Number format.");
        }
        return out;
    }
}