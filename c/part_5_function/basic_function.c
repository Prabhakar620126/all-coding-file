#include<stdio.h>
void greet(){//external function
    printf("good morning\n");
    printf("how are you \n");

    return;
}
void england(){
    printf("I LOVE INDIA \n");
    india();

    return;
}
void india (){
    printf("INDIA IS MY COUNTRY\n");
    greet();
    return;
}
int main(){
    greet();// callinig of function
    england();

    return 0; 
}



/*
code start from main function  always
main function  ek bar hi aata hai 
starts with main 
unlimited function we uses
*/