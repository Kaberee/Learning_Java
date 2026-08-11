import java.util.Random;
public class Number_generator{
    public static void main(String [] args){
Random random=new Random();
int x;
x=random.nextInt(1,6); //first number is inclusive and second number is exclusive
        System.out.println(x);
    }
}