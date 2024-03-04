#include <iostream>
using namespace std;
class number
{
    int a;
    int b;

public:
    number(int x, int y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        cout << " value of a= " << a << " value of b = " << b << endl;
    }
    number operator=(number n)
    {

        // choose which is easy
        // if(this != &n){
        //     a=n.a;
        //     b=n.b;
        // }
        // return *this;
        number n1(0, 0);
        n1.a = n.a;
        n1.b = n.b;
        return n1;
    }
};

int main()
{
    // Create two objects of a class with two integer type members. Compare the two operators have same member values. Using overloaded = operator for comparison.
    number n1(9, 6);
    n1.display();
    number n2 = n1;
    n2.display();

    return 0;
}