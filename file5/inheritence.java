class inheritence{
    void marks(){
        System.out.print("pass");
    }
}
  class st extends inheritence{
    void marks2(){
        System.out.println("fail");
    }
public static void main(String[]args){
    st s=new st();
    s.marks2();
    s.marks();
}
}

