public class argVariable {
  /*   static int sum(int a, int b){
     int result = a + b;
     return result;
    }

     static int sum(int a, int b, int c){
     int result = a + b + c;
     return result;
     }

     static int sum(int a, int b, int c, int d){
     int result = a + b + c + d;
     return result;
    } */

     static int sum(int ...arr){
        int result = 0;
        for(int num:arr){
            result += num;
        }
        return result;
     }
public static void main(String[] args) {
   System.out.println("The sum of a and b is "+ sum(4,5));
    System.out.println("The sum of a , b and c is "+ sum(4,5,6));
    System.out.println("The sum of a , b , c and d is "+ sum(4,5,4,4));
} 


    
}
