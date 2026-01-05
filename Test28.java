import java.util.Scanner;
class Test28
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c = 2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;)
			{
				if(!isPrime(c))
				{ 
					System.out.print(c+" ");
					j++;
				}
				c++;
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
}

/**
Enter aa value : 5
4
6 8
9 10 12
14 15 16 18
20 21 22 24 25
*/
