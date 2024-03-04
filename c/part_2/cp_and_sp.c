#include <stdio.h>
int main (){
    int cp;
    printf("enter the cost price : ");
    scanf("%d",&cp);
    int sp;
    printf("enter the selling price : ");
    scanf("%d",&sp);
    if(sp>cp){
        printf(" profit  and profit is: %d",(sp-cp));
    }if(sp<cp){
        printf("loss and loss is : %d",cp-sp);
    }if(cp==sp){
        printf("no loss and no profit");
    }
    // if(sp>cp){
    //     printf(" profit ");
    // }else{
    //     printf("loss");
    // }
    return 0;
}