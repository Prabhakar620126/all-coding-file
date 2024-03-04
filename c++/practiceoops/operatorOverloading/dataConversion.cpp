#include <iostream>
using namespace std;
class invent2;
class invent1{
    int code;
    int items;
    float price;
    public:
    invent1(int a, int b, float c){
        code=a;
        items = b;
        price = c;
    }
    void putdata(){
        cout<<"code :"<< code<<"\n";
        cout<<"items :"<< items<<"\n";
        cout<<"price :"<< price<<"\n";
    }
    int getcode(){return code;}
    int getitems(){ return items;}
    float getprice(){ return price;}
    operator float(){
        return (items*price);
    }
    /*
    operator invent2(){
        invent2 temp;
        temp.code =code;
        temp.value= price*items;
        return temp;
        
    }
    */
    
};
class invent2{
    int code;
    float value;
    public:
    invent2(){
        code=0;
        value=0;
    }
    invent2(int x, float y){
        code=x;
        value= y;
    }
    void putdata(){
        cout
    }
};

int main(){

    return 0;

}