
package NgKamWoh_WEA150016_L4_Q5;


public class Circle implements Comparable {

    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Object o) {
        Circle c = (Circle)o;
        if(this.radius>c.radius)
            return 1;
        else if(this.radius<c.radius)
            return -1;
        else
            return 0;
    }
    
    public String toString()
    {
        return String.valueOf(radius);
    }

}
