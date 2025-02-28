class NumberPattern1
{
	public static void main(String[] args)
	{
		int a,b;
		for(int i=0;i<=5;i++)
		{
			 a=0;
			b=a;
			for(int j=1;j<=i;j++)
			{
				System.out.println(a-- + " " );
			}
			b=a;
		}
	}
}
		