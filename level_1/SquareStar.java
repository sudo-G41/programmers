public class SquareStar
{
	public void solution(int pointX, int pointY)
	{
		for(int yIndex = 0; yIndex<pointY; yIndex++)
		{
			for(int xIndex = 0; xIndex<pointX; xIndex++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
