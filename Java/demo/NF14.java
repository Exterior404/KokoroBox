class Main {
	public static void main(String args[]) {
		byte b;
		int i = 257;
		double d = 323.142;

		System.out.print("\n Conversion of int to byte.");
		b = (byte)i;
		System.out.print("\n i >>> b = " + i + " " + b);

		System.out.print("\n Conversion of double to int.");
    	i = (int)d;
    	System.out.print("\n d >>> i = " + d + " " + i);

    	System.out.print("\n Conversion of double to byte.");
    	b = (byte)d;
    	System.out.print("\n d >>> b = " + d + " " + b);
	}
}//跟C一樣 轉型會丟失資料