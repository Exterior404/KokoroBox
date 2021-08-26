class Main {
	public static void main(String atgs[]) {
		int a = 1;
		int b = 2;
		int c = 3;

		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;

		System.out.print("a = " + a + "\n");
		System.out.print("b = " + b + "\n");
		System.out.print("c = " + c + "\n");
	}
}