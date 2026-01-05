import java.util.Scanner;
class Test36
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
				if(i%2==0)
				System.out.print((n-j+1)+" ");
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
5 4 3 2 1
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5
*/
