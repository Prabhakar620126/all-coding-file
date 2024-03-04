#include <iostream>
using namespace  std;
void* swap(int &p, int  &q){
    int temp= p;
    p=q;
    q=temp;
    // cout<<p<<"  ";
    // cout<<q<<endl;
}
int main (){
    int a =3;
    int b= 5;
    cout<<"origional "<<endl;
    cout<<a  << "  ";
    cout<<b<<endl;
    //swapping of two number
    int temp= a;
    a=b;
    b=temp;
    cout<<a<<"  ";
    cout<<b<<endl;
    swap(a, b);
    cout<<a<<"  ";
    cout<<b<<endl;



    return 0;

}

