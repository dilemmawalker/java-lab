import java.util.Scanner;
public class arr_to_string{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
         
        int n=scn.nextInt();
        char[]arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.next().charAt(0);
        }
        convert(arr);
    }
    public static void convert(char[]arr){
        int n=arr.length;
        String str="";
        for(int i=0;i<n;i++){
            str+=arr[i];
        }
        System.out.print(str);
    }
}