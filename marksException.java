import java.util.Scanner;
class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
public class marksException{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the marks:");
            int marks = sc.nextInt();
            if(marks < 30){
                throw new InvalidMarksException("Invalid marks exception.");
            }
            System.out.println("Valid marks is: "+marks);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}