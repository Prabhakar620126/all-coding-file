#include<stdio.h>
 int main(){
    int n;
    printf("Enter the row number :");
    scanf("%d",&n);
    for(int i=1; i<=n; i++){
        // for space 
        for(int j=1; j<=n-i;j++){
            printf(" ");
        }
        // for *
        for(int k =1; k<=i; k++){
            printf("*");
        }printf("\n");
    }
    
     
    return 0 ;
 }