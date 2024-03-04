#include<stdio.h>
int main(){
    int arr[5]= {1,32,4,5,7};
    int array[5];
    for(int i=0; i<=4;i++){
        printf("%d \n",arr[i]);
    }
    for(int i=0; i<=4;i++){
        scanf("%d",&array[i]);
    }
    for(int i=0; i<=4;i++){
        printf("%d ",array[i]);
    }


    char a[3]={'w','@','j'};
    printf("%c",a[1]);




    return 0;

}