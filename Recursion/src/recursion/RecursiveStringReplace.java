package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {
        String result = null;
        System.out.println("String in: " + s + " | In length: " + s.length() + "\n");

        if (s.length() == 0){
            return s;
        }
        else {
            
            result = s.substring(0, 1);
            System.out.println("Normal case detected... recursion occuring");
            if (from == s.charAt(0))
                result = String.valueOf(to);
            result += replace(s.substring(1, s.length()), from, to);
        }

        return result;
    }


}
