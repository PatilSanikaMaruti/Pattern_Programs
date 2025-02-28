class Pattern88
{
	public static void main(String [] args)
	{
		int n=5;
		int evenDif=6,oddDif=-2;
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp + " ");
				if(j%2!=0)
				{
					temp+=evenDif;
					
				}
				else
				{
					temp+=oddDif;
					
				}
			}
				evenDif-=2;
				oddDif+=2;
				System.out.println();
		}
	
	}
}
// not complete