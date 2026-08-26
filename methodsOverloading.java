public class methodsOverloading {
   /* static void change(int[] arr){
        arr[0] = 100;
    } */
   static void greet(){
    System.out.println("Good morning! ji");
   }
   static void greet(int a){
    System.out.println("good morning "+ a +" vijju");
   }
    public static void main(String[] args) {

       /*  int[] marks = {99,65,79,88,91};
        change(marks);
        System.out.println("The value of marks[0] after running change: "+ marks[0]);*/

        // method overloading
         greet();
         greet(269);
    }
}
