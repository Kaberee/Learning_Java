import java.util.Scanner;
public class Series{
    public static void main(String[] args) {
     for(int i=1; i<=19; i+=2)
     {
         System.out.println(i+" ");
     }
     int j=1;
     while(j<=19)
     {
     System.out.println(j+ " ");
    j+=2;
     }
     int k=1;
     do {
        System.out.println(k);
        k+=2;
     }while(k<=19);
     int sum=0;
     for(int i=1; i<=19; i+=2)
     {
         sum=sum+i;
     }
     System.out.println(sum);
    }
}
