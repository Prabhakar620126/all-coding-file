#include <iostream>
using namespace std;
int area(int l, int b){
    cout<< "area of rectangle";
    return l*b;
}
float area(float r){
    cout<<"area of circle";

    return (3.1415*r*r);
}
int area(int l){
    cout<< "area of square";
    return l*l;
}


int main(){
    //Write a program to perform overloading of area function.
    int l ,b ;
    float r;
    cout<<"enter the length";
    cin>>l;
    cout<<"enter the breadth";
    cin>>b;
    cout<<"enter the radius";
    cin>>r;

    //cout<< area(l ,b);
    cout<< area(l) ;
    cout<< area(r);




    return 0;
}