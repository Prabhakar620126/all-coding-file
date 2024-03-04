#include <iostream>
using namespace std;
class time
{
    int hour;
    int minute;

public:
    time()
    {
        hour = 0;
        minute = 0;
    }
    time(int h, int m)
    {
        hour = h;
        minute = m;
    }
    void display()
    {
        cout << "hour is " << hour << "  and minute is " << minute << endl;
    }
    friend time add(time t1, time t2);
};
time add(time t1, time t2)
{
    time t3;
    t3.hour = t1.hour + t2.hour;
    t3.minute = t1.minute + t2.minute;
    while (t3.minute >= 60)
    {
        t3.hour++;
        t3.minute -= 60;
    }
    return t3;
}

int main()
{
    // Create a class time to store time in hours and minutes. Write a program that can read values for the class objects and add one object with another object storing the result in third object. Use object as arguments to sum() function and object return type from sum() function to assign the sum to the third object.

    time t1(5, 45);
    t1.display();

    time t2(2, 55);
    t2.display();
    time t3;
    t3 = add(t1, t2);
    t3.display();

    return 0;
}