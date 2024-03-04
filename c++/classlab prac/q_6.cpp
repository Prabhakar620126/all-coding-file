#include <iostream>
using namespace std;
int power(int a, int b){
    if(b==0){
        return 1;
    }
    int pow;
    pow = a* power(a, b-1);
    return pow;
}

int main(){
    int a,b;
    //Write a function to calculate the power of a number raised to another number using function. Write appropriate main() function to read and display the result.
    cout<<"enter the base number"<<endl;
    cin>>a;
    cout<<"enter the exponent number"<<endl;
    cin>>b;
    cout<< " power of A to power B is:"<<power(a,b);
    return 0;


}