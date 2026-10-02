import java.util.Scanner;
public class typeConversion {
    public static void main(String[] args){
      /*   double largeNum = 10.999;
        int num = (int) largeNum;
        System.out.println("largenum:" + largeNum);
        System.out.println(num); */

        Scanner sc = new Scanner(System.in);
       /*  System.out.println("Enter how many numbers:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<num; i++){
            System.out.println("Enter number:");
            sum += sc.nextInt();
        }
        System.out.println("Sum is :" + sum); */

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i<n; i++){
            System.out.print("element " + i + ":");
            marks[i] = sc.nextInt();
        }
        for(int val : marks){
            System.out.print(val + " ");
        }
        System.out.print(" ");

    }
}
