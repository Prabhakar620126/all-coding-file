#include <stdio.h>
int main(){
    printf("hellow");
    int n ;
    printf("\n enter the number that have to check :");
    scanf("%d",&n);
    if(n%5==0){
        printf("the number is divisible by five");
    }else{
        printf("the number is not divisible by five ");
    }
    return 0 ;
}