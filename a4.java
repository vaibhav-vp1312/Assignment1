import java.util.Scanner;

public class Ass1_que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age :");
        int age=sc.nextInt();
        System.out.println("Age increment by 1 is "+ (++age));
    }
}