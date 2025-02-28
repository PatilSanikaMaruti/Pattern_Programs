class Pattern86
{
	public static void main(String [] args)
	{
		int n=5;
		int a=0;
		for(int i=1;i<=n;i++)
		{
			a=a+i;
			int temp=a;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
		}
	}
	
}
