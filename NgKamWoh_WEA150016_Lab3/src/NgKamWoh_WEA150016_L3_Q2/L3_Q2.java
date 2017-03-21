
package NgKamWoh_WEA150016_L3_Q2;
/**
 * 
 * @author Ng Kam Woh WEA150016
 * 
 */

public class L3_Q2 {

    public static void main(String[] args)
    {
        System.out.println("F(4,10)="+f(4,10));
        System.out.println("F(12,8)="+f(12,8));
        System.out.println("F(7,12)="+f(7,12));
        //System.out.println("F(3,7)="+f(3,7));
    }
    
    public static int f(int s, int t)
    {
        if(s==1)
            return 1;
        if(t==1)
            return s;
        if(s<=0||t<=0)
            return 0;
        
        return f(s-1,t)+f(s,t-1);
    }
    
}
