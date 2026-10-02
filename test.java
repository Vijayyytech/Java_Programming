class test{
    int a;
    int b;
    test(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
    test t = new test(40, 10);
    t.display();
}
}

