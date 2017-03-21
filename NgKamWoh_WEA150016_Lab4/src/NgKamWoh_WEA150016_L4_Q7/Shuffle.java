
package NgKamWoh_WEA150016_L4_Q7;

import java.util.ArrayList;
import java.util.Random;


public class Shuffle {

    public static <E> void shuffle(ArrayList<E> list)
    {
        Random rand = new Random();
        int randn1;
        int randn2;
        E temp;
        for(int i=0;i<list.size();i++)
        {
            randn1 = rand.nextInt(list.size());
            randn2 = rand.nextInt(list.size());
            
            temp = list.get(randn1);
            list.set(randn1, list.get(randn2));
            list.set(randn2,temp);
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        System.out.println("before shuffle: "+list);
        shuffle(list);
        System.out.println("after shuffle: "+list);
    }
    
    
}
