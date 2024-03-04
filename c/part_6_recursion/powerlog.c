#include<stdio.h>
int powerlog(int a, int b){
    if(b==1) return a;
    int x= powerlog(a,b/2);
    if (b%2==0)return x*x;
    else return x*x*a;
    
}
int main(){
    int a ,b;
    printf("Enter the base :");
    scanf("%d",&a);
    printf("Enter the power :");
    scanf("%d",&b);
    int p = powerlog(a,b);
    printf("the power of %d to the %d is : %d ",a,b,p);

    return 0;

}