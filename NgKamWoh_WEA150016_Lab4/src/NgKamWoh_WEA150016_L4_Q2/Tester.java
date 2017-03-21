
package NgKamWoh_WEA150016_L4_Q2;


public class Tester {

    public static void main(String[] args)
    {
        MyGeneric<String> s = new MyGeneric<>("String generic");
        MyGeneric<Integer> i = new MyGeneric<>(1234);
        System.out.println("string: "+s.getE());
        System.out.println("integer: "+i.getE());
    }
    
}
