
package ngkamwoh_wea150016_lab12;


public class BST<E extends Comparable<E>> {

    private TreeNode<E> root;
    private int size=0;
    
    public BST()
    {
        root=null;
    }
    
    public int search(E e)
    {
        if(root==null)
            return -1;
        else
        {
            TreeNode<E> current = root;
            while(current!=null)
            {
                if(current.e.compareTo(e)>0)
                    current = current.left;
                else if(current.e.compareTo(e)<0)
                    current = current.right;
                else
                    return 1;
            }
            return -1;
        }
    }
    
    public String insert(E e)
    {
        if(root==null)
            root=new TreeNode<>(e);
        else
        {
            TreeNode<E> current = root;
            TreeNode<E> parent;
            while(true)
            {
                parent = current;
                if(current.e.compareTo(e)>0)
                    current = current.left;
                else if(current.e.compareTo(e)<0)
                    current = current.right;
                else
                    return "Duplicates not inserted";
                
                if(current==null)
                {
                    if(parent.e.compareTo(e)>0)
                        parent.left = new TreeNode<>(e);
                    else
                        parent.right = new TreeNode<>(e);
                    size++;
                    break;
                }
            }
        }
        return e.toString();
    }
    
    public TreeNode<E> delete(TreeNode<E> root, E e)
    {
        if(e==null){}
        else if(root.e.compareTo(e)>0){ root.left = delete(root.left,e); }
        else if(root.e.compareTo(e)<0){ root.right = delete(root.right,e); }
        else
        {
            if(root.right==null) { root = root.left; }
            else
            {
                E successor = getMin(root.right);
                root.e = successor;
                root.right = delete(root.right,successor);
            }
        }
        return root;
    }
    
    public E getMin(TreeNode<E> root)
    {
        if(root.left==null)
            return root.e;
        else
            return getMin(root.left);
    }
    
    public boolean delete(E e)
    {
        if(search(e)==-1)
            return false;
        else
        {
            root = delete(root,e);
            return true;
        }
    }
    /*
    public boolean delete(E e) {
        boolean flag=(this.search(e)==1);
        this.root=this.deleteHelper(this.root, e);
        if (flag) {
            this.size--;
        }
        return flag;
    }
    
    private TreeNode<E> deleteHelper(TreeNode<E> root, E e) {
        if (root==null) {
            return null;
        }
        if (root.e.compareTo(e)>0) {
            root.left=this.deleteHelper(root.left,e);
            return root;
        }
        if (root.e.compareTo(e)<0) {
            root.right=this.deleteHelper(root.right, e);
            return root;
        }
        if (root.left==null) {
            return root.right;
        }
        if (root.right==null) {
            return root.left;
        }
        root.e=deleteHelper_FindMin(root.right);
        root.right=deleteHelper(root.right,root.e);
        return root;
    }
    private E deleteHelper_FindMin(TreeNode<E> root) {
        while (root.left!=null) {
            root=root.left;
        }
        return root.e;
    }
    */
    //1+2
    protected void inorder(TreeNode<E> root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.e+" ");
            inorder(root.right);
        }
    }
    //12+
    protected void postorder(TreeNode<E> root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.e+" ");
        }
    }
    //+12
    protected void preorder(TreeNode<E> root)
    {
        if(root!=null)
        {
            System.out.print(root.e+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public TreeNode<E> getRoot()
    {
        return root;
    }
    
    public String rootElement()
    {
        return root.toString();
    }
    
    public void clear()
    {
        root = null;
    }
    
    public int getSize()
    {
        return size;
    }
}
