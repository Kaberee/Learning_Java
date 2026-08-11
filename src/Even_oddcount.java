import java.util.Scanner;
public class Even_oddcount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int count=0;
        int count1=0;

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count++;
            }
            else {
                count1++;
            }
        }

        System.out.println(count);
        System.out.println(count1);
    }
}