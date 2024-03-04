#include <stdio.h>
#include <conio.h>
int  main()
{
    int arr[7]= {1,2,3,4,5,6,7};
    int sumEven =0;
    int sumOdd = 0;
    for(int i=0; i<=6;i++){
        if( i%2==0){
            sumEven += arr[i];
        }
        else{
            sumOdd += arr[i];
        }
    }
    printf("%d", sumEven - sumOdd);
    return 0 ;
}
