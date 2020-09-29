public class circle3{
    public static class instant{
    int center=0;
    int radii=9;
    instant(int c,int r){
        this.center=c;
        this.radii=r;
    }
    instant(int c){
        this.center=c;
    }
    }
    public static void main(String[]args){
        instant obj=new instant(10);
        System.out.println("Center: "+obj.center);
        System.out.println("Radii: "+obj.radii);
    }
}