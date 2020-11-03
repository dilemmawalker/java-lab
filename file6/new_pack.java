package mypack;
public class new_pack extends ABC{
public void myMethod(){
	System.out.println("Overriding Method");
   }
  
   public static void main(String args[]){
	ABC obj = new new_pack();
	obj.myMethod();
   }
}     
class ABC{
   public void myMethod(){
	System.out.println("Overridden Method");
   }
}
