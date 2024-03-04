#include <iostream>
using namespace std;
inline int square(int n){
    return n*n;
}


int main(){
    //Write a program with at least one function made as inline. 
    int a;
    cout<<"enter the number :";
    cin>>a;
    cout<<"square of number "<<square(a);
    return 0;
}
