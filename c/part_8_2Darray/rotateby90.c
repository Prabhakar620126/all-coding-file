#include<stdio.h>
int main(){
    int n;
    printf("enter the coloum/ row:\n");
    scanf("%d",&n);
    printf("enter the element of matrix :\n");
    int arr[n][n]  ;
    for(int i =0;i<n;i++){
        for(int j =0; j<n; j++){
            //printf("enter the %d %d :\n",i,j);
            scanf("%d ",&arr[i][j]);
        }
    }
    for(int i =0;i<n;i++){
        for(int j =0; j<n; j++){
           
            printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
    for(int i =0;i<n;i++){
        for(int j =i; j<n; j++){
            int temp = arr[i][j];
            arr[j][i] = arr[i][j];
            arr[i][j]= temp;
        }
    }
    
    
    for(int i =0;i<n;i++){
        for(int j =0; j<n; j++){
           
            printf("%d ",arr[j][i]);
        }
        printf("\n");
    }
    
    return 0;
}