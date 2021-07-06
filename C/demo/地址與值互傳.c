#include <stdio.h>

void swap(int *p1, int *p2) {
	int *temp;
	temp = p1;
	p1 = p2;
	p2 = temp;
	return;
}

void swaped(int p1,int  p2) {
	int temp;
	p1 = p2;
	p2 = temp;
	return;
}