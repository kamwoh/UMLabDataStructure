
package NgKamWoh_WEA150016_L4_Q5;


public class FindMax {

    public static void main(String[] args)
    {
        Integer[] i = {1,2,3};
        String[] s = {"red","green","blue"};
        Circle[] c = {new Circle(3),new Circle(2.9),new Circle(5.9)};
        System.out.println("Integer array: "+max(i));
        System.out.println("String array: "+max(s));
        System.out.println("Circle array: "+max(c));
    }
    
    public static <E extends Comparable<E>> E max(E[] list)
    {
        E max = list[0];
        for(int i=1;i<list.length;i++)
        {
            if(list[i].compareTo(max)>0)
                max = list[i];
        }
        return max;
    }
    
}
