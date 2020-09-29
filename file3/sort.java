import java.util.Scanner;
public class sort
{
    public static void main(String[] args) 
    {//
    	int count, temp;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < count ; i++) 
        {
            System.out.print(num[i] + " ");
        }
    }
}