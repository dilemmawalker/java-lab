public class this_use{
    public static class instant{
    int center=0;
    int radii=9;
    instant(int c,int r){
        this.center=c;
        this.radii=r;
    }
    }
    public static void main(String[]args){
        instant obj=new instant(10,5);
        System.out.println("Center: "+obj.center);
        System.out.println("Radii: "+obj.radii);
    }
}