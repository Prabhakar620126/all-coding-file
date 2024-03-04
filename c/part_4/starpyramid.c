#include<stdio.h>
 int main(){
    int n;
    printf("Enter the row number :");
    scanf("%d",&n);
    // int a=1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1 ; j<=n-i;j++){
    //         printf(" ");
    //     }
    //     for(int k=1;k<=a; k++){
    //         printf("*");
    //     }
    //     a=a+2;
    //     printf("\n");
    // }

    // other method by formula 
    for(int i=1;i<=n;i++){
        for(int j=1 ; j<=n-i;j++){
            printf(" ");
        }
        for(int k=1;k<=2*i-1; k++){
            printf("*");
        }
        printf("\n");
    }
    
     
    return 0 ;
 }