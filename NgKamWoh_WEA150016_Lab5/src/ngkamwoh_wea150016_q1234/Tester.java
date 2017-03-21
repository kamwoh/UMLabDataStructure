
package ngkamwoh_wea150016_q1234;


public class Tester {

    public static void main(String[] args)
    {
        ArrayBag<Integer> bagInt = new ArrayBag<>(5);
        bagInt.add(1);
        bagInt.add(1);
        bagInt.add(2);
        bagInt.add(3);
        bagInt.add(5);
        display(bagInt);
        System.out.println("Current Size:"+bagInt.getCurrentSize());
        System.out.println("Contain 1?:"+bagInt.contains(1));
        System.out.println("Contain 4?:"+bagInt.contains(4));
        System.out.println("Is empty?:"+bagInt.isEmpty());
        System.out.println("Is full?:"+bagInt.isFull());
        System.out.println("Can I add one more?:"+bagInt.add(6));
        System.out.println("Frequency of 1:"+bagInt.getFrequencyOf(1));
        System.out.println("Remove random one:"+bagInt.remove());
        System.out.println("Can I remove 2:"+bagInt.remove(2));
        System.out.println("Current Size:"+bagInt.getCurrentSize());
        display(bagInt);
        bagInt.clear();
        System.out.println("Clear the bag:");
        display(bagInt);
        
        //Q2 to Q3
        ArrayBag<String> bag = new ArrayBag<>();
        bag.add("a");
        bag.add("b");
        bag.add("c");
        System.out.println("Bag 1");
        display(bag);
        ArrayBag<String> bag2 = new ArrayBag<>();
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        System.out.println("Bag 2");
        display(bag2);
        
        //Q2
        System.out.println("Union");
        BagInterface<String> aa = bag.union(bag2);
        display(aa);
        
        //Q3
        System.out.println("Intersection");
        BagInterface<String> bb = bag.intersection(bag2);
        display(bb);
        
        //Q4
        BagInterface<String> cc = bag.difference(bag2);
        System.out.println("Bag 1 Difference Bag 2");
        display(cc);
        
        BagInterface<String> dd = bag2.difference(bag);
        System.out.println("Bag 2 Difference Bag 1");
        display(dd);
        
        System.out.println("Bag 1 is not affected");
        display(bag);
        
        //display(bag);
    }
    
    public static <T> void display(BagInterface<T> bag)
    {
        Object[] intArray = bag.toArray();
        System.out.println("Current in the bag:");
        if(intArray.length==0)
        {
            System.out.println("Empty");
            return;
        }
        for(int i=0;i<bag.getCurrentSize();i++)
        {
            System.out.print(intArray[i]+" ");
        }
        System.out.println("\n");
    }
    
}
