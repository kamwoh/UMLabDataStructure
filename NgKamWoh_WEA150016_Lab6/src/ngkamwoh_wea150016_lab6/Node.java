
package ngkamwoh_wea150016_lab6;


public class Node<E> {

    E element;
    Node<E> next;
    
    public Node()
    {
        element = null;
        next = null;
    }
    
    public Node(E element)
    {
        this.element=element;
        next = null;
    }
    
    public String toString()
    {
        return element.toString();
    }
}
