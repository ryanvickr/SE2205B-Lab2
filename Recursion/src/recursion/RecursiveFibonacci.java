package recursion;
public class RecursiveFibonacci
{


    /**
     * basic - The simple version of fibonacci.
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonacci number.
     */
    public long basic(long n)
    {
        long result = 1;
        
        if( n <= 0)
            result = 0;
        else if (n == 1)
            result = 1;
        else
            result = basic(n-1) + basic(n-2);
        
        return result;
    }
    
    
    /**
     * better - A better version of fibonacci. (Height Limited Double Recursion)
     * 
     * @param  n   A positive integer.
     * @return     The nth fibonacci number.
     */
    public long better(long n)
    {
        long result = 0;
        
        if(n<=0)
            result = 0;
        else if(n==1)
            result = 1;
        else if(n%2 == 0)
            result = better(n/2)*better(n/2) + 2*better(n/2)*better((n/2) - 1);
        else
            result = 2*better(n/2)*better(n/2) + 2*better(n/2)*better((n/2) - 1) + better((n/2) - 1)*better((n/2) - 1);
        
        return result;
    }


    /**
     * tailRecursive - A tail recursive version of fibonacci. 
     *              (Height limited, Two problems per level)
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonacci number.
     */
    public long tailRecursive(long n)
    {       
        return helper(n,1,0);
    } 
    
     
    /**
     * helper - The tail recursive helper function.
     * 
     * @param  n   A positive integer. 
     * @param  fi  The partial result f(i).
     * @param  fi1   The partial result f(i-1).
     * @return      The nth fibonacci number.
     */

    public long helper(long n, long fi, long fi1)
    {  
        System.out.println("helper called!");
        long result = 0;
        if(n <= 0) result = fi1;
        else if(n == 1) result = fi;
        else if(secondMSB(n))
            result = helper(reduceBy2ndMSB(n), 2*fi*fi + 2*fi*fi1 + fi1*fi1, fi*fi + 2*fi*fi1);
        else
            result = helper(reduceBy2ndMSB(n), fi*fi + 2*fi*fi1, fi*fi + fi1*fi1);
        return result;
    }
       

    /**
     * secondMSB - Determine the value of the second most significant bit.
     * 
     * @param  n   A positive integer 
     * @return     True if the second most significant bit is 1, false otherwise.
     */    
    public boolean secondMSB(long n)
    {
        // IMPLEMENT THIS METHOD AND RETURN AN APPROPRIATE VALUE
//>>>>>>>>> REPLACEMENT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>        
        String bin = Long.toBinaryString(n); //convert to binary string
        
        if (bin.substring(1, 2).equals("1")){ //tests if second MSB is a 1
            return true;
        }
        else 
            return false;
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
    }


    /**
     * reduceBy2ndMSB - Reduce the number by removing the second most significant bit
     * from the representation.
     * 
     * @param  n   A positive integer > 1
     * @return     The integer value equivalent to removing the 2nd most significant bit
     *              from n.
     */    
    public long reduceBy2ndMSB(long n)
    {
        long result = 1;
        // IMPLEMENT THIS METHOD
//>>>>>>>>> ADDED CODE >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        String bin = Long.toBinaryString(n);
        bin = bin.substring(0, 1) + bin.substring(2,bin.length());
        result = Long.parseLong(bin, 2);
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        return result;
    }
    
    
}
