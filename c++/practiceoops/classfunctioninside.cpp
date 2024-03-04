#include <iostream>
using namespace std;
class item
{
    static int count;
    int number ;
    float cost;
    public:
        void getdata(int a ,float b){
            number = a ;
            cost =b;
            count++;
            display();
        }
        void display(){
            cout<<" number :"<< number<<endl;
            cout<<" cost :"<< cost<<endl;
            cout<<"count"<<endl;
            cout<<count<<endl;
        }


};
int item :: count=10;
int main(){
    cout<<"hi";
    int x =6;
    item a;
    a.getdata(50 , 5.55);
    a.display();
    
    


    
    return 0;
}