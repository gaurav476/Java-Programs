import java.util.*;
public class Test{
    public static void main(String []args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No. of first k Prime:");
        n = input.nextInt();

        // check n must be greater than 0
        if(n <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        PrimeGenerator prime = new PrimeGenerator(n);

        MyIterator obj = new MyIterator(prime.getList()); // Iterator to access the List

        System.out.println("First " + n + " prime numbers are:");
        while(obj.hasNext() != false)
        {
            System.out.println(obj.next());
        }
    }
}
