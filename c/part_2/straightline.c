#include<stdio.h>
int main(){
    float x1,x2,x3,y1,y2,y3;
    printf("Enter the first X- coordinate : ");
    scanf("%f",&x1);
    printf("Enter the second X- coordinate : ");
    scanf("%f",&x2);
    printf("Enter the third X- coordinate : ");
    scanf("%f",&x3);
    printf("Enter the first Y- coordinate : ");
    scanf("%f",&y1);
    printf("Enter the second Y- coordinate :");
    scanf("%f",&y1);
    printf("Enter the third X- coordinate : ");
    scanf("%f",&y1);
    float m1 = (y2-y1)/(x2-x1);
    float m2 = (y3-y2)/(x3-x2);
    if(m1==m2){
        printf("these point lies on straight line");
    }else{
        printf("these point not lies on straight line");
    }
    

    return 0;
}