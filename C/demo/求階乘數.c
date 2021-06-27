#include <stdio.h>
//算數學階乘的 
void main() {
	int x, sum = 1;
	printf("%s\n", "打個數字進去");
	scanf("%d", &x);
	
	while(x>0) {
		sum *= x;
		x--;
	}
	printf("運算結果是 %d\n" ,sum);
	
	system("pause");
}