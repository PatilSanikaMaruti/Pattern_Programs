class Pattern113
{
	public static void main(String[] args)
	{
		char ch='a';
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
					System.out.print(ch++ + " ");
				else
					System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}
	