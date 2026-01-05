import java.util.Scanner;
class Test17
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
			    if(j<=i)
				System.out.print(i+" ");
				else
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5
*/
