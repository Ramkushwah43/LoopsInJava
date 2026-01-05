import java.util.Scanner;
class Test27
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aa value : ");
		int n = sc.nextInt();
		int c = 2;
		System.out.println(1);
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;)
			{
				if(isPrime(c))
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
1
2 3
5 7 11
13 17 19 23
29 31 37 41 43
*/
