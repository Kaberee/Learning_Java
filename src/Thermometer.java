import java.util.Scanner;

public class Thermometer{
    public static void main(String[] args) {

        int f;
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        double c=5*((f-32)/9.0);
System.out.print(c);

    }
}
