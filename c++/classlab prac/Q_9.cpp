#include <iostream>
using namespace std;

void bubble_sort(int arr[] , int n){
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
            }

        }

    }
}
int main(){
    //Write a function to perform sorting using bubble sort algorithm. Use arrays to store the list of numbers. Also write main() function to read contents and display output
    int n;
    cout<<"enter the number :";
    cin>>n;
    int arr[n];
    cout<<"enter the array number";
    for(int i=0; i<n;i++){
        cin>>arr[i];  
    }
    int N = sizeof(arr) / sizeof(arr[0]);
    bubble_sort(arr, N);
    for(int i=0; i<n ;i++){
        cout<<arr[i]<<"  ";  
    }
    



    return 0;
}