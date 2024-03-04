#include<stdio.h>

int main (){
    void prabhakar(); // this is proto types  and prototypes used when function is  below the main function
    prabhakar();

    return 0;
}
void prabhakar(){
    printf (" how are you? \n");
    int a;
    printf("enter the number :");
    scanf("%d",&a);
    if (a%2==0){
        printf("number is even ");
    } else{
        printf(" enter  number is odd");
    }
    return ;

}