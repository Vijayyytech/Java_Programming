 class base{
   private String name;
   private int salary;

   public void setValues(String n, int s){
    name = n;
    salary = s;
   }

   public String getValues(){
    return name;
   }
}

class child extends base{
     String username = "childClass";
    
    }

public class inheritance{
    public static void main(String[] args) {
        child c = new child();
        c.setValues("baseClass",5000);
        System.out.println(c.getValues());
        System.out.println(c.username);
    }
}