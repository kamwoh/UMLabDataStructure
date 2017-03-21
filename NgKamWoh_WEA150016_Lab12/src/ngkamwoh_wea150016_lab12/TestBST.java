
package ngkamwoh_wea150016_lab12;


public class TestBST {

    public static void main(String[] args)
    {
        BST<Character> bst = new BST<>();
        //BST<Integer> bst = new BST<>();
        bst.insert('a');
        bst.insert('b');
        bst.insert('c');
        //bst.insert(20);
        //bst.insert(10);
        //bst.insert(40);
        //bst.insert(16);
        //bst.insert(30);
        //bst.insert(80);
        //bst.insert(14);
        //bst.insert(27);
        //bst.insert(50);
        System.out.println("Inorder");
        bst.inorder(bst.getRoot());
        System.out.println("\nPostorder");
        bst.postorder(bst.getRoot());
        System.out.println("\nPreorder");
        bst.preorder(bst.getRoot());
        System.out.println("\nRoot");
        System.out.println(bst.rootElement());
        System.out.println("Search for 'b'");
        System.out.println(bst.search('b'));
        //System.out.println(bst.search(30));
        System.out.println("Insert 'b'");
        System.out.println(bst.insert('b'));
        System.out.println("Insert 'd'");
        System.out.println(bst.insert('d'));
        System.out.println("Inorder");
        bst.inorder(bst.getRoot());
        System.out.println("");
        System.out.println("Delete 'c'");
        //System.out.println(bst.delete(20));
        System.out.println(bst.delete('c'));
        System.out.println("Inorder");
        bst.inorder(bst.getRoot());
        System.out.println("");
    }
}
