#include <stdio.h>

void main() {
	char c;
	for(c='A'; c<='Z'; c++) {
 		printf("%c %d\n", c, c);
		printf("%s\n", "-----------------");
	}   
}