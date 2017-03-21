
package NgKamWoh_WEA150016_L4_Q1;


public class StorePair<T> implements Comparable{
   private T first, second;

   public StorePair(T first, T second) {
       this.first = first;
       this.second = second;
   }

   public T getFirst() {
       return first;
   }

   public T getSecond() {
       return second;
   }

   public void setPair(T first, T second) {
       this.first = first;
       this.second = second;
   }

   @Override
   public String toString() {
       return "first = " + first + " second = " + second;
   }
   
   @Override
   public boolean equals(Object o)
   {
       StorePair<T> e = (StorePair<T>)o;
       if(e.getFirst().equals(this.first)&&e.getSecond().equals(this.second))
           return true;
       return false;
   }

    @Override
    public int compareTo(Object o) {
        StorePair<T> s = (StorePair<T>)o;
        Comparable f1 = (Comparable)s.getFirst();
        Comparable f2 = (Comparable)this.getFirst();
        return f2.compareTo(f1);
    }
   
}
