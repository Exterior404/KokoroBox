#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(void) {
    char input[80];

    puts("請輸入字串...");
    scanf("%s", input);

    size_t length = strlen(input);
    printf("字串長度：%lu\n", length);

    return 0;
}