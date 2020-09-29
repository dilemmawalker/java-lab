import java.util.Scanner;
public class prime{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int a=2;
        int c=0;
        int n=scn.nextInt();
        while(c<n){
            int count=0;
                for(int i=1;i<=a/2;i++){
                    if(a%i==0)count++;
                }
                if(count==1){
                    c++;
                    System.out.print(a+"  ");
                }
                a++;
        }
    }
}