import java.util.Scanner;
class Test40
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c = 1;
			for(int j=1;j<=n;j++)
			{
				if(j<=n-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(c+++" ");
				}
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/
