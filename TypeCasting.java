public class TypeCasting
{
	public static void main(String[] args)
	{
		System.out.println("Widening");
		byte b = 44;
		System.out.println(b);
		int i = b;
		System.out.println(i);
		System.out.println("Narrowing");
		double d = 4.5;
		System.out.println(d);
		int x = (int)d;
		System.out.println(x);
	}
}
