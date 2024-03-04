#include <iostream>
using namespace std;
class B
{
    int a; // private menber
public:
    int b; // public --> resdy for inheritance
    void set_ab()
    {
        cout<<"enter value for A and  B :" ;
        cin>> a >> b;

    }
    int get_a()
    {
        return a;
    }
    void show_a()
    {
        cout << "a = " << a << endl;
    }
};
class D : private B
{
    int c;

public:
    void mul()
    {
        set_ab();
        c = b * get_a();
    }
    void display()
    {
        show_a();
        cout << " b= " << b << endl;
        cout << " c= " << c << endl;
    }
};

int main()
{
    D d;
    d.mul();
    d.display();

    

    return 0;
}