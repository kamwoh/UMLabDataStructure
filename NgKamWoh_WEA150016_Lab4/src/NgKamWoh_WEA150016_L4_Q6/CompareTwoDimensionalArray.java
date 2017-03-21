
package NgKamWoh_WEA150016_L4_Q6;


public class CompareTwoDimensionalArray {

    public static <E extends Comparable<E>> E min(E[][] list)
    {
        E min = list[0][0];
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list[i].length;j++)
            {
                if(list[i][j].compareTo(min)<0)
                    min = list[i][j];
            }
        }
        return min;
    }
    
    public static void main(String[] args)
    {
        Integer[][] i = {{1,2,3},{0,-1,-2},{9,4,6}};
        System.out.println("min element: "+min(i));
    }
    
}
