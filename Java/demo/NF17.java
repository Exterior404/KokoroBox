class Main {
	public static void main(String args[]) {
		double nums[] = {10, 20, 30, 40, 50};
		double result = 0;
		int i;

		for(i=0; i<5; i++) {
			result = result + nums[i];
		}
		System.out.print("Average is " + result/5);
	}
}