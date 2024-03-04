#include <iostream>
using namespace std;
int volume(int l){
    cout<<"volume of cube :"<<endl;
    return l*l*l;
}
float  volume(float r,float h){
    cout<<"volume of cone :"<<endl;
    float pi= 22/7; 
    float v= (1.0/3.0)*pi*(r*r*h);
    return  v;
}
float  volume(float r){
    cout<<"volume of sphere :"<<endl;
    float pi= 22/7; 
    float v= (4.0/3.0)*pi*r*r*r;
    return v;
}



int main (){
    //Write a program with overloaded volume function. Use volume function to calculate the volume of a cube, cone, sphere etc.
    float height  ,radius;
    int length;
    cout<<"enter the length :";
    cin>>length;
    cout<<"enter the radius :";
    cin>>radius;
    cout<<"enter the height :";
    cin>>height;
    cout<<volume(length)<<endl;
    cout<<volume(radius , height)<<endl;
    cout<<volume(radius)<<endl;


    return 0;
}