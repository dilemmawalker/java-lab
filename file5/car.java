class car{
    public car()
    {
     System.out.println("Class car");
    }
    public void vehicleType()
    {
     System.out.println("Vehicle Type: car");
    }
 }
 class alto extends car{
    public alto()
    {
     System.out.println("Class alto");
    }
    public void brand()
    {
     System.out.println("Brand: alto");
    }
    public void speed()
    {
     System.out.println("Max: 90Kmph");
    }
 }
  class alto800 extends alto{
 
    public alto800()
    {
     System.out.println("alto Model: 800");
    }
    public void speed()
    {
     System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
      alto800 obj=new alto800();
      obj.vehicleType();
      obj.brand();
      obj.speed();
    }
 }