import java.util.Scanner;

public class Triangle_area{
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double s=(a+b+c)/2.0;
        double s1=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(s1);
        System.out.print(area);

}
}
