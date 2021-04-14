import java.util.Scanner;

public class ReadUserInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name  :");
        String name = scanner.nextLine();

        System.out.println("Enter Your Surname  :");
        String surname = scanner.nextLine();

        System.out.println("Enter Age  :");
        Integer age = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Your Name is "+name+" your surname is "+surname+"  your age  "+age);
    }
}