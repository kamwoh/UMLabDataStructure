

package lab;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Question 1:");
        String[] s = new String[]{"Durian","Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(s);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println("Queue:"+fruitQ);
        System.out.println("Top item:"+fruitQ.peek());
        System.out.println("Size:"+fruitQ.getSize());
        System.out.println("Removed:"+fruitQ.dequeue());
        System.out.println("Index 2:"+fruitQ.getElement(2));
        System.out.println("Contains 'Cherry':"+fruitQ.contains("Cherry"));
        System.out.println("Contains 'Durian':"+fruitQ.contains("Durian"));
        System.out.print("Queue:");
        while(!fruitQ.isEmpty())
        {
            System.out.print(fruitQ.dequeue()+" ");
        }
        System.out.println("\n\nQuestion 2");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string:");
        String ss = read.next();
        if(isPalindrome(ss))
            System.out.println(ss+" is a palindrome");
        else
            System.out.println(ss+" is not a palindrome");
    }
    
    public static boolean isPalindrome(String s)
    {
        MyQueue<Character> queue1 = new MyQueue<>();
        MyQueue<Character> queue2 = new MyQueue<>();
        for(int i=0;i<s.length();i++)
        {
            queue1.enqueue(s.charAt(i));
            queue2.enqueue(s.charAt(s.length()-1-i));
        }
        
        while(!queue1.isEmpty())
        {
            if(!queue1.dequeue().equals(queue2.dequeue()))
                return false;
        }
        return true;
        /*
        for(int i=s.length()-1;i>=0;i--)
        {
            queue.enqueue(s.charAt(i));
        }
        //1234321
        String check = "";
        while(!queue.isEmpty())
        {
            check+=queue.dequeue();
        }
        return s.equals(check);
        */
    }

}
