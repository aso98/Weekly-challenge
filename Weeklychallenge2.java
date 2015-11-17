package abc;

public class Weeklychallenge2
{	
	public static char printWhat(int x, int whichAssignment)
	{
		switch(whichAssignment)
		{
		case 2:
			return '*';
			
		case 3:
			if (x%2==0)
			{
				return '*';
			}
			else
			{
				return 'A';
			}			
		}
		return '*';
	}
	
	public static void printLine(int numElements, int numStars, int whichAssignment)
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
			System.out.print(printWhat(i, whichAssignment));
		}
		/*
		for (int i=0;i<numStars;i++)
		{
			System.out.print((i%2==0)?"*":"A");
		}
		*/
		System.out.println();
	}
	
	public static void printTree(int numLargestElements, int whichAssignment)
	{
		for(int x=1;x<numLargestElements; x+=2)
		{
			printLine(numLargestElements,x, whichAssignment);
		}
	}
	
	public static void main(String[]args)
	{
		printTree(9, 2);
		printTree(9, 2);
		printTree(9, 3);
	}
}
