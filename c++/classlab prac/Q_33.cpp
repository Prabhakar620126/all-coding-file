#include <iostream>
using namespace std;
class time
{
    int hour;
    int min;

public:
    time(int h = 0, int m = 0) : hour(h), min(m) {}
    void display()
    {
        cout << " time is : " << hour << " h " << min << "m";
    }
    friend bool operator<=(time t1, time t2)
    {
        if ((t1.hour < t2.hour))
        {
            
            cout << "time2 is greater and equall to time1" << endl;
        }
        else if(t1.hour== t2.hour)
        {
            if(t1.min<t2.min || t1.min==t2.min){
                cout << "time2 is greater and equall to time1" << endl;
            }
            
        }else{
            cout << "time2 is  smaller  than to time1" << endl;
        }

       
    }
    friend bool operator>=(time t1, time t2)
    {

        if ((t1.hour > t2.hour))
        {
            
            cout << "time1 is greater and equall to time2" << endl;
        }
        else if(t1.hour== t2.hour)
        {
            if(t1.min>t2.min || t1.min==t2.min){
                cout << "time1 is greater and equall to time2" << endl;
            }
            
        }else{
            cout << "time1 is  smaller  than to time2" << endl;
        }
    }
    friend bool operator==(time t1, time t2)
    {

        if (t1.hour == t2.hour || t1.min == t2.min)
        {
            cout << "time1 is equal to time2" << endl;
        }
        else
        {
            cout << "time1 is not equal to time time2" << endl;
        }
    }
};

int main()
{
    // Write a program to overload <=, >== and == operator to compare time objects.
    time t2(4, 56);
    time t1(5, 50);
    t1 == t2;
    t1 >= t2;
    t1 <= t2;

    return 0;
}