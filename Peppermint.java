import java.util.*;
class Peppermint
{
	public static void main(String args[])
	{
		int n,mint,wrap,sum=0,count[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		count = new int[n];
		while(n>0)
		{
			mint = sc.nextInt();
			wrap = sc.nextInt();
			sum = (mint + wrap)/7;
			while(sum>=7)
			{
				sum = sum/7;
			}
			mint = mint + sum;
			count[n-1] = mint;
			n--;
		}
		for(int i=count.length-1;i>=0;i--)
			System.out.println(count[i]);
	}
}