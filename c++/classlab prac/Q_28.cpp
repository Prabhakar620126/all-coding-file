#include <iostream>
using namespace std;
class count{
    string name;
    static int totalcount;
    public:
    count(string s){
        name=s;
        cout<<"constructor is called"<<endl;
        totalcount++;
        
    }
    ~count(){
        cout<<" desctuctor is called "<<endl;
        totalcount--;
    }
    void display(){
        cout<<" name = "<< name;
        cout<<" total count = " <<totalcount<<endl;


    }
};
int count:: totalcount=0;


int main(){
    //Write a program to illustrate the creation and destruction of objects. 
    count a("a");
    a.display();
    count b("a");
    b.display();
    count c("a");
    c.display();
    c.~count();
    a.display();
    return 0;
}