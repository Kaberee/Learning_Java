import java.util.Scanner;
public class Substr{
    public static void main(String [] args){
        //.subtring()=a method used to extract a portion of a string
        String email="tasnuggets1974@gmail.com";
        String username=email.substring(0,9);
        String domain=email.substring(10);
        String username1=email.substring(0,email.indexOf("@"));
        String domain1=email.substring(email.indexOf("@")+1);
        System.out.println(domain1);
        System.out.println(username1);
        System.out.println(domain);
        System.out.println(username);
        if(email.contains("@")){
            System.out.println("Valid email address");
        }
        else {
            System.out.println("Invalid email address");
        }
    }
}