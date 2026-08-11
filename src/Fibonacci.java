import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < a; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
       }

    }
}

