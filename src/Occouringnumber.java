public class Occouringnumber {
    public static void main(String[] args){
                    int n=1455433;
                    int div,count=0;
                    while(n>0){
                        div=n%10;
                        if(div==5){
                            count=count+1;
                        }
                        n=n/10;
                    }
        System.out.println(count);

    }

}
///1234555543243 find the number 5 occurring