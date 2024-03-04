#include<stdio.h>
#include<string.h>
int main(){
    char ch = '\0'; // null character (special character)
    char arr[]= {'h','e','l','l','o'};
    int x= (int)ch;
    printf("%d\n",x ); 
     char array[]= "college wallah is best channel for coder ";
     int i=0;
     while(array[i]!='\0'){
        printf("%c\n",array[i]);
        i++;
     }
    //  for(int i=0 ; array[i]!='\0';i++){
    //     printf("%c",arr[i]);

    //  }


    puts(array); // for printing the string 
    gets(array); // enter the sentence you want

    return 0;

}