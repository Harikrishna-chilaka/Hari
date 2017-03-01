#include<stdio.h>
void main()
{
    char ch[20];
    printf("Enter a string:");
    scanf("%[A-Za-z]",ch);
    printf(ch);
}
