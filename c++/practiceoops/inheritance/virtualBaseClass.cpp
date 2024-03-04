#include <iostream>
using namespace std;
class student
{
protected:
    int rollnumber;

public:
    void get_number(int a)
    {
        rollnumber = a;
    }
    void put_number()
    {
        cout << "roll number  =" << rollnumber << endl;
    }
};
class test : virtual public student // first level inheritance
{
protected:
    float sub1;
    float sub2;

public:
    void get_mark(float, float);
    void put_mark();
};
void test ::get_mark(float a, float b)
{
    sub1 = a;
    sub2 = b;
}
void test ::put_mark()
{
    cout << " marks in sub1 is :" << sub1 << endl;
    cout << " marks in sub2 is : " << sub2 << endl;
}
class sport : public virtual student
{
protected:
    float score;

public:
    void get_score(float s)
    {
        score = s;
    }
    void put_score()
    {
        cout << " sport marks " << score << "\n";
    }
};
class result : public test, public sport
{
    float total;

public:
    void display()
    {
        total = sub1 + sub2 + score;
        put_number();
        put_mark();
        put_score();
        cout << "total  marks = " << total << " \n";
    }
};

int main()
{
    result student1;
    student1.get_number(666);
    student1.get_mark(30.5, 25.5);
    student1.get_score(7.0);
    student1.display();

    return 0;
}
