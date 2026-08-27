import java.util.Scanner;

public class recursion{
  /*   static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    } */

        static int fibonacci(int n){
            if(n == 1){
                return 0;
            }
            else if(n == 2){
                return 1;
            }
            else{
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("the nth fibo number is: " + fibonacci(num));
      /*  System.out.println(factorial(num)); */
        sc.close();
    }
}