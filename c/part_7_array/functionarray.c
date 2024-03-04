#include<stdio.h>
void fun (int x[]){
    x[3]= 5;
    return;

}
int main(){
    int arr[5]= {4,5,85,8,7};
    printf("%d\n",arr[3]);
    //fun(arr);
    //printf("%d\n",arr[3]);
    
    //even odd sum
    int sumeven=0;
    int sumodd = 0;
    for(int i=0;i<=6; i++){
        if(i %2 ==0){
            sumeven += arr[i];
        }else{
            sumodd += arr[i];
        }
    }
     printf("%d\n",sumeven);
      printf("%d\n",sumodd);
    printf("%d\n", (sumeven - sumodd));

    return 0;
}