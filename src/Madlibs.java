import java.sql.SQLOutput;
import java.util.Scanner;
public class Madlibs{
    public static void main(String[] args){

Scanner scanner=new Scanner(System.in);

String adj1;
String noun1;
String adj2;
String verb1;
String adj3;
adj1=scanner.nextLine();
noun1=scanner.nextLine();
adj2=scanner.nextLine();
verb1=scanner.nextLine();
adj3=scanner.nextLine();



        System.out.println("Today I went to a "+adj1+" zoo");
        System.out.println("In an exhibit, I saw a "+ noun1);
        System.out.println("The "+noun1+" was "+adj2+" and "+verb1);
        System.out.println("I was "+adj3+" !");
    }

}