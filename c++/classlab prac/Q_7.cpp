#include <iostream>
using namespace std;
int factorial(int n){
    if(n==1) return 1;
    int ans = n * factorial(n-1);
    return ans;
}

int main(){
    //Write a function factorial to calculate the factorial of a number, write appropriate main function also
    int n ;
    cout<<"enter the number :-";
    cin>> n;
    cout<<" the factorial of n is :"<<factorial(n);

    return 0;
}