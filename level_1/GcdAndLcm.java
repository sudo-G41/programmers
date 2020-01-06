/**
 *최대 공약수와 최소 공배수
 */
public class GcdAndLcm
{
	public int gcd(int number1, int number2)
	{
		int max, min;
		if(number1>number2)
		{
			max = number1;
			min = number2;
		}
		else
		{
			max = number2;
			min = number1;
		}
		while(min!=0)
		{
			int gcdNum = max%min;
			max = min;
			min = gcdNum;
			System.out.println(max+" " +min);
		}
		return max;
	}
	public int lcm(int number1, int number2)
	{
		return number1*number2/gcd(number1, number2);
	}
	public int[] solution(int n, int m)
	{
		int[] answer = {gcd(n, m), lcm(n, m)};
		return answer;
	}
}
