
package lab;

import java.util.LinkedList;


public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();
    public MyQueue()
    {
        
    }
    
    public MyQueue(E[] e)
    {
        for(int i=0;i<e.length;i++)
        {
            list.add(e[i]);
        }
    }
    public void enqueue(E e)
    {
        list.add(e);
    }
    public E dequeue()
    {
        return list.removeFirst();
    }
    public E getElement(int i)
    {
        return list.get(i);
    }
    public E peek()
    {
        return list.getFirst();
    }
    public int getSize()
    {
        return list.size();
    }
    public boolean contains(E e)
    {
        return list.contains(e);
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public String toString()
    {
        return list.toString();
    }
}
