#include<stdio.h>
 int main(){
    int n;
    printf("Enter the row number :");
    scanf("%d",&n);
    int m;
    printf("Enter the coloum number :");
    scanf("%d",&m);
    for(int i= 1; i<=n;i++){
        for(int j=1 ; j<=m;j++){
            if(j==1|| i==1 ||j==m|| i==n){
                printf("*");
            }else{
                printf(" ");
            }
            
        } printf("\n");
    
    }
    
     
    return 0 ;
 }