#include<stdio.h>
int maze2(int n , int m){
    int rightways =0 ;
    int downways =0 ;
    if(n==1 &&m==1)return 1;
    if(n==1){ // cannot go down 
        rightways += maze2(n,m-1);
    }
    if(m==1){ // cannot go down 
        downways += maze2(n-1,m);
    }
    if(n>1 && m>1){
        rightways += maze2(n,m-1);
        downways += maze2(n-1,m);
    }
    int totalways = rightways+ downways;
    return totalways;

}
int main(){
    int n ,m;
    printf("Enter the rows of thr maze :");
    scanf("%d",&n);
    printf("Enter the coloum of the maze :");
    scanf("%d",&m);
    int noofway = maze2(n,m);
    printf(" %d ",noofway);

    return 0;

}