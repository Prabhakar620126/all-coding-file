#include <stdio.h>
int main()
{

    int a = 1, b = 2;
    do
    {
        printf("hi\n");
        while (b++)
        {
            printf("%d  \n, ",b);
            b = b - a;
            printf("%d\t%d  1st \n  ", a, b);
            a = a + b;
            printf("%d\t%d  2nd  \n", a, b);
        }
    } 
    while (a++ < 2);
    printf("%d\t%d  3 rd ", a, b);
    return 0;
}
