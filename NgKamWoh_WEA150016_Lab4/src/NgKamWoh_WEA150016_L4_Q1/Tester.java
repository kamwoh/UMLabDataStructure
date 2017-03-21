
package NgKamWoh_WEA150016_L4_Q1;


public class Tester {

    public static void main(String[] args)
    {
        StorePair<Integer> a = new StorePair<>(1,2);
        StorePair<Integer> b = new StorePair<>(2,3);
        StorePair<Integer> c = new StorePair<>(1,2);
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        System.out.println("C:"+c);
        System.out.println("A equals B:"+a.equals(b));
        System.out.println("A equals C:"+a.equals(c));
        System.out.println("A first value is bigger than B:"+a.compareTo(b));
        
    }
    
}
