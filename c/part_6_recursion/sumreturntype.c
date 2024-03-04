#include <stdio.h>
int sum(int n){
    if (n==0|| n==1){
        return;
    }
    int ans;
    ans= n + sum(n-1);
    
    return ans;
}
int main (){
    int n;
    printf("Enter the number :");
    scanf("%d",&n);
    int fact = sum(n);
   
    printf("%d",fact);
    return 0;
}