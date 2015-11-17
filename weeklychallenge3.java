package abc;

public class weeklychallenge3
{
	public static void printLine(int numElements, int numStars)
	{
		if (numElements%2==0)
		{
			System.out.println("Error: numElements must be odd");
			return;
		}
		if (numStars%2==0)
		{
			System.out.println("Error: numStars must be odd");
			return;
		}
		int Space=(numElements-numStars)/2;
		for (int i=0; i<Space; i++)
		{
			System.out.print(" ");
		}
			
		for (int i=0;i<numStars;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printTree(int numLargestElements)
	{
		for(int x=1;x<numLargestElements; x+=2)
		{
			printLine(numLargestElements,x);
		}
	}
	
	public static void main(String[]args)
	{
		printTree(9);
		printTree(9);
	}
}
