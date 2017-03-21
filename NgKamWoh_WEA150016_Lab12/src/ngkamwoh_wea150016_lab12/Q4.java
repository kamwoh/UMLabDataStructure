
package ngkamwoh_wea150016_lab12;

import java.util.LinkedList;
import java.util.Stack;


public class Q4 {

    public static void main(String[] args)
    {
        Stack<TreeNode> stack = new Stack<>();
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
        bst.insert(6);
        System.out.println("Recursive inorder traversal method in BST");
        bst.inorder(bst.getRoot());
        System.out.println("\nNon recursive using stack");
        inorder(bst,stack);
        System.out.println("");
    }
    
    public static void inorder(BST bst, Stack<TreeNode> stack)
    {
        TreeNode current = bst.getRoot();
        while(true)
        {
            if(current!=null)
            {
                stack.push(current);
                current = current.left;
            }
            else
            {
                if(!stack.isEmpty())
                {
                    TreeNode pop = stack.pop();
                    System.out.print(pop+" ");
                    current = pop.right;
                }
                else
                    break;
            }
        }
    }
}
class Queue<E>{
    private LinkedList<E> list = new LinkedList<>();
    
    public Queue(){
        
    }
    
    public void enqueue(E e)
    {
        list.add(e);
    }
    
    public E dequeue()
    {
        return list.removeFirst();
    }
    
    
}
