#include <iostream>
using namespace std;
class M{
    protected: 
    int m;
    public:
    void get_m(int a){
        m=a;

    }
};
class N {
    protected :
    int n;
    public:
    void get_n(int a){
        n=a;

    }
};
class P : public M, public N{
    public :
    void display(){
        cout<<" m="<<m<<"\n";
        cout<<" n="<<n<<"\n";
        cout<<" m*n = "<< m*n<<"\n";
 
    }
};
int main (){
    P p;
    p.get_m(10);
    p.get_n(20);
    p.display();

    return 0;

}