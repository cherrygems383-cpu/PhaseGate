import java.util.Scanner;

  public class GradingSystem{
    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
 
    
    System.out.println("How Many Student Do You Have?: ");
      int studentNum = input.nextInt();
    System.out.println("How Many Subject Do You Offer?: ");
      int subjectNum = input.nextInt();
      
      
    System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved Successfully");
    System.out.println("Enter Score For Student: "  );
      int studentScore = input.nextInt();
    
               
      
    }
    
    
   public static int [] [] Collector(int [] [] array){
       int [] [] array = new int  [studentNum] [subjectNum] ;
       for (int index = 0; index < array.length; index++ ){}
   }
    
  }
