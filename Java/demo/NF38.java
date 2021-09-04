class Main {
	public static void main(String args[]) {
		int i, j;

		i = 100;
		j = 200;

		while(++i < --j);

		System.out.print("Midpoint is " + i +"\n");
	}
}