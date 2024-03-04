#include<stdio.h>
int main(){
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    // ternary operator 
    //exp1 ? exp2 :exp3
    n%2==0? printf("number is even") :printf("number is odd");
    // if(n%2==0){
    //     printf("number is even");
    // }else{
    //     printf("number is odd");
    // }
    return 0;
}