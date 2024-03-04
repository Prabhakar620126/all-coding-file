#include<stdio.h>
int main(){
    int n;
    printf("Enter the number : " );
    scanf("%d",&n);
    int a =1;
    // 2,4,6,8,10,.....gp series
    for(int i=1 ;i<=n; i++){
        printf("%d ",a);
        a=a*2;
    }
    int b=3;

    // 3,12,48,...
    for(int i=1;i<=n;i++){
        printf("%d ",b);
        b=b*4;
    }
    return 0;
}