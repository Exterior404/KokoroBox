class Main {
	public static void main(String args[]) {
		int threeD[][][] = new int[3][4][5];
		int i, j, k;

		for(i=0; i<3; i++)
			for(j=0; j<4; j++)
				for(k=0; k<5; k++)
					threeD[i][j][k] = i*1 + j*5 + k*100;

		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0; k<5; k++){
					System.out.print(threeD[i][j][k] + " \n");
				}
				System.out.print(" \n");
			}
			System.out.print(" \n");
		}
	}
} 