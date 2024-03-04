#include <iostream>
using namespace std;
class M{
    public :
    void display(){
        cout<<" this element belong to class m \n";

    }
};
class P{
    public:
    void display(){
        cout<<" this element belong to class P \n";
    }
};
class N : public M, public P{
    public:
    void display(){
        cout<< "this element belong to class n \n";
    }
};


int main(){
    N n;
    n.M::display();
    n.N::display();
    n.P::display();
    n.display();


    return 0;
}

