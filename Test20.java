import java.util.Scanner;
class Test20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 7
1 0 1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1
*/
