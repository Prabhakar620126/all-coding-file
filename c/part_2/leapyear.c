#include <stdio.h>
int main(){
    int year ;
    printf("enter  year which is check wheather leap year or not : ");
    scanf("%d",&year);
    if(year%4 == 0){
        printf("the year is leap year");
    }else{
        printf("the year is not leap year");
    }
    return 0 ;
}