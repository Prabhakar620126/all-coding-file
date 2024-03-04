#include<stdio.h>
int main(){
    int a;
    printf("enter the  base number : ");
    scanf("%d",&a);
    int b;
    printf("enter the  exponent number : ");
    scanf("%d",&b);
    int power = 1;
    for(int i=1; i<=b; i++){
        power= power *a;
    }printf("the %d raised to power %d is %d:",a,b,power);

    
    

    return 0;

}