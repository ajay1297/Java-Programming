public class GuessOutput
{
	public static void main(String[] main)
	{
		System.out.println(" Ajay ");			//Ajay
		System.out.println(" Ajay "+5);			//Ajay 5
		System.out.println(" Ajay "+5+5);		//Ajay 55
		System.out.println(" Ajay "+(5+5));		//Ajay 10
		System.out.println(5+" Ajay ");			//5 Ajay
		System.out.println(5+5+" Ajay ");		//10 Ajay
		System.out.println(3 * 3 + " Ajay ");   	//9 Ajay
		System.out.println(" Ajay " + 3 * 3);   	//Ajay 9 (* have higher priority level than +)
		//System.out.println(" Ajay " * 3);		ERROR
		//System.out.println(" Ajay " + 3 - 3);		ERROR  (+ and - have same level of priority)
		System.out.println(" Ajay " + 3/3);		//Ajay 1
		System.out.println(" Ajay " + 3 * 0);		//Ajay 0
		//System.out.println(" Ajay " + 3 - 0);		ERROR
		System.out.println(" Ajay " + 3 * (5-3));	//Ajay 6
		int j = '5' + '6' * ('4' - 50) + 'b'/2;
		System.out.println(j);
	}
}
