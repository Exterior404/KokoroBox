class Main {
	public static void main(String args[]) {
		char hex[] = {
			'0','1','2','3','4','5','6','7',
			'8','9','a','b','c','d','e','f'
		};

		byte b = (byte) 0xf1;
		byte c = (byte) (b >> 4);
		byte d = (byte) (b >>> 4);
		byte e = (byte) ((b & 0xff >> 4));

		System.out.print("(b = 0x\n" 
			+ hex[(b >> 4) & 0x0f] +hex[e & 0x0f]);
		System.out.print("(b >> 4 = 0x\n" 
			+ hex[(c >> 4) & 0x0f] +hex[e & 0x0f]);
		System.out.print("(b >>> 4 = 0x \n" 
			+ hex[(d >> 4) & 0x0f] +hex[e & 0x0f]);
		System.out.print("(b & 0xff) >> 4 = 0x\n" 
			+ hex[(e >> 4) & 0x0f] +hex[e & 0x0f]);
	}
}