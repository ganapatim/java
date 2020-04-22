//program to print first 10 numbers which are divisible by 3 and 6
class B
{
	public static void main(String[]args)
	{
		int i=1,n=1;
		while(i<=10)
		{
			if(n%3==0&&n%6==0)
			{
				System.out.println(n);
				i++;
			}
			n++;
		}
	}
}