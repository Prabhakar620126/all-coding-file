#include <iostream>
using namespace std;
class student
{
    string name;
    int score;

public:
    student()
    {
        // name="null";
        // score =0;
    }
    student(string s, int x)
    {
        name = s;
        score = x;
    }
    void display()
    {
        cout << "name: " << name << " and score " << score << endl;
    }
    student max(student &s2, student &s3)
    {
        student s;
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

        return s;
    }
};

int main()
{
    // Write a program to show the highest scorer in a test out of three students who appeared in a exam. Use this pointer to refer to objects
    student s1("prabhakar", 90);
    s1.display();
    student s2("priyanshu", 95);
    s2.display();
    student s3("atul", 90);
    s3.display();
    student p = s1.max(s2, s3);
    cout << "Highest Scorer: ";
    p.display();

    return 0;
}