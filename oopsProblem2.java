import java.util.Scanner;

class cellPhone{
    public void Calling(){
        System.out.println("Someone is calling");
    }
    public void Ringing(){
        System.out.println("Phone is ringing");
    }
    public void Vibrating(){
        System.out.println("phone is vibrating");
    }
}
public class oopsProblem2 {
    public static void main(String[] args) {

        cellPhone vivoy20 = new cellPhone();
        vivoy20.Calling();
        vivoy20.Ringing();
        vivoy20.Vibrating();
   }
}
