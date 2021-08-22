class Main {
	public static void main(String args[]) {
		String binary[] = {
			"0000","0001","0010","0011","0100","0101","0110","0111",
			"1000","1001","1010","1011","1100","1101","1110","1111"
		};

		int a = 3;
		int b = 6;
		int c = a|b;
		int d = a&b;
		int e = a^b;
		int f = (~a &b) |(a % ~b);
		int g = ~a & 0x0f;
		
		System.out.print(" a = " + binary[a] + "\n");
		System.out.print(" b = " + binary[b] + "\n");
		System.out.print(" c = " + binary[c] + "\n");
		System.out.print(" d = " + binary[d] + "\n");
		System.out.print(" e = " + binary[e] + "\n");
		System.out.print(" f = " + binary[f] + "\n");
		System.out.print(" g = " + binary[g] + "\n");
	}
}