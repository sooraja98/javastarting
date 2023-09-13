import java.util.Scanner;

public class Switch {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("1.hi \n 2.hellow");
        int n=input.nextInt();
        switch (n){
            case 1:
                System.out.println("hi");
                break;
            case  2:
                System.out.println("hellow");
                break;
            default:System.out.println("Nothing");
        }
    }
}
