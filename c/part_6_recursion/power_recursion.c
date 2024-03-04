#include<stdio.h>
int power(int a, int b){
    if(b==0) return 1;
    int ans= a*power(a,b-1);
    return ans;
}
int main(){
    int a ,b;
    printf("Enter the base :");
    scanf("%d",&a);
    printf("Enter the power :");
    scanf("%d",&b);
    int p = power(a,b);
    printf("the power of %d to the %d is : %d ",a,b,p);

    return 0;

}