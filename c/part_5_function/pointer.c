#include<stdio.h>
int main (){
    int a=5;
    printf("%p\n",&a);
    // both is same
    int* x = &a; // * is used for pointer (and for adress) 
    printf("%p\n",x); // %p se adress print hota hai 
    printf("%d\n",*x);  // again we get value at the adress os x 
    int **y =&x;
    // VVI  --> *x=7 ;   // a is changed 
    return 0;

}


/*
printf("%p\n",x); --> adress of a store in x 
printf("%p\n",&x); --> adress of  x 
printf("%p\n",*x); --> it is pointing what the store in x
int* x = &a;  --> int ka address store karta hai 
int** x = &a;  --> int* ka address store karta
*/