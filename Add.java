import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter 1st number");
         int num1 = sc.nextInt();
         System.out.println("Enter 2st number");
         int num2 = sc.nextInt();

         int sum = num1+num2;
         System.out.print("Result : ");
         System.out.println(num1 + " + " + num2 + " = " + sum);
         sc.close();
    } 
}