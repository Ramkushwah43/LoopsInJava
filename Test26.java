import java.util.Scanner;
class Test26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int a = -1;
		int b = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			    int c = a+b;
				a = b;
				b = c;
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 4
0
1 1
2 3 5
8 13 21 34
*/
