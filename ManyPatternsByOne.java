class ManyPatternsByOne
{
	public static void main(String[] args)
	{
		//1
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/


		// 2
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");											
			}
			for(int j=1;j<=i;j++)											
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		

		//3
		
		/*for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/


		//4
		/*for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}*/


		//5
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");											
			}
			
			for(int j=1;j<=i;j++)											
			{
				System.out.print("* ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		

		//6
		/*for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}*/


		//7
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/


		//8
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");											
			}
			for(int j=1;j<=i;j++)											
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=(5-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}*/

		
		//9
		int num=5;
		/*for(int i =1; i<=5;i++)
		{
			for(int j=1; j<=num-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j =2; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/


		//10
		/*int num=5;
		for(int i =num; i>=1;i--)
		{
			for(int j=1; j<=num-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j =2; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/


		//11
		int num=5;
		for(int i =1; i<=5;i++)
		{
			for(int j=1; j<=num-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j =2; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i =num-1; i>=1;i--)
		{
			for(int j=1; j<=num-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			for(int j =2; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
}
