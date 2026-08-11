import java.util.Scanner;
public class Medal{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        boolean isStudent=sc.nextBoolean();

        if(isStudent) {

            double grade=sc.nextDouble();
            boolean completedSem=sc.nextBoolean();
            if(completedSem){

                if(grade>=3.5){
                    System.out.println("Student should receive a medal");
                }
                else{
                    System.out.println("Student shouldn't receive a medal");
                }

            }
            else{
                System.out.println("Student hasn't completed the semester and doesn't qualify for a medal");
            }

        }
        else{
            System.out.println("Person is not a student");
        }
    }
}