
package NgKamWoh_WEA150016_L3_Q3;

import java.util.Scanner;
/**
 * 
 * @author Ng Kam Woh WEA150016
 */

public class L3_Q3 {

    public static void main(String[] args)
    {
        System.out.print("input an integer:");
        int n = new Scanner(System.in).nextInt();
        print(n);
    }
    
    public static void print(int n)
    {
        print(n,0);
    }
    
    public static void print(int n, int k)
    {
        if(k==0)
            System.out.print("(x + y)^"+n+" = ");
        
        System.out.print(f(n,k)+"x^"+(n-k)+"y^"+k+" ");
        
        if(k!=n)
        {
            System.out.print("+ ");
            print(n,k+1);
        }
        else
            System.out.println("");
        
    }
    
    public static int f(int n, int k)
    {
        if(k==0||k==n)
            return 1;
        
        return f(n-1,k-1)+f(n-1,k);
    }
    
}
