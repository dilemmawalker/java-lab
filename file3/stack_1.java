import java.util.Scanner;
import java.util.Stack;

public class stack_1{
    public static void main(String[]args){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<10;i++)
        st.push(i);

        System.out.println("Top: "+st.peek());
        while(st.size()!=0){
            System.out.println(st.pop());
        }
    }
}