import java.util.Scanner;

public class Fibnacci {
    public static void main(String[] args){
        int a=0,b=1,c,i,limit;
        Scanner input =new Scanner(System.in);
         limit=input.nextInt();
        if (limit==1||limit==0){
            System.out.println(a);
        }
        else{
            System.out.println(a);
            System.out.println(b);
            for(i=2;i<limit;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }
}


/// 0,1,1,2,3,5,8