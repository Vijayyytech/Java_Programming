class cylender{
    private int radius;
    private int height;

    public void setHeight(int height){
        this.height = height;
        
    }
    public int getHeight(){
        return height;
    }

    public void setRadius(int radius){
        this.radius = radius;
        
    }
    public int getRadius(){
        return radius;
    }

    public float surfaceArea(){
        return 2*3.14f*radius*height;
    }
    public float volume(){
        return 3.14f*radius*radius*height;
    }
}

public class Questions {
    public static void main(String[] args) {
        cylender c = new cylender();

        //Problem 1

         c.setHeight(10);
         c.setRadius(10);
         System.out.println("Height = " + c.getHeight());
         System.out.println("Radius = " + c.getRadius());

        //Problem 2
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

    }
}
