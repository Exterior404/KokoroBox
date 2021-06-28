#include <stdio.h>
#include <stdlib.h>


void main() {
	int i,j,temp;
	int a[10] = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};

	for(i=0; i<10; i++) {
		int min = i;
		for(j=i+1; j<10; j++) {
			if (a[j]<a[min]) {
				min = j;
			}
		}
		temp = a[min];
		a[min] = a[i];
		a[i] = temp;
	}

	int k;
	for(k=0; k<10; k++) {
		printf("%d\n", a[k]);
	}
	system("pause");
}