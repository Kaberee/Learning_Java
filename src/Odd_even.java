import java.util.Scanner;

public class Odd_even{
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2==0) {
            System.out.print("The number is even");
        }
        else {
            System.out.print("The number is odd");
        }

    }
}
