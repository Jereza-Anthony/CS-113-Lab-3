package cs113;

public class Main
{
	public static void main(String[] args)
	{
		int n = 10;
		int y1, y2 = 0;
		for(int i = 0; i < 10; i++)
		{
			y1 = 100 * n + 10;
			y2 = 5 * n * n + 2;
			n += 10;
			System.out.printf("%5d %8d\n", y1, y2);
		}
	}
}

//	The results do not surprise me because y2 has a factor of n^2 while y1 only has a factor of n.  
