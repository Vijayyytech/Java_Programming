public class javaMethods{
    int sum(int a, int b){ // if we do not write [static int sum()] here then we need to create an object of class to call the fumction
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        javaMethods jm = new javaMethods(); // like this
        int result = jm.sum(10, 20);
        System.out.println(result);
    }
}