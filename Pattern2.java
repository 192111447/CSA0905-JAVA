import java.util.Scanner;
class Pattern2
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int i,n,j,k;
	System.out.println("enter the n value:");
	n=s.nextInt();
	for(i=1;i<=n;i++)
	{
		for(k=0;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
                }
		System.out.println();
	}
	
}
}