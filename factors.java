public class factors
{
public static void main(String[] args)
{
int x = 10;
int a=x, b=2, rem=0;
while(b<a)
	{
		rem = x%b;
		if(rem == 0)
			{
				System.out.println(b);
				b++;
			}
		else
			{ 
				b++;
			}
	}

}
}