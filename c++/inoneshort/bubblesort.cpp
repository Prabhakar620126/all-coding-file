#include <iostream>
using namespace std;
void swap(int* a , int* b){
    int temp ;
    temp= *a;
    *a = *b;
    *b = temp;
}
void print(int arr[] , int n){
    
    for(int i=0; i<n; i++){
        cout<<arr[i]<< "  ";
    }
}
void bubblesort(int arr[] , int n ){
    
    for(int i=0; i<n; i++){
        for(int j=0 ;j<n-i; j++){
            if(arr[j]>arr[j+1]){
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
}
int main(){
    int n ;
    cout<<"enter the number :"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter the array element:"<<endl;
    for(int i=0 ; i<n; i++){
        cin>>arr[i];
    }
    cout<< "original array: "<<endl;
    print(arr,n);
    cout<<endl;
    bubblesort(arr, n);
    cout<<"shorted array"<<endl;
    print(arr, n);
    return 0; //7  8  9  65  23  11  4  2  20  22
}