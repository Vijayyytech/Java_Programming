public class builtInException{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("This is an exception.");
            System.out.println(e);
        }

        System.out.println("Outside of try catch block.");
    }
}