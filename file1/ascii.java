import java.util.Scanner;
public class ascii{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        char ch=scn.next().charAt(0);
        System.out.println((ch-'0')+48);
    }
}