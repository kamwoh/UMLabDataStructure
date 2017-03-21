
package ngkamwoh_wea150016_lab8;


public class Q1 {

    public static void main(String[] args)
    {
        int[] e = {3, 0, 71, 45, -100, 235, 90, 1, 11, -40, 35, 45};
        int target = 45;
        int x = linearSearch(e,target);
        if(x!=-1)
        {
            System.out.println("Element found at index "+x);
        }
        else
        {
            System.out.println("Not found");
        }
        System.out.println("Original array:");
        display(e);
        bubbleSort(e);
        System.out.println("Sorted array:");
        display(e);
    }
    
    public static void display(int[] e)
    {
        for(int i=0;i<e.length;i++)
        {
            System.out.print(e[i]+" ");
        }
        System.out.println("");
    }
    
    public static int linearSearch(int[] e, int element)
    {
        for(int i=0;i<e.length;i++)
        {
            if(e[i]==element)
                return i;
        }
        return -1;
    }
    
    public static void bubbleSort(int[] e)
    {
        for(int i=0;i<e.length;i++)
        {
            for(int j=0;j<e.length-i-1;j++)
            {
                if(e[j]>e[j+1])
                {
                    int temp = e[j];
                    e[j] = e[j+1];
                    e[j+1] = temp;
                }
            }
        }
    }
    
}
