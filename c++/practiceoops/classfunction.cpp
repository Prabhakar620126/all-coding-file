#include <iostream>
using namespace std;
// class declaration 
class item{
    int number ;
    int cost;
    public:
    void getdata(int a,int b);
    void display();
};

void item:: getdata(int a, int b){
    number =a;
    cost = b;

}
void item :: display(){
    cout<<"number :"<<number<<"\n";
    cout<<"cost :"<<cost<<"\n";
}
int main(){
    item a;
    a.getdata(53 , 55);
    a.display();
    
    return 0;
}