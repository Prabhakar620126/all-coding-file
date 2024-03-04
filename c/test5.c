#include <stdio.h>
int main(){
int i = 1, j = 1; 
  for(; i<= 10; i++) 
  { 
    printf(" this is loop no %d \n",i);
    if(i%3 != 0) { j += 2;
    
     continue;// continue used for  break the running loop but continue the  next illitration 
     printf ("hi \n");
     }    
    if(j%3 == 0) { 
        printf ("hj \n");
        break;// means break the for loop completly
    }   
  } 
  printf("%d  %d ",i,j);
printf("%d",i+j);
}