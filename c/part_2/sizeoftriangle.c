#include<stdio.h>
int main(){
    int a,b, c;
    printf("Enter the frist side of triangle :");
    scanf("%d",&a);
    printf("Enter the second side of triangle: ");
    scanf("%d",&b);
    printf("Enter the third side of triangle : ");
    scanf("%d",&c);
    if((a+b)>c && (b+c)>a &&(a+c)>b){
        printf(" valid triangle");
    }else{
        printf("not varid trianglee");

    }




    return 0 ;
}