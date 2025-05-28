import java.util.Scanner;

public class Ass1_que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter userid :");
        int userid=sc.nextInt();//if 5 then id match
        if(userid==5){
            System.out.print("Name : JAke's "+" Age: 25 ");
        }
        else {
            System.out.println("No Id is matched ");
        }
    }
}