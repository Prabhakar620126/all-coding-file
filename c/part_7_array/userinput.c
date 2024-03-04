#include<stdio.h>
int main (){
    int n;
    printf("Enter the size of array :\n");
    scanf("%d",&n);
    int arr[n];
    for(int i=0; i<=n-1;i++){
        scanf("%d",&arr[i]);

    }
    for(int i=0; i<=n-1;i++){
        printf("%d",arr[i]);

    }
    int product =1;
    // product of array element 
    for(int i=0; i<=n-1;i++){
        product= product* arr[i];
    }
    printf("\n product of array element %d",product);
    // maximum element of array 
    int max = arr[0];
    for(int i=1 ;i<n;i++){
        if(max < arr[i]){
            max= arr[i];

        }
    }
     printf("\nmaximun element of array is %d", max);

    


    return 0;
}