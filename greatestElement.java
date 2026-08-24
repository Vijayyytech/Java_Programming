public class greatestElement {
    public static void main(String[] args) {
        int[] a = {-4,-2,-3,-5,-1,-9};
       /*  int max = Integer.MIN_VALUE;
        for(int element:a){
            if(element > max){
                max = element;
            }
        }
        System.out.println("The max element is: "+ max); */

        int min = Integer.MAX_VALUE;
        for(int element:a){
            if(element < min){
              min = element;
            }
        }
        System.out.println("minimum value is: "+min);
    }
    
}
