#include <iostream>
using namespace std;
class complex
{
    int real;
    int img;

public:
    complex()
    {
        real = 0;
        img = 0;
    }
    complex(int a, int b)
    {
        real = a;
        img = b;
    }
    void display()
    {
        cout << "complex number is :" << real << " + " << img << "i" << endl;
    }
    friend complex add(complex c1, complex c2);
};
complex add(complex c1, complex c2)
{
    complex c3;
    c3.real = c1.real + c2.real;
    c3.img = c1.img + c2.img;
    return c3;
}

int main()
{
    // Write a program to add two complex number using a friend function. Use appropriate constructor function to initialize the object
    complex c1(5, 6);
    c1.display();
    complex c2(8, 9);
    c2.display();
    complex c3 = add(c1, c2);
    c3.display();

    return 0;
}