#include<stdio.h>
int main(){
    int n;
    printf("enter the the number :");
    scanf("%d",&n);
    int min =0;
    for(int i=1;i<=2*n-1;i++){
        for(int j=1;j<=2*n-1;j++){
                int a = i;
                if(i>n)a=2*n-i;
                int b= j;
                if(j>n)a=2*n-j;
                if (a>b)min=b;
                else min=a;
                printf("%d",n+1-min);
        }
        printf("\n");
    }
    return 0;
}