#include <iostream>
using namespace std;
class detail
{
    string name;
    int age;

public:
    // construtor
    detail(string s, int a)
    {
        name = s;
        age = a;
    }
    detail(detail &other) : name(other.name), age(other.age)
    {
        cout << " copy constructor is called :" << endl;
    }
    void display()
    {
        cout << "name is " << name << "and age is :" << age << endl;
    }
};

int main()
{
    // Write a program to initialize an object with another using copy constructor.
    detail d1("  Prabhakar", 20);
    detail d2 = d1;
    d1.display();
    d2.display();

    return 0;
}