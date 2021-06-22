#include <stdio.h>

void main() {
    char text[] = "Welcome Hell";
    int length = sizeof(text) / sizeof(text[0]);
    printf("%s\n", text);
    printf("%d\n", length-1);
}