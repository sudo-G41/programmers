/**
 *제곱근 판별
 *정수 n이 어떠한 정수의 제곱근이면 해당 정수+1의 제곱을 리턴하고
 *아니면 -1을 리턴하는 solution메소드를 만든다.
 */

public class ToSqrt
{
	public long solution(long n)
	{
		long answer;
		double readNum = Math.sqrt(n);
		long integer = (long)readNum;
		if(readNum-integer == 0.0)
		{
			answer = integer+1;
			return answer*answer;
		}
		else
		{
			answer = -1;
			return answer;
		}
	}
}
