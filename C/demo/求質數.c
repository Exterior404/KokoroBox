#include <stdio.h>

int P(int n) {
 int p=1, i;
 if(n<2) return 0;
 for(i=2; i<n; i++)
   if( (n%i)==0 ) p=0;
 return p;
}

void main() {
 int a;
 scanf("%d", &a);
 if(P(a)) printf("Y\n");
 else printf("N\n");
}