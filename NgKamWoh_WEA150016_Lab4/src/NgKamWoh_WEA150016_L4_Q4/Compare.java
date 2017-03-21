
package NgKamWoh_WEA150016_L4_Q4;


public class Compare {

    public static <T extends Comparable<T>> String minimax(T[] t)
    {
        T min = t[0];
        T max = t[0];
        for(int i=0;i<t.length;i++)
        {
            if(t[i].compareTo(max)>0)
                max=t[i];
            if(min.compareTo(t[i])>0)
                min=t[i];
        }
        return "Min = "+min+" Max = "+max;
    }
    
    public static void main(String[] args)
    {
        Integer[] intArr = {5,3,7,1,4,9,8,2};
        String[] strArr = {"red","blue","orange","tan"};
        String intStr = minimax(intArr);
        String strStr = minimax(strArr);
        System.out.println("intStr: "+intStr);
        System.out.println("strStr: "+strStr);
    }
}
