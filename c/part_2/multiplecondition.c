#include <stdio.h>
int main(){
    int n;
    printf("enter the number :");
    scanf("%d",&n);
    if(n>99 && n<1000){
        printf("the number is three digit number");
    }
    else{
        printf("this is not three digit number ");
    }



    return 0 ;
}