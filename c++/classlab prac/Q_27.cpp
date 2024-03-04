#include <iostream>
using namespace std;
class student
{
    string name;
    int score;

public:
    student(string s, int x)
    {
        name = "null";
        score = 0;
    }

    student()
    {
        cout << " enter the name of student " << endl;
        string s;
        cin >> s;
        cout << " enter the score " << endl;
        int x;
        cin >> x;
        name = s;
        score = x;
    }
    void display()
    {
        cout << "name: " << name << " and score " << score << endl;
    }
    void max(student &s2, student &s3)
    {
        student s("hi", 1);
        s.name = this->name;
        s.score = this->score;

        if (s2.score > s.score)
        {
            s.score = s2.score;
            s.name = s2.name;
        }
        if (s3.score > s.score)
        {
            s.score = s3.score;
            s.name = s3.name;
        }
        cout << " higher scorrer : " << endl;

        s.display();
    }
};

int main()
{
    // Write a program to show the highest scorer in a test out of three students who appeared in a exam. Use this pointer to refer to objects. (USER INPUT)
    student s1;
    s1.display();
    student s2;
    s2.display();
    student s3;
    s3.display();
    s1.max(s2, s3);

    return 0;
}