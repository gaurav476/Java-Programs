import java.util.*;
public class PrimeGenerator
{
    private ArrayList<Integer> primeNo = new ArrayList<Integer>();
    private int count = 1;

    // generating k prime numbers list
    public PrimeGenerator(int num)
    {
        int flag;
        for(int i = 2; i < 10000; i++)
        {
            if(count <= num)
            {
                flag=0;
                for(int j = 2; j <= Math.sqrt(i) ; j++)
                {
                    if(i % j == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                {
                    primeNo.add(i);
                    count++;
                }
            }
            else
                break;
        }
    }

    // return generated prime Numbers List
    public ArrayList<Integer> getList()
    {
        return primeNo;
    }
}
