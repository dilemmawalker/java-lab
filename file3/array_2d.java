public class array_2d{
    public static void main(String[]args){
        int[][]arr={{32,0},{500,300},{(int)39.45,600}};
        int n=arr.length;
        int m=arr[0].length;
        System.out.println("Rows: "+n+" Columns: "+m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}