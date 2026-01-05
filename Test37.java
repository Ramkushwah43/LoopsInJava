import java.util.Scanner;
class Test37
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				System.out.print("* ");
				else
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
* * * * *
* 2 3 4 *
* 2 3 4 *
* 2 3 4 *
* * * * *
*/
