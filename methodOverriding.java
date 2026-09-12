class A{
    public void vijju() {
        System.out.println("Hello! Vijju");
    }
    public void method2(){
        System.out.println("this is method of class A");
    }
}

class B extends A{
    @Override 
    public void method2(){
        System.out.println("This is method of class B");
    }
}

public class methodOverriding{
    public static void main(String[] args){
        B b = new B();
        b.method2();

    }
}