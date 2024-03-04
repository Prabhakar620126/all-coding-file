#include <iostream>
using namespace std;
float si(int p, int t, float r=0.15){
    return (p*r*t)/100;
}
int main (){
    cout<<si(5000,7 )<<endl;
    cout<<si(5000,7,0.12)<<endl;
    return 0;
}