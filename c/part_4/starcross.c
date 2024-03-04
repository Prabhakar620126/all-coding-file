#include<stdio.h>
 int main(){
    int n;
    printf("Enter the row number :");
    scanf("%d",&n);
    for(int i= 1; i<=n;i++){
        for(int j=1 ; j<=n;j++){
            if((j==i)|| j==(n+1-i)){
                printf("*");
            }else{
                printf(" ");
            }
            
        } printf("\n");
    
    }
    
     
    return 0 ;
 }