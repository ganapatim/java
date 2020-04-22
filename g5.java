//program to print first 15 numbers which are multiples of 7 but not divisible by 9
class D
{
	public static void main(String[]args)
	{
		int i=1,n=1;
		while(i<=15)
		{
			if(n%7==0&&n%9!=0)
			{
				System.out.println(n);
				i++;
			}
			n++;
		}
	}
}