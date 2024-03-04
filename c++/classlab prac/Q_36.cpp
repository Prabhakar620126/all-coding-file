#include <iostream>
#include <cstring>
using namespace std;
class name
{
    string s;

public:
    name(string a = "null")
    {
        s = a;
    }
    void display()
    {
        cout << " name is " << s << endl;
    }
    friend name operator+(name a, name b)
    {
        name n;
        n.s = a.s + b.s;
        return n;
    }
};

int main()
{
    // Write a Program to Concatenate two Strings Using Operator Overloading(+).
    name a("prabhakar");
    name b("_shahi");
    name p = a + b;
    p.display();

    return 0;
}