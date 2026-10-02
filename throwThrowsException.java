class NegativeRadiusException extends Exception{
    NegativeRadiusException(String message){
        super(message);
    }
}

public class throwThrowsException{

   //User defined Exception

    public static double area(double r ) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException("Invalid Rdius!");
        }
        double res = Math.PI * r * r;
        return res;
    }

    //Built-in java Excepton

    public static int divide(int a, int b) throws ArithmeticException{
           int c = a/b;
           return c;
    }
    public static void main(String[] args){
        try{
      // int result = divide(4,0);
      // System.out.println(result);
      double result = area(-5);
      System.out.println(result);
        }
        catch(Exception e){
            System.out.println("There is an exception.");
            System.out.println(e);
        }
    }
}