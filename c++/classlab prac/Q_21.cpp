#include <iostream>
using namespace std;
class DB; // pre declaration
class DM
{
    // distance in meter and centimeter
public:
    float meter;
    float centimeter;

    void getdata1(float a, float b)
    {
        meter = a;
        centimeter = b;
    }
    void display()
    {
        cout << " meter =" << meter;
        cout << " centimeter = " << centimeter << endl;
    }
    friend DM addfunction();
    friend DB addfunctioninfeet();
};
class DB
{
    // feet and inches
public:
    float feet;
    float inches;

    void getdata2(float f, float i)
    {
        feet = f;
        inches = i;
    }
    void display()
    {
        cout << " foot =" << feet;
        cout << " inches =" << inches << endl;
    }
    friend DM addfunction();
    friend DB addfunctioninfeet();
};
DM addfunction(DM d1, DB d2)
{
    // addition in meter and distance
    // Convert DB to DM (1 foot = 0.3048 meters, 1 inch = 0.0254 meters)
    DM d3;
    d3.meter = (d1.meter) + ((d2.feet) * 0.3048);
    d3.centimeter = d1.centimeter + ((d2.inches) * 2.54);
    while (d3.centimeter >= 100)
    {
        d3.meter++;
        d3.centimeter -= 100;
    }
    return d3;
}
DB addfunctioninfeet(DM d1, DB d2)
{
    // addition in meter and distance
    // Convert DB to DM (1 foot = 0.3048 meters, 1 inch = 0.0254 meters)
    DB d3;
    d3.feet = ((d1.meter) * 3.28084) + (d2.feet);
    d3.inches = ((d1.centimeter) * 0.393701) + (d2.inches);
    while (d3.inches >= 12)
    {
        d3.feet++;
        d3.inches -= 12;
    }
    return d3;
}
int main()
{
    // Create two classes DM and DB which store the value of distances. DM stores distances in meters and centimeters and DB in feet and inches. Write a program that can read values for the class objects and add one object of DM with another object of DB. Use friend function to carry out the addition operation. The object that stores result may be a DM object or DB object depending on the units in which result is required.
    DM d1, d4;
    DB d2, d5;
    d1.getdata1(5.0, 80.0);
    d1.display();
    d2.getdata2(10.0, 10);
    d2.display();
    d4 = addfunction(d1, d2);
    d4.display();
    d5 = addfunctioninfeet(d1, d2);
    d5.display();
    return 0;
}