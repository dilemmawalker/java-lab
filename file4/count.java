public class count{
    public static int co=0;
    public static class instant{
    int center=0;
    int radii=9;
    instant(int c,int r){
        co++;
        this.center=c;
        this.radii=r;
    }
    }
    public static void main(String[]args){
        instant obj=new instant(10,5);
        instant obj2=new instant(15,5);
        // System.out.println("Center: "+obj.center);
        // System.out.println("Radii: "+obj.radii);
        System.out.println("No of objects: "+co);
    }
}