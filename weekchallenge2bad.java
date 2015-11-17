package abc;

public class weekchallenge2bad 
{
	public static void printTree(int lEle,int whichAssignment)
	{
		for (int i=1; i<=lEle;i+=2)
		{ 	
			
			int Space=(lEle-i)/2;
			
			for(int j=0; j<Space;j++)	
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++)
			{
				switch(whichAssignment)
				{
					case 2:
						System.out.print("*");
						break;

					case 3:
						if (j%2==0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print("A");
						}
						break;
				}
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args)
	{
		printTree(9,2);
		printTree(9,2);
		printTree(9,3);
	}
}
