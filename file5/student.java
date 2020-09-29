  class student{
        void marks(){
            System.out.print("pass");
        }
    }
      class student2 extends student{
        void marks(){
            System.out.println("fail");
        }
    public static void main(String[]args){
        student2 s=new student2();
        s.marks();
    }
}

