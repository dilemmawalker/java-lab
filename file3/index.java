public class index{
    public static void main(String[]args){
        int[]arr={2,6,7,8,4,5,3,7,3,5};
        System.out.println(call(arr));
    }
    public static int call(int[]arr){
        for(int i=0;i<arr.length;i++){
            int c1=0,c2=0;
           for(int j=0;j<i;j++)
           c1+=arr[j];
           for(int j=i+1;j<arr.length;j++)
           c2+=arr[j];
           if(c1==c2)
           return i;
        }
        return -1;
    }
}