
package NgKamWoh_WEA150016_L3_Q1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Ng Kam Woh
 *          WEA150016
 */

public class L3_Q1 {
    
    public static void main(String[] args) throws IOException
    {
        String path = "numbers.txt";
        //5,3,23,4,1,345,555,123,45
        String[] s;
        
        Scanner read;
        read = new Scanner(new FileInputStream(path));
        s = read.nextLine().split(",");
        int[] n = new int[s.length];
        for(int i=0;i<n.length;i++)
        {
            n[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Before sorting");
        display(n);
        sort(n);
        System.out.println("After sorting");
        display(n);
        System.out.print("Find value: ");
        int value = new Scanner(System.in).nextInt();
        int index = binarySearch(n,value);
        if(index>=0)
            System.out.println("The index of the value: "+index);
        else
            System.out.println("The value is not found in the array");
    }
    
    public static int binarySearch(int[] n, int value)
    {
        return binarySearch(n,value,n.length-1,0);
    }
    
    public static int binarySearch(int[] n, int value, int high, int low)
    {
        int mid = (high+low)/2;
        if(low>high)
            return -1;
        if(n[mid]==value)
            return mid;
        else if(n[mid]<value)
            return binarySearch(n,value,high,mid+1);
        else
            return binarySearch(n,value,mid-1,low);
        
    }
    
    public static void display(int[] n)
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
        System.out.println("");
    }
    
    public static void sort(int[] n)
    {
        int first;
        int index;
        for(int i=0;i<n.length-1;i++)
        {
            index=i;
            first=n[i];
            for(int j=i+1;j<n.length;j++)
            {
                if(first>n[j])
                {
                    index=j;
                    first=n[j];
                }
            }
            
            if(index!=i)
            {
                n[index]=n[i];
                n[i]=first;
            }
        }
    }
    
    
}
