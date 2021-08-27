class Main {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;

		System.out.print("\n a = " + a);
		System.out.print("\n b = " + b);
		System.out.print("\n c = " + c);
		System.out.print("\n d = " + d);
		System.out.print("\n e = " + e);
		System.out.print("\n f = " + f);
		System.out.print("\n g = " + g);
	}
}