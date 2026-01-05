import java.util.Scanner;
class Test25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 4
1
2 3
4 5 6
7 8 9 10
*/
