
package ngkamwoh_wea150016_lab12;


public class TreeNode<E> {

    public E e;
    public TreeNode<E> left=null;
    public TreeNode<E> right=null;
    
    public TreeNode()
    {
        
    }
    
    public TreeNode(E e)
    {
        this.e=e;
    }
    
    public String toString()
    {
        return e.toString();
    }
}
