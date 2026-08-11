import java.util.Scanner;

public class Grade_calculator{
    public static void main(String[] args) {

        int f;
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        if(f>=0 && f<=39){
            System.out.println("F");
        }
        else if(f>=40 && f<=59){
            System.out.println("C+");
        }
        else if(f>=60 && f<=69){
            System.out.println("B");
        }
        else if(f>=70 && f<=79){
            System.out.println("A-");
        }
        else if(f>=80 && f<=89){
            System.out.println("A");
        }
        else if(f>=90 && f<=100){
            System.out.println("A+");
        }

    }
}
