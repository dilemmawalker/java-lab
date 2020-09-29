import java.util.Scanner;
 class convert{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        String str=scn.next();
        String a="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
            a=a+Character.toString(ch);
        }
        System.out.println();
        System.out.println("String: "+a);

    }
}