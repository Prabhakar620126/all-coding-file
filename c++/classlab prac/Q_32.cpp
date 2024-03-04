#include <iostream>
using namespace std;
class time
{
    int hour;
    int min;
    int sec;

public:
    time(int h = 0, int m = 0, int s = 0) : hour(h), min(m), sec(s) {}
    // Overloaded << operator for displaying Time object
    friend ostream &operator<<(ostream &os, time &time1)
    {
        os << " time is:" << time1.hour << "h  " << time1.min << "m " << time1.sec << "s " << endl;
        return os;
    }

    // Overloaded >> operator for inputting Time object
    friend istream &operator>>(istream &is, time &time1)
    {
        cout << "Enter hours: ";
        is >> time1.hour;

        cout << "Enter minutes: ";
        is >> time1.min;
        while (time1.min > 60)
        {
            time1.hour++;
            time1.min -= 60;
        }

        cout << "Enter seconds: ";
        is >> time1.sec;
        while (time1.sec > 60)
        {
            time1.min++;
            time1.sec -= 60;
        }

        return is;
    }
};

int main()
{
    // Write a program to overload << and >> operators to display time object.
    cout << " enter the time: " << endl;
    time time1;
    cin >> time1;
    cout << "time is :" << time1;

    return 0;
}