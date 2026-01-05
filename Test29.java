import java.util.Scanner;
class Test29
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c1 = n+1;
		int c2 = n+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((c1%c2) + " ");
				c1++;
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 4
0
1 2
3 4 0
1 2 3 4
*/
