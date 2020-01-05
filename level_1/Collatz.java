/**
 *Collatz의 추측
 */
public class Collatz
{
	public int solution(int num)
	{
		int answer = 0;
		long collatzNum = num;
		for(;collatzNum!=1&&answer<500; answer++)
		{
			if(isEven(collatzNum))
			{
				collatzNum /= 2;
			}
			else
			{
				collatzNum = (3*collatzNum)+1;
			}
		}
		if(answer>499)
		{
			return -1;
		}
		return answer;
	}

	private boolean isEven(long num)
	{
		if(num%2==0) return true;
		else return false;
	}
}
