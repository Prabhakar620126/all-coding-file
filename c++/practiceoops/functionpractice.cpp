#include <iostream>
using namespace std ;
float cube(float a, float b , float c){
    float ans ;
    
    return a*b*c ;

}
void p(int* z){
    *z= 15;

}
int main (){
    cout<< "enter the length"<<endl;
    float l;
    cin>> l;
    cout<< "enter the breath"<<endl;
    float b;
    cin>> b;
    cout<< "enter the height"<<endl;
    float h;
    cin>> h;
    cout<<" the volume of cuboid is: "<<endl;
    float c;
    c= l*b*h;
    cout<<c<<endl;
    cout<<cube(l,b,h);
    int x= 10;
    p(&x);
    cout<<x;



    return 0;
}