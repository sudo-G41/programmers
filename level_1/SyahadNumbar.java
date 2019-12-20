public class SyahadNumbar
{
	public boolean solution(int x)
	{
		int value = 0;
		for(int num = x; num != 0; num /= 10)
		{
			value = num%10;
		}
		if(x%value == 0){return true;}
		else{return false;}
	}
}
