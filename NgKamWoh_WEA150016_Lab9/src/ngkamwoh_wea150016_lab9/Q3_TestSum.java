
package ngkamwoh_wea150016_lab9;


public class Q3_TestSum{

    public static void main(String[] args)
    {
        MyStack<Integer> ms = new MyStack<>();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        int sum=0;
        System.out.println("Stack:"+ms);
        while(!ms.isEmpty())
        {
            sum+=ms.pop();
        }
        System.out.println("Sum:"+sum);
        System.out.println("Stack:"+ms);
    }
    
    
    
}
