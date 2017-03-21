
package ngkamwoh_wea150016_lab9;

import java.util.ArrayList;


public class MyStack<E> {

    private final ArrayList<E> list = new ArrayList<>();
    
    public MyStack()
    {
        
    }
    
    public void push(E o)
    {
        list.add(o);
    }
    
    public E pop()
    {
        return list.remove(list.size()-1);
    }
    
    public E peek()
    {
        return list.get(list.size()-1);
    }
    
    public int getSize()
    {
        return list.size();
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public String toString()
    {
        return list.toString();
    }
    
    public boolean search(E o)
    {
        return list.contains(o);
    }
    
}
