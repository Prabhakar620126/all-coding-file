#include <stdio.h>
int main(){
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    // if(n%5==0 && n%3==0 ){
    //     printf("number is divisible by both 3 and 5");
    // } else{
    //     printf(" number is not divisible by both 3 and 5");

    // }

    if(n%5==0 || n%3==0 ){
        printf("number is divisible by  3 or 5");
    } else{
        printf(" number is not divisible by  3 or 5");

    }
     
    return 0;
}