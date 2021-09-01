class Main {
	public static void main(String args[]) {
		for(int i = 0; i < 12; i++)
			switch(i) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				System.out.print("i is less 5\n");
				break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				System.out.print("i is less 10\n");
				break;
				default:
				System.out.print("i is 10 or more.\n");
			}
	}
}