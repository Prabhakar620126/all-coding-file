#include <iostream>
using namespace std ;

class parent{
public:
    virtual void print(){
        cout<<"parent class"<<endl;
    }
    void show(){
        cout<<"parent class"<<endl;
    }   
};

class child: public parent{
public:
    void print(){
        cout<<"child class"<<endl;
    }
    void show(){
        cout<<"child class"<<endl;
    }
};

int main (){
    parent *p;
    child c;

    return 0;
}