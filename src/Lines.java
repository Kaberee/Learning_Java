import java.util.Scanner;
public class Lines{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int length=a.length();
        System.out.println(length);
        String name="Teddy cutie";
        char letter=name.charAt(2);
        int index=name.indexOf("e");
        int last=name.lastIndexOf("e");
        System.out.println(index +" " +last);
        System.out.println(letter);

        //name.contains("a");
        //name=name.toUpperCase();
        //name=name.trim();
        //name=name.toLowerCase();
        //name=name.replace("e", "i");
        //if(name.equals("Kaberee"));

    }
}
