#include <iostream>

using namespace std;
void swap(int& a , int& b){
    int temp;
    temp = a;
    a=b;
    b=temp;
}

int main (){
    //Write a function swap to swap the value of two integer variables. Write appropriate main function for the program
    int a ,b;
    cout<<"enter the frist number:";
    cin>>a;
    cout<<"enter the second number:";
    cin>>b;
    cout<<" original number is "<<a <<" and "<<b<<endl;
    swap(a,b);
    cout<<" swap number is "<<a <<" and "<<b<< endl;





    return 0;
}