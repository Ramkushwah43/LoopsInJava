import java.util.Scanner;
class Test38
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c1 = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print(c1*j+" ");
				}
				else
				{
					System.out.print(i*j+" ");
				}
			}
			if(i%2==0)c1++;
			System.out.println();
		}
	}
}

/**
Enter aa value : 5
1 2 3 4 5
1 2 3 4 5
3 6 9 12 15
2 4 6 8 10
5 10 15 20 25
*/
