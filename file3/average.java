import java.util.Scanner;
public class average{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int[]arr=new int[4];
        int av=0;
        for(int i=0;i<4;i++){
            arr[i]=scn.nextInt();
            av+=arr[i];
        }
        System.out.println("Average: "+av/4);
    }
}