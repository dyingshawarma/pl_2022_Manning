package theory_activity1;
import java.util.Scanner;
class activity { 
    public static void main(String[] args) {

    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter a String: ");
         String string = sc.nextLine();

         function(string);
     }
     public static void function(String s)
     {
         String line = "";
         for (int i = (s.length() - 1); i >= 0; --i) {
             line += s.charAt(i);
         }
         if(s.toLowerCase().equals(line.toLowerCase()))
         {
             System.out.println(s + " is a Palindrome");
         }
         else{
             System.out.println(s + " is not a Palindrome");
         }
     }
 }