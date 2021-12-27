public class OperatorLogika{
	public static void main(String [] args)
	{
		boolean a,b,c;

		a = true;
		b = false;

		// Operator dan / konjungsi 
		c = a && b;

		System.out.println("true && false = " + c);

		// Operator Atau / Disjungsi
		c = a || b;
		System.out.println("true || false = " +c);

		// negasi (bukan)
		System.out.println("Negasi, !true = " +!a);
	}
}