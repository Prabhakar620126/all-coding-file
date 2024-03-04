#include<stdio.h>
 int main(){
    int n,m;
    printf("Enter the row number :");
    scanf("%d",&n);
    printf("Enter the  coloum number :");
    scanf("%d",&m);
    for(int i=1; i<=n; i++){
        for(int j=1; j<=m;j++){
            printf("%d",j);
        }printf("\n");
    }
     
    return 0 ;
 }