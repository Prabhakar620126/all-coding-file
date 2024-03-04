#include <iostream>
using namespace std;
int x=10;
int main(){
    int x= 5;
    cout<<"local variable and value of x is :"<<x << endl;
    cout<<"global vatriable and value of x is :"<<::x << endl;
{
    int x=3;
    cout<<"local variable and value of x is :"<<x << endl;
    cout<<"global vatriable and value of x is :"<<::x << endl;

}


}