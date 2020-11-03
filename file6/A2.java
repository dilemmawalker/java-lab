class A2 implements printable{  
    public void print(){System.out.println("Hello");}  
      
    public static void main(String args[]){  
    A2 obj = new A2();  
    obj.print();  
     }  
    }  
    
    interface printable{  
    void print();  
    }
    