#include <iostream>
using namespace std;
int& findmax(int& a, int& b){
    if(a>b){
        return a;
    }
    else{
        return b;
    }
}
int main(){
    //Write a program to show the use of return by reference.
    int a ,b ;
    cout<< " enter the value of a"<<endl;
    cin>>a;
    cout<< " enter the value of b"<<endl;
    cin>>b;
    
    cout<<" max of a and b is  "<<findmax(a ,b)<<endl;
    cout<<a<<endl;
    cout<<b<<endl;
    
    return 0;
}