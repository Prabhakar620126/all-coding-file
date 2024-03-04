#include<stdio.h>
int main(){
    // // write a c programm to print Alphabet from A to Z using loop 
    // char ch;
    // for(ch ='A' ; ch <= 'Z'; ch++){
    //     printf("%c  ",ch) ;
    // }

    // //write a c program to find factorial of a number 
    // int n , ans = 1;
    // printf("\nEnter the number : ");
    // scanf("%d",&n);
    // for(int i=1; i<=n; i++){
    //     ans=ans*i;
    //     printf("\nthe factorial of %d is: %d",i,ans);
    // }
    // printf("\nthe factorial of %d is: %d",n,ans);

    // //write a c program  to make simple calculator 
    // int choice;
    // float num1 , num2 ,result;
    // printf("\ncalculator menu : \n ");
    // printf("1. addition \n ");
    // printf("2.Subtraction  \n ");
    // printf("3. multiplication  \n ");
    // printf("4.division\n ");
    // printf("Enter the choice (1/2/3/4/): \n ");
    // scanf("%d",&choice);
    // if (choice<1 || choice>4 ){
    //     printf("Invalid choice\n");
    // }else {
    //     printf("enter two number :");
    //     scanf("%f %f",&num1,&num2);
    //     switch (choice){
    //         case 1 : 
    //         result = num1+ num2;
    //         printf("result : %f\n",result);
    //         case 2 : 
    //         result = num1- num2;
    //         printf("result : %f\n",result);
    //         case 3 : 
    //         result = num1* num2;
    //         printf("result : %f\n",result);
    //         case 4 : 
    //         if(num2 !=0){
    //             result = num1/ num2;
    //         printf("result : %f\n",result);
    //         }else{
    //             printf(" Division by zero is not allowed");
    //         }
    //         break;    
    // }
    // }


    // WAP  to generate multiplication table 
    int number ;
    printf(" Enter the number  to generate is multiplication table :\n");
    scanf("%d",&number);
    printf(" multiplication table  for %d: \n",number);
    for(int i= 1; i<=10;i++){
        printf("%d * %d = %d \n",number, i , number*i);
    }

    //WAP to print fabonacci series
    int n , frist=0 , second =1 , next;
    printf(" Enter the number of terms for the fibnacci series: ");
    scanf("%d ",&n );
    printf("fibonacci series : \n");
    for(int i=0; i<n; i++){
        printf("%d  ",frist);
        next= frist+ second;
        frist= second;
        second = next;
    } printf("\n");

    //
    





    return 0 ;
}

 
