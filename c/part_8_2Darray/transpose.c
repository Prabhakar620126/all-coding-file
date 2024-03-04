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
            //printf("enter the %d %d :\n",i,j);
            scanf("%d ",&arr[i][j]);
        }
    }
    for(int i =0;i<r;i++){
        for(int j =0; j<c; j++){
           
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    
    
    for(int i =0;i<c;i++){
        for(int j =0; j<r; j++){
           
            printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
    
    return 0;
}