#include<stdio.h>
int main (){
    int n;
    printf("Enter the marks: ");
    scanf("%d",&n);
    if(n>90 && n<=100){
        printf("outstanding o grade");
    }else if(n>80){
        printf("grage is A+");
    }else if(n>70){
        printf("grade is A");
    }else if(n>60){
        printf("grade is B+");
    }else if(n>50){
        printf("grade is B");
    }else if(n>40){
        printf("grade is c");
    }else{
        printf("grade is fall");
    }
    
    return 0 ;
}