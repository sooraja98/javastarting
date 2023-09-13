import java.util.Arrays;
import java.util.Scanner;

public class Maxarrayelement {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the size"+ Arrays.toString(arr));

    }
}
