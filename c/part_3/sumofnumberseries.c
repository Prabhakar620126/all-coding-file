#include<stdio.h>
int main(){
    // int n;
    // printf("Enter the number :");
    // scanf("%d",&n);
    // // 1+2+3+....
    // int sum=0;
    // for(int i= 1; i<=n; i++){
    //     sum = sum+i;
    // }printf("%d",sum);

    //1-2+3-4+5....n terms 
    int p;
    printf("Enter the number :");
    scanf("%d",&p);
    int r=0;
    for(int i=1;i<=p;i++){

        if(i%2==0){
            r=r-i;
        }else{
            r=r+i;
        }
    }printf("sum of series is %d",r);

    return 0;
}