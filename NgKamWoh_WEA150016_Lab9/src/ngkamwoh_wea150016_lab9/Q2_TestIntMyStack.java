
package ngkamwoh_wea150016_lab9;

import java.util.Scanner;


public class Q2_TestIntMyStack{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        MyStack<Integer> ms = new MyStack<>();
        while(true)
        {
            System.out.print("Enter value(-1 end):");
            int value = read.nextInt();
            if(value==-1)
                break;
            ms.push(value);
        }
        System.out.println("Size:"+ms.getSize());
        while(!ms.isEmpty())
        {
            System.out.print(ms.pop()+" ");
        }
        System.out.println("");
        System.out.println("The order is last in first out, because the last value is pop out first");
    }
    
    
    
}
