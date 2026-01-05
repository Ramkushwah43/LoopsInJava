import java.util.Scanner;
class Test6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/
