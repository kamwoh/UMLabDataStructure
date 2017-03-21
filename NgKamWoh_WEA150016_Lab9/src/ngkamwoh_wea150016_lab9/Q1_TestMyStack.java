
package ngkamwoh_wea150016_lab9;


public class Q1_TestMyStack {

    public static void main(String[] args)
    {
        //Q1(a)
        MyStack<Character> ms = new MyStack<>();
        ms.push('a');
        ms.push('b');
        ms.push('c');
        System.out.println("Q1(b)");
        System.out.println("Stack: "+ms.toString());
        System.out.println("b is in the stack? "+ms.search('b'));
        System.out.println("k is in the stack? "+ms.search('k'));
        System.out.println("Q1(c)");
        MyStack<Integer> ms1 = new MyStack<>();
        ms1.push(1);
        ms1.push(2);
        ms1.push(3);
        System.out.println("Stack: "+ms1.toString());
        System.out.println("6 is in the stack? "+ms1.search(6));
    }
    
}
