public class area{
    public static double triangle(int a,int b){
        return (a*1.0*b)/2;
    }
    public static double triangle(double a,double b){
        return (a*b)/2;
    }
    public static double circle(int r){
        return (22*1.0*r*r)/7;
    }
    public static double circle(double r){
        return (22*1.0*r*r)/7;
    }
    public static int rectangle(int l,int b){
        return l*b;
    }
    public static double rectangle(double l,double b){
        return l*b;
    }
    public static void main(String[]args){

        double a=5.1;
        int b=3;
        System.out.println(triangle(a,b));
        System.out.println(circle(6));
        System.out.println(rectangle(5,b));
    }
}