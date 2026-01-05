import java.util.Scanner;
class Test9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/
