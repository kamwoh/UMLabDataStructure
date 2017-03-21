
package NgKamWoh_WEA150016_L4_Q3;


public class ComparableMax {

    public static <T extends Comparable<T>> T max(T t1, T t2, T t3)
    {
        if(t1.compareTo(t2)>0&&t1.compareTo(t3)>0)
            return t1;
        else if(t2.compareTo(t3)>0)
            return t2;
        else
            return t3;
    }
    
    public static void main(String[] args)
    {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        System.out.println("max of "+n1+" "+n2+" "+n3+":"+max(1,2,3));
    }
    
}
