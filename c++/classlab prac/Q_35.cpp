#include <iostream>
using namespace std;
class array
{
    int a[5];

public:
    array(int x)
    {
        for (int i = 0; i < 5; i++)
        {
            a[i] = x++;
        }
    }
    int operator[](int idx) const
    { // read the value
        if (idx >= 5)
            cout << "out of bound" << endl;
        return a[idx];
    }
    int &operator[](int idx)
    { // write the value
        if (idx >= 5)
            cout << "out of bound" << endl;
        return a[idx];
    }
};

int main()
{
    // Write a program to perform overloading of subscripting operator.
    array a(50);
    cout << "value at index 3 is " << a[3] << endl;
    a[3] = 100;
    cout << "new value of at index 3 is " << a[3];

    return 0;
}