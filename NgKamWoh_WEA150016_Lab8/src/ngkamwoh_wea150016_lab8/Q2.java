
package ngkamwoh_wea150016_lab8;


public class Q2 {

    public static void main(String[] args)
    {
        int[] e = {3, 7, 10, 15, 91, 110, 150};
        int target = 91;
        int x = binarySearch(e,target);
        if(x!=-1)
        {
            System.out.println("Element is found index "+x);
        }
        else
        {
            System.out.println("Not found");
        }
    }
    
    public static int binarySearch(int[] e,int target)
    {
        return binarySearch(e,target,0,e.length-1);
    }
    
    public static int binarySearch(int[] e,int target,int min,int max)
    {
        if(max<min)
            return -1;
        int mid = (max+min)/2;
        if(e[mid]==target)
            return mid;
        else if(e[mid]>target)
            return binarySearch(e,target,min,mid-1);
        else
            return binarySearch(e,target,mid+1,max);
    }
    
}
