package recursion;

public class RecursiveFactorial
{

    /**
     * The basic recursive factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        if (n < 0)
            return 0; //if given negative integer
        else if (n <= 1)
            return 1; //base case
        else
            return n*basic(n-1); //recursive portion
    }
    
    
    
    /**
     * The tail recursive version of factorial.
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        if (n < 0)
            return 0; //if given negative integer
        else
            return helper(n,1);
    }

    /**
     * The tail recursive helper function for factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long n, long partial)
    {
        long result = 0;
        
        if (n == 0)
            result = partial; //base case
        else{
            return helper(n-1,n*partial); //recursive portion
        }
      
        return result;
    }

}
