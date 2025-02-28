class Pattern104
{
	public static void main(String [] args)
	{
		int n=4;
		int oddDiff=7,evenDiff=-2;
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp + " ");
				if(j%2!=0)
				{
					temp+=oddDiff;
				}
				else
				{
					temp+=evenDiff;
				}
			}
				oddDiff-=2;
				evenDiff+=2;
				System.out.println();
		}
	}
	
}
