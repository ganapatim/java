//program to print first 5 numbers which are not multiples of 2 and 5
class C
{
	public static void main(String[]args)
	{
		int i=1,n=1;
		while(i<=5)
		{
			if(n%2!=0&&n%5!=0)
			{
				System.out.println(n);
				i++;
			}
			n++;
		}
	}
}