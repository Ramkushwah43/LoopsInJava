import java.util.Scanner;
class Test10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(n+1);
		}
	}
}

/**
Enter aa value : 5
6
1 6
1 2 6
1 2 3 6
1 2 3 4 6
1 2 3 4 5 6
*/
