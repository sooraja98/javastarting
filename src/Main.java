import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       int n1=input.nextInt();
       int n2=input.nextInt();
       int sum=n2+n1;
       if(sum>20) {
           System.out.println("sum is" + sum);
       }
       else{
           System.out.println("sorry");
       }
    }
}