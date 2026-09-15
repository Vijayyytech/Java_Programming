import java.util.Scanner;
class student{
int roll_no;
String name;
float cgpa;
boolean report;

public void getData(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the roll number of student:");
    roll_no = sc.nextInt();
    System.out.println("Enter the student name:");
    name = sc.next();
    System.out.println("Enter the cgpa of student:");
    cgpa = sc.nextFloat();
    System.out.println("Enter the report in true or false format:");
    report = sc.nextBoolean();

    sc.close();
}

public void displayData(){
    System.out.println("Student data->");

System.out.println("roll_no:" + roll_no );
System.out.println("name:" + name);
System.out.println("cgpa:" + cgpa);

if(cgpa >= 6){
    System.out.println("PASS");
}

else{
    System.out.println("FAIL");
}

}

public void displayWithBonus(){
    int bonus = 1;
         System.out.println("cgpa with bonus:" + (cgpa+bonus));
   
}

}
public class javaProgram {
    public static void main(String[] args){
        student vijay = new student();
        vijay.getData();
        vijay.displayData();
        vijay.displayWithBonus();

    }
}
