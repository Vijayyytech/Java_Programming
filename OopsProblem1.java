
class Employee{
int salary;
public void getSalary(){
    System.out.println("Salary: "+ salary);
}
String name;
public void getName(){
    System.out.println("Name: "+ name);
}
public void setName(){
    name = "vijju";
}
}
public class OopsProblem1{
    public static void main(String[] args) {
        Employee vijay = new Employee();
        vijay.salary = 1000000;
      /*   vijay.name = "Rakhi"; -> it does not change name which is set by method */
        vijay.getSalary();
        vijay.setName();
        vijay.getName();
    }
}