//my iterator class
import java.util.*;
public class MyIterator implements Iterator
{
    private ArrayList<Integer> primeNo = new ArrayList<Integer>();
    private int size;
    private int count = 0;
    public MyIterator(ArrayList<Integer> prime)
    {
        this.primeNo = prime;
        this.size=prime.size();
    }

    // check next element present in list
    public boolean hasNext()
    {
        return count < size && primeNo.get(count) != null;
    }

    // return next element from list if it is present
    public Integer next()
    {
        return (Integer)primeNo.get(count++);
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
