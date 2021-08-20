class Main {
	public static void main(String arg[]) {
		int a = 1, b =2;
		int c,d;
		c = ++b;
		d = a++;//優先級較後 沒發動成功

		System.out.print("a = " + a + "\n");
		System.out.print("b = " + b + "\n");
		System.out.print("c = " + c + "\n");
		System.out.print("d = " + d + "\n");
	}
}