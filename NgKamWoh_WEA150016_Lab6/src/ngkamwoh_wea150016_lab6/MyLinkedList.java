
package ngkamwoh_wea150016_lab6;

public class MyLinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int size = 0;
    
    public MyLinkedList()
    {
        head=null;
        tail=null;
    }
    
    public void addLast(E e)
    {
        Node<E> last = tail;
        Node<E> tempNode = new Node<>(e);
        tail = tempNode;
        size++;
        if(last==null)
            head = tempNode;
        else
            last.next = tempNode;
    }
    
    public void addFirst(E e)
    {
        Node<E> first = head;
        Node<E> tempNode = new Node<>(e);
        head = tempNode;
        size++;
        if(first==null)
            tail = tempNode;
        else
            head.next=first;
        
    }
    
    public void add(int index, E e)
    {
        if(index==size)
        {
            addLast(e);
            return;
        }
        if(index<0||index>size)
        {
            return;
        }
        int i=0;
        for(Node<E> x=head; x!=null; x=x.next)
        {
            if(i==index-1)
            {
                Node<E> next = x.next;
                Node<E> newNode = new Node<>(e);
                newNode.next=next;
                x.next = newNode;
                size++;
                return;
            }
            i++;
        }
    }
    
    public void add(E e)
    {
        addLast(e);
    }
    
    public E removeLast()
    {
        if(tail==null)
            return null;
        if(head==tail)
        {
            E element = tail.element;
            clear();
            return element;
        }
        for(Node<E> x=head;x!=null;x=x.next)
        {
            if(x.next.element.equals(tail.element))
            {
                E element = x.next.element;
                tail = x;
                tail.next = null;
                size--;
                return element;
            }
        }
        return null;
    }
    
    public E removeFirst()
    {
        if(head==null)
            return null;
        size--;
        E element = head.element;
        head = head.next;
        return element;
    }
    
    public E remove(int index)
    {
        if(index<0||index>=size)
            return null;
        if(index==0)
            return removeFirst();
        if(index==size-1)
            return removeLast();
        int i=0;
        for(Node<E> x=head; x!=null; x=x.next)
        {
            if(i==index-1)
            {
                Node<E> next = x.next.next;
                E element = x.next.element;
                x.next=next;
                size--;
                return element;
            }
            i++;
        }
        return null;
    }
    
    public int indexOf(E e)
    {
        int i=0;
        for(Node<E> x=head; x!=null; x=x.next)
        {
            if(x.element.equals(e))
            {
                return i;
            }
            i++;
        }
        
        return -1;
    }
    
    public int lastIndexOf(E e)
    {
        int i=0;
        int index=-1;
        for(Node<E> x=head;x!=null;x=x.next)
        {
            if(x.element.equals(e))
            {
                index=i;
            }
            i++;
        }
        return index;
    }
    
    public boolean contains(E e)
    {
        return indexOf(e)!=-1;
    }
    
    public E get(int index)
    {
        int i=0;
        for(Node<E> x=head; x!=null; x=x.next)
        {
            if(i==index)
            {
                return x.element;
            }
            i++;
        }
        return null;
    }
    
    public E getFirst()
    {
        return head.element;
    }
    
    public E getLast()
    {
        return tail.element;
    }
    
    public E set(int index, E e)
    {
        if(index==0)
        {
            removeFirst();
            addFirst(e);
            return e;
        }
        if(index==size-1)
        {
            removeLast();
            addLast(e);
            return e;
        }
        int i=0;
        for(Node<E> x=head; x!=null; x=x.next)
        {
            if(i==index-1)
            {
                Node<E> next = x.next.next;
                Node<E> newNode = new Node<>(e);
                newNode.next=next;
                x.next = newNode;
                return e;
            }
            i++;
        }
        return e;
    }
    
    public void clear()
    {
        if(size==0)
            return;
        if(head.next!=null)
            head.next=null;
        head=null;
        tail=null;
        size=0;
    }
    
    public void print()
    {
        if(size==0)
            System.out.println("Empty");
        for(Node<E> x=head;x!=null;x=x.next)
            System.out.println(x);
    }
    
    public void reverse()
    {
        if(head==null||head.next==null||head==tail)
            return;
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> next;
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev=current;
            current = next;
        }
        
        tail=head;
        tail.next=null;
        head=prev;
    }
    
    public int size()
    {
        return size;
    }
    
}
