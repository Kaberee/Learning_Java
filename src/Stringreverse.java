import java.util.Scanner;
class Stringreverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String reversed="";
        for(int i=s.length()-1; i>=0; i--){
            reversed=reversed+s.charAt(i);
        }
        System.out.println("Reversed string is:"+reversed);
    }
}