

package ngkamwoh_wea150016_lab6;

/**
 *
 * @author Woh
 */
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList<Character> test = new MyLinkedList<>();
        test.add('a');
        test.add('b');
        test.add('c');
        test.add('d');
        test.add('e');
        test.print();
        
        System.out.println("\nAfter reverse:");
        test.reverse();
        test.print();
        
        System.out.println("\nNumber of elements:"+test.size());
        
        System.out.println("\nFirst:"+test.getFirst()+"\nLast:"+test.getLast());
        
        Character c = test.remove(test.size()/2);
        System.out.println("\nDeleted:'"+c+"'");
        test.print();
        
        System.out.println("\nContains 'c'?: "+test.contains('c'));
        
        System.out.println("\nIndex of 'b' and 'c':");
        System.out.println("'b':"+test.indexOf('b'));
        System.out.println("'c':"+test.indexOf('c'));
        
        System.out.println("\nAfter replace hello:");
        test.set(0, 'h');
        test.set(1, 'e');
        test.set(2, 'l');
        test.set(3, 'l');
        test.add('o');
        test.print();
    }

}
