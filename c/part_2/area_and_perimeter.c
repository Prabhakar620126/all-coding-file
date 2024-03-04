#include <stdio.h>
int main(){
    int l;
    printf("enter the length : ");
    scanf("%d",&l);
    int b;
    printf("enter the breadth : ");
    scanf("%d",&b);
    int area = l*b;
    int perimeter = 2*(l+b);
    if(area>perimeter){
        printf("area is%d and perimeter is %d  and area is greater by : %d",area,perimeter,area-perimeter);

    }if(area<perimeter){
        printf("area is %d and perimeter is %d  and perimeter is greater by : %d",area,perimeter,perimeter-area);

    }if(area==perimeter){
        printf("area is equall to  perimeter by : ");

    }
    
    
    return 0;
}