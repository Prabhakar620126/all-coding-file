#include<stdio.h>
int main(){
    // fibonacci series is: 1 1  2  3  5  8  13  21......
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    int a=1;
    int b=1;
    int sum =1;
    for(int i=1; i<n-2 ; i++){
        sum = a+b;
        a=b;
        b=sum;
        //printf("\nthe  %d fibonacci number  is %d:",i,sum);
        
        printf("%d   ",sum);
    }

    return 0;

}