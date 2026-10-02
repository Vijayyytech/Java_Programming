class InvalidMarksException extends Exception{
    public  String getmessage(){
        System.out.println("This is an invalid marks exception.");
    }
}

public class javaException {
    public static void main(String[] args){
         int marks = 30;
         if(marks < 30){
            try{
                throw new InvalidMarksException();
            }
            catch(InvalidMarksException e){
             System.out.println(e.getmessage());
            }
         }
         System.out.println("Finished");
    }
}
