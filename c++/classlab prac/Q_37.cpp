#include <iostream>
using namespace std;
class time
{
    int hour;
    int minute;

public:
    time(int a = 0, int b = 0)
    {
        hour = a;
        minute = b;
    }
    void display()
    {
        cout << "time is : " << hour << "h " << minute << "m" << endl;
    }
    int conversion()
    {
        int result = (this->hour * 60) + this->minute;
        return result;
    }
    time conversion(int x)
    {
        time t1;
        t1.hour = x / 60;
        t1.minute = x % 60;
        return t1;
    }
};

int main()
{
    // Write a program to convert time type object to an Integer value and integer type value to object of time type. Use appropriate data type conversion functions to perform the required conversion
    time t1(5, 53);
    cout << " time in minute : " << t1.conversion() << endl;
    time t2 = t2.conversion(353);
    t2.display();

    return 0;
}