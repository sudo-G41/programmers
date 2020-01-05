/**
 *짝수와 홀수
 */
public class EvenOrOdd
{
	final private int Even = 2;
	public String solution(int num)
	{
		if(num%Even==0) return "Even";
		else return "Odd";
	}
}
