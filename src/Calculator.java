import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        char op = sc.next().charAt(0);
        if(op=='+'){
            System.out.println(a+b);
        }
       else if(op=='-'){
            System.out.println(a-b);
        }
       else if(op=='*'){
            System.out.println(a*b);
        }
       else if(op=='/'){
            System.out.println(a/b);
        }

    }
}
