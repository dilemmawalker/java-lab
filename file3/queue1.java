import java.util.PriorityQueue;

public class queue1{
    public  static void main(String []args){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(7);

        System.out.println("Top: "+pq.peek());
        while(pq.size()!=0){
            System.out.println(pq.remove());
        }
    }
}