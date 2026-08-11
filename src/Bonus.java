import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double targetSales = sc.nextDouble();
        double attendance = sc.nextDouble();
        if (targetSales>= 0.95){
            if (attendance == 1.0) {
                System.out.println("Officer will receive a 60% bonus");
            } else if (attendance == 0.9) {
                System.out.println("Officer will receive a 40% bonus");
            }

        }
        else if(targetSales>0.80 && targetSales<0.95){
            if(attendance==1.00){
                System.out.println("Officer will receive a 40% bonus");
            }
            else if(attendance==0.90){
                System.out.println("Officer will receive a 20% bonus");
            }
        }
        else{
            System.out.println("Officer will receive a 5% bonus");
        }

    }
}