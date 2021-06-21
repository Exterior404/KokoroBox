#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
long long int a, b, c;

 while(1) {

   if(scanf("%lld %lld", &a, &b)<2) {
   	break;
   }

   if(a>b) {
   	c=a-b;
   }

   else {
   	c=b-a;
   }

   printf("%lld\n", c);

 }
}
