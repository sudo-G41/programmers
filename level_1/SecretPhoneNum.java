public class SecretPhoneNum
{
	public String solution(String phone_number)
	{
		String answer;
		char[] phoneNumberChar = phone_number.toCharArray();
		int phoneLength = phone_number.length();
		for(int index = phoneLength-5; index>-1; index--)
		{
			phoneNumberChar[index] = '*';
		}
		answer = new String(phoneNumberChar);
		return answer;
	}
}
