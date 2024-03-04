#include<stdio.h>
int main(){
    //in 2D array arr[row][coloum]
    int arr[2][2];
     arr[0][0] = 4;
     arr[0][1]=3;
     arr[1][0] =5;
     arr[1][1]= 8;  

    for(int i =0;i<=1;i++){
        for(int j =0; j<=1; j++){
        printf("%d   %d",arr[i][j]);
        }
    printf("\n");
    }

    return 0;
}