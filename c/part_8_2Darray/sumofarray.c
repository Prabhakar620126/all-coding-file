#include<stdio.h>
int main(){
    int r,c;
    printf("enter the row:\n");
    scanf("%d",&r);
    printf("enter the coloum:\n");
    scanf("%d",&c);
    printf("enter the element of matrix :\n");
    int arr[r][c]  ;
    for(int i =0;i<r;i++){
        for(int j =0; j<c; j++){
            printf("enter the %d %d :",i,j);
            scanf("%d ",&arr[i][j]);
        }
    }
    int brr[r][c] ;
    for(int i =0;i<r;i++){
        for(int j =0; j<c; j++){
            printf("enter the %d %d :",i,j);
            scanf("%d ",&brr[i][j]);
        }
    }
    int res[r][c];
    for(int i =0;i<r;i++){
        for(int j =0; j<c; j++){
            res[i][j] = arr[i][j] + brr[i][j];
            printf("%d ",res[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}