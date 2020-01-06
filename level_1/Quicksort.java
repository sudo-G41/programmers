/**
 * Quicksort
 */
public class Quicksort
{
    final private int MAKER_MAX = 10;
    public long sort(long n)
    {
        long answer = 0L;
        int maker[] = new int[MAKER_MAX];
        while(n>0)
        {
            maker[(int)(n%10)] += 1;
            n /= 10;
        }

        for(int nIndex = MAKER_MAX-1; nIndex>-1; nIndex--)
        {
            for(int numberIndex = 0; numberIndex<maker[nIndex]; numberIndex++)
            {
                answer = 10*answer + nIndex;
                System.out.println("answer : "+answer+" maker : "+nIndex);
            }
        }
        return answer;
    }
}
