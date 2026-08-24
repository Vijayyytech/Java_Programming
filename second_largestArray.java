public class second_largestArray{
    public static void main(String[] args){
        int[] a = {6,4,9,3,66,55};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int elements : a){
            if(elements > max){
                secondMax = max;
                max = elements;
            }
            else if(elements > secondMax && elements != max){
                secondMax = elements;
            }
        }
        System.out.println(secondMax);
    }
}