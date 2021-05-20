import java.util.Scanner;


public class javaScanner{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your Name : "); 
      String name = sc.next();
      System.out.print("Enter Your Age : ");
      int age = sc.nextInt();

      sc.close();
      System.out.println("Hello "+name+" you are "+age+" years old");
    }
       
}
