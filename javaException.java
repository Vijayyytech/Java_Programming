import java.util.Scanner;
class InvalidAgeException extends Exception{
       InvalidAgeException(String message){
        super(message);
       }
}

public class javaException{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            if(age < 18){
               throw new InvalidAgeException("Age must be 18 or above.");
            }
            System.out.println("Age is: " +age);
        }
        catch(InvalidAgeException e){
            System.out.println("some exception occured!");
            System.out.println(e.getMessage());
        }
    }
}