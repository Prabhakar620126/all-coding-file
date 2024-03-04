#include<stdio.h>
void fabionachhidowhile(){
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    int a=0;
    int b=1;
    int sum =1;
    int i=1;
    do{
        sum=a+b;
        a=b;
        b=sum;
        printf("%d  ",sum );
        i++;
    }while(sum<n);
    
}
void fabionachhi(){
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    int a=0;
    int b=1;
    int sum =1;
    int i=1;
    while(sum<n){
        sum=a+b;
        a=b;
        b=sum;
        i++;
        printf("%d  ", sum);

    }
}
int main(){
    // fibonacci series is: 1 1  2  3  5  8  13  21......
    fabionachhidowhile();
    fabionachhi();
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    int a=0;
    int b=1;
    int sum =1;
    for(int i=1 ; sum<n; i++){
        sum = a+b;
        a=b;
        b=sum;
        //printf("\nthe  %d fibonacci number  is %d:",i,sum);
        
        printf("%d   ",sum);
    }

    return 0;

}