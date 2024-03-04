#include<stdio.h>
int main(){
    int product =1 , n;
    printf("Enter the number : ");
    scanf("%d",&n);
    // for(int i=1;i<=n;i++){
    //     product= product*i;
    // } printf(" the factorial of number is %d",product);

    // factorials of first n number 
for(int i=1;i<=n;i++){
    product = product*i;
    
    printf("\n The facrorial of %d is : %d",i,product);
}

// while loop
    int p=1;
    while (product>n)
    {
        
    }
    

    return 0;
}