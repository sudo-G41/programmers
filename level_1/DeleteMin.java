/**
 * 작은 수 제거하기
 * 정수를 저장한 배열, arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수 solution을 작성하여라.
 * 제거하고 난 배열이 빈 배열일 경우 -1이 들어간 배열을 리턴합니다.
 *
 * 제한조건
 * arr은 길이 1이상
 * 배열의 원소는 모두 서로 다른 정수(int)입니다.
 */

public class DeleteMin
{
	public int[] solution(int[] arr)
	{
		if(arr.length == 1)
		{
			int[] answer = {-1};
			return answer;
		}
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		for(int value:arr)
		{
			min = min<value ? min: value;
		}
		int answerIndex = 0;
		for(int value:arr)
		{
			if(value!=min)
			{
				answer[answerIndex++] = value;
			}
		}
		return answer;
	}
}
