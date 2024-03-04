#include <iostream>
using namespace std;
float simpleinterst(int p , int t, float r=1.12){
    float si= (p*r*t)/100;
    return si;
}


int main(){
    //Write a program to calculate simple interest. Use default argument for rate. Write main function to exhibit the use of default argument. 
    int principal, time;
    float rate;
    cout<<"enter the principal: "<<endl;
    cin>>principal;
    cout<<"enter the time: "<<endl;
    cin>>time;
    cout<<"enter the rate: "<<endl;
    cin>>rate;
    
    cout<<"simple interst : "<< simpleinterst(principal ,time , rate)<<endl;
    //default argument
    cout<<"simple interst : "<< simpleinterst(principal ,time);


    


    return 0;
}