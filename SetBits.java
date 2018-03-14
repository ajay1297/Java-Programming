public class SetBits
{
	public static void main(String[] args)
	{
		int x = 140;
		int p = 6;
		int n = 2;
		int y = 22;
		int z = y & (~(~0<<n));
		int a = x | z << (p+1-n);
		System.out.println(a);
	}
}
