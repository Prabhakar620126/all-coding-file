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
    for(int i =0;i<r;i++){
        for(int j =0; j<c; j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}