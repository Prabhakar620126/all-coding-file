#include <iostream>
using namespace std;

class area{
    int length;
    int breadth;
    public:

    void readData(int a, int b){
        length =a;
        breadth= b;
    }
    int calculateArea(){
        return length* breadth;
    }

};

int main(){
    //Write a program to print the area of a rectangle by creating a class named 'Area' having two functions.First function named as ‘readData' takes the length and breadth of the rectangle as parameters and the second function named as ‘calculateArea' returns the area of the rectangle. Length and breadth of the rectangle are entered through keyboard

    area A1;
    int a ,b;
    cout<<"enter the length of rectangle :"<<endl;
    cin>>a;
    cout<<"enter the breadth  of rectangle :"<<endl;
    cin>>b;
    A1.readData(a,b);
    cout<<"area of rectangle :  ";
    cout<<A1.calculateArea();



    return 0;
}