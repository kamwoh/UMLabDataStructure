

package ngkamwoh_wea150016_q1234;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Woh
 * From line 13 to 168 is question one
 * From line 148 to 164 is union, question 2
 * From line 165 to 197 is intersection, question 3
 * From line 198 onwards is difference, question 4
 */
public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private static final int DEFAULT_CAPACITY = 10;
    public int capacity;
    private int numberOfEntries = 0;
    
    public ArrayBag()
    {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayBag(int capacity)
    {
        this.capacity = capacity;
        bag = (T[])new Object[capacity];
    }
    
    public ArrayBag(ArrayBag<T> arrbag)
    {
        this.bag=arrbag.toArray();
        this.capacity=arrbag.capacity;
        this.numberOfEntries=arrbag.getCurrentSize();
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries==capacity;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries==0; 
    }

    @Override
    public boolean add(T newEntry) {
        if(isFull())
            return false;
        bag[numberOfEntries]=newEntry;
        numberOfEntries++;
        sort();
        return true;
    }
    
    @Override
    public T remove() {
        
        T temp = bag[new Random().nextInt(numberOfEntries)];
        if(remove(temp))
            return temp;
        return null;
    }

    
    @Override
    public boolean remove(T anEntry) {
        for(int i=0;i<numberOfEntries;i++)
        {
            if(bag[i].equals(anEntry))
            {
                for(int j=i;j<numberOfEntries-1;j++)
                {
                    swap(bag,j,j+1);
                }
                bag[numberOfEntries-1]=null;
                numberOfEntries--;
                sort();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void clear() {
        bag = (T[])new Object[capacity];
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i=0;i<numberOfEntries;i++)
        {
            if(bag[i].equals(anEntry))
                count++;
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        int count = getFrequencyOf(anEntry);
        return count>0;
    }


    @Override
    public T[] toArray() {
        return (T[])bag.clone();
    }


    private void swap(T[] array, int oldIndex, int newIndex)
    {
        T temp = array[oldIndex];
        array[oldIndex] = array[newIndex];
        array[newIndex] = temp;
    }
    
    public void sort()
    {
        T[] array = bag;
        for(int i=0;i<numberOfEntries;i++)
        {
            for(int j=0;j<numberOfEntries-1-i;j++)
            {
                Comparable arr = (Comparable)array[j];
                Comparable arr2 = (Comparable)array[j+1];
                if(arr.compareTo(arr2)>0)
                {
                    swap(array,j,j+1);
                }
            }
        }
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag2)
    {
        ArrayBag<T> temp = new ArrayBag<>(this.getCurrentSize()+bag2.getCurrentSize());
        T[] bag2arr = (T[])bag2.toArray();
        for(int i=0;i<getCurrentSize();i++)
        {
            temp.add(bag[i]);
        }
        for(int i=0;i<bag2.getCurrentSize();i++)
        {
            temp.add(bag2arr[i]);
        }
        return temp;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> bag2) {
        
        ArrayBag<T> temp = new ArrayBag<>(this.capacity);
        T[] bag2arr = (T[])bag2.toArray();
        
        int intersectCount;
        for(int i=0;i<this.getCurrentSize();i++)
        {
            intersectCount = 0;
            if(temp.getFrequencyOf(bag[i])>0)
                continue;
             for(int j=0;j<bag2.getCurrentSize();j++)
             {
                 if(bag[i].equals(bag2arr[j]))
                 {
                     intersectCount++;
                     break;
                 }
             }
             if(intersectCount>0)
             {
                 int f1 = getFrequencyOf(bag[i]);
                 int f2 = bag2.getFrequencyOf(bag[i]);
                 int size = f1 > f2 ? f2 : f1;
                 for(int k=0;k<size;k++)
                 {
                     temp.add(bag[i]);
                 }
             }
        }
        return temp;
    }
    
    @Override
    public BagInterface<T> difference(BagInterface<T> bag2)
    {
        ArrayBag<T> temp = new ArrayBag<>(this);
        BagInterface<T> intersect = intersection(bag2);
        T[] bag2arr = (T[])intersect.toArray();
        for(int i=0;i<intersect.getCurrentSize();i++)
        {
            temp.remove(bag2arr[i]);
        }
        return temp;
    }
    
}
