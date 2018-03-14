public class GetBits
{
	public static void main(String[] args)
	{
		int x = 182;
		int p = 5;
		int n = 3;
		int z = (x >> (p+1-n)) & (~(~0<<n));
		System.out.println(z);
	}
}
