class NegativeValueException extends Exception{
    NegativeValueException(String message){
        super(message);
    }
}
public class javaMethods{
    int sum(int a, int b) throws NegativeValueException{ 
        if(a < 0 || b < 0){
            throw new NegativeValueException("value must be positive.");
        }
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        int x = -10;
        int y = 20;
        javaMethods jm = new javaMethods();
        try{
        int result = jm.sum(x, y);
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}