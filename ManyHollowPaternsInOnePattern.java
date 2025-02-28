class ManyHollowPaternsInOnePattern
{
	public static void main(String[] args)
	{
		int n=5;

		//1
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==5 || i==j)
					System.out.print("*" +" ");
				else
					System.out.print(" "+" ");

			}
			System.out.println();
		}*/

		//2
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" "+" ");											
			}
			for(int j=1;j<=i;j++)											
			{
				if(j==1 || i==j || i==5)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}*/
		
		//3
		/*for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==5 || i==j || j==1)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/
		
		//4
		/*for(int i=5;i>=1;i--)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i==5 || i==j || j==1)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

		
		//5
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" "+" ");											
			}
			for(int j=1;j<=i;j++)											
			{
				if(j==1 ||i==j )
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i==j || j==1 )
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

		//6
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j)
					System.out.print("*" +" ");
				else
					System.out.print(" "+" ");

			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==j|| j==1 )
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

		//7
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print(" "+" ");											
			}
			for(int j=1;j<=i;j++)											
			{
				if(j==1 || i==j || i==5)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			
			for(int j=2;j<=i;j++)
			{
				if(j==1 || i==5 || i==j)
					System.out.print("*" +" ");
				else
					System.out.print(" "+" ");

			}
			System.out.println();
		
		}*/

		//8
		/*for(int i=5;i>=1;i--)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i==5|| i==j || j==1)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			
			for(int j=2;j<=i;j++)
			{
				if(i==5 || j==1|| i==j )
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/


		//9
		/*for(int i =1; i<=5;i++)
		{
			for(int j=1; j<=5-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				if(i==5 ||j==1 )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			for(int j =2; j<=i; j++)
			{
				if(i==5 ||j==1|| i==j )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

		//10
		/*for(int i=5;i>=1;i--)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i==5|| i==j || i==j)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			
			for(int j=2;j<=i;j++)
			{
				if(i==5 ||  j==1||i==j )
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

		//11
		/*for(int i =1; i<=5;i++)
		{
			for(int j=1; j<=5-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				if(j==1 )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			for(int j =2; j<=i; j++)
			{
				if(j==1|| i==j )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for(int i=5-1;i>=1;i--)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i==j || i==j)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			
			for(int j=2;j<=i;j++)
			{
				if(j==1||i==j )
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}*/

	}
}