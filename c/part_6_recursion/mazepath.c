#include<stdio.h>
int maze(int cr , int cc, int er, int ec){
    int rightways =0 ;
    int downways =0 ;
    if(cr==er && cc==ec)return 1;
    if(cr==er){//only rightways call
        rightways += maze(cr, cc+1, er, ec);
    }
    if(cc==ec){//only downways call
        downways += maze(cr+1, cc, er, ec);
    }
    if(cr<er && cc<ec){//only rightways call
        rightways += maze(cr, cc+1, er, ec);
        downways += maze(cr+1, cc, er, ec);
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
    int noofway = maze(1,1,n,m);
    printf(" %d ",noofway);

    return 0;

}