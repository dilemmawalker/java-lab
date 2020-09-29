public class leap{
    public static void main(String args[]){
        String s=args[0];
        int n=Integer.valueOf(s);
        if((n%4==0)||(n%100!=0 && n%400==0))
        System.out.println("LEAP YEAR");
        else
        System.out.println("NON- LEAP YEAR");
    }
}