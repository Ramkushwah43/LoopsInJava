import java.util.Scanner;
class Test35
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(c%2==0)
				System.out.print("* ");
				else
				System.out.print(j+" ");
				c++;
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
1 * 3 * 5
* 2 * 4 *
1 * 3 * 5
* 2 * 4 *
1 * 3 * 5
*/
