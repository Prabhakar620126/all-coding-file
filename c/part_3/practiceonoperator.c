#include<stdio.h>
int main(){
    // number of digit 
    // int n;
    // printf("enter the number :  ");
    // scanf("%d",&n);
    // int i=0;
    // while(n!=0){
    //     n=n/10;
    //     i++;
    // }
    // printf(" the digit of the number %d is:  %d",n,i);

    // sum of the digit
    // int n;
    // printf("enter the number :  ");
    // scanf("%d",&n);
    // int sum=0;
    // int i=0;
    // while(n!=0){
    //     i=n%10;
    //     sum=sum+i;
    //     n=n/10;
        
    // }
    // printf(" the sum digit of the number is:  %d",sum);

    //print the even number of given digit
    // int n;
    // printf("enter the number :  ");
    // scanf("%d",&n);
    // int sum=0;
    // int i=1;
    // while(n>0){ 
    //     int l=n%10;
    //     if(i%2==0){ 
    //         sum=sum+l;   
    //     } n=n/10;
    //     i++;    
    // }
    // printf(" the sum digit of the number is:  %d",sum);

    // print reverse of a given number 
    // int n, num;
    // printf("Enter the number : ");
    // scanf("%d",&n);
    // num= 0;
    // int i = 1;
    
    // while(n>0){
    //     num= num*10;
    //      num= num+(n%10);
    //     n/=10;

    // } printf("the reverse number is %d",num);


    //print the sum of given number and its reverse
    int n;
    printf("Enter the number :");
    scanf("%d",&n);
    int x = n;
    int num=0;
    while(n>0){
        
        num=num*10;
        num=num+(n%10);
        n/=10;
    }
    printf("reverse number is %d ",num);
    int sum = (x+num);
    printf("\nthe sum of number and its reverse is :%d",sum);


     

    return 0;
}