class Pattern87
{
	public static void main(String [] args)
	{
		int n=5;
		int dif1=9,dif2=1;
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp + " ");
				if(j%2!=0)
				{
					temp+=dif1;
				}
				else
				{
					temp+=dif2;
				}
			}
				dif1-=2;
				dif2+=2;
				System.out.println();
		}
	}
	
}
