import java.util.Scanner;
class Test31
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)System.out.print("    ");
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/**
Enter aa value : 11
* * * * * * * * * * *
    * * * * * * * * * * *
* * * * * * * * * * *
    * * * * * * * * * * *
* * * * * * * * * * *
    * * * * * * * * * * *
* * * * * * * * * * *
    * * * * * * * * * * *
* * * * * * * * * * *
    * * * * * * * * * * *
* * * * * * * * * * *
*/
