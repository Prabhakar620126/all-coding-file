#include <iostream>
using namespace std;
class FLOAT
{
    float a;

public:
    FLOAT()
    {
        a = 0;
    }
    FLOAT(float x)
    {
        a = x;
    }
    void display()
    {
        cout << " value is " << a << endl;
    }
    float operator+(FLOAT b)
    {
        FLOAT x;
        x.a = a + b.a;
        return x.a;
    }
    float operator-(FLOAT b)
    {
        FLOAT x;
        x.a = a - b.a;
        return x.a;
    }
    float operator*(FLOAT b)
    {
        FLOAT x;
        x.a = a * b.a;
        return x.a;
    }
    float operator/(FLOAT b)
    {
        FLOAT x;
        if (b.a != 0)
        {
            x.a = a / b.a;
            return x.a;
        }
        else
        {
            return x.a;
        }
    }
};

int main()
{
    // Create a class FLOAT that contains one float data member. Overload all the four arithmetic operators so that they operate on the objects of FLOAT.
    FLOAT a(5);
    FLOAT b(9.3);
    FLOAT c = b + a;
    c.display();
    FLOAT d = b - a;
    d.display();
    FLOAT e = b * a;
    e.display();
    FLOAT f = b / a;
    f.display();

    return 0;
}