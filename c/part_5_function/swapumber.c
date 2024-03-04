#include <stdio.h>
void swap(int* x, int* y){
    int temp ;
    temp = *x;
    *x = *y;
    *y= temp;
    return;


}

int main(){
    int a ;
    printf("enter the frist number :");
    scanf("%d",&a);
     int b ;
    printf("enter the second number :");
    scanf("%d",&b);
    swap(&a,&b);
    // int temp;
    // temp = a;
    // a=b;
    // b=temp;
    printf("tne frist number is %d\n",a);
     printf("tne second number is %d\n",b);
    return 0 ;
}