import java.util.Scanner;

public class Ass1_que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter number2 :");
        int num2 = sc.nextInt();
        int sub = num1 - num2;
        System.out.println("Subtraction of number :" + sub);
    }
}