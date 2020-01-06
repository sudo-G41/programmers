/**
 * WhyChar
 */
public class WhyChar {

    public String change(String str)
    {
        String returnString = str.toUpperCase();
        char[] charString = returnString.toCharArray();
        boolean lowCase = false;
        for (int index = 0; index<charString.length; index++)
        {
            if(charString[index] != ' ')
            {
                if(lowCase)
                {
                    charString[index] += 'a'-'A';
                    lowCase = false;
                }
                else
                {
                    lowCase = true;
                }
            }
            else
            {
                lowCase = false;
            }
        }
        returnString = new String(charString);

        return returnString;
    }
}