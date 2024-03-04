#include <stdio.h>
int main (){
    int n;
    printf("enter the number : ");
    scanf("%d",&n);
    int a=1;
    int sum=1;
    for(int i=1; i<=n; i++){
        a=n%10;
        sum=(a*a*a);
        n/=n;
        


    }
    return 0;
}