import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static  void main(String[] args ){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=input.nextInt();
        int[] arr=new int[n];
        int i;
        System.out.println("enter array elements");
        for(i=0;i<n;i++){
                arr[i]=input.nextInt();
        }
        System.out.println("enter array is");
        for(i=0;i<n;i++){
            System.out.println("enter array is"+arr[i]);

        }
        System.out.println(Arrays.toString(arr));

    }

}
