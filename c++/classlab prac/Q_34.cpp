#include <iostream>
using namespace std;
class add{
    public:
    int operator()(int a, int b){
        return a+b;
    }
    int operator()(int a, int b, int c){
        return a+b+c;
    }
};

int main(){
    //Write a program to perform overloading of function call operator. 
    add a;
    int r1= a(5,79);
    cout<<"result of two parameter is "<<r1<<endl;
    int r2 = a(14,10,6);
    cout<<"result of three parameter is "<<r2<<endl;


    return 0;
}