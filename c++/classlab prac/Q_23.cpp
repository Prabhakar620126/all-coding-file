#include <iostream>
#include <string.h>
using namespace std;
class Student
{
    string name;
    static int totalstudent;

public:
    Student(string studentname = "unknow") : name(studentname)
    {
        totalstudent++;
    }
    string get_name()
    {
        return name;
    }
    int get_student()
    {
        return totalstudent;
    }
};
int Student::totalstudent = 0;

int main()
{
    // Write a program to demonstrate the use of Static Keyword. Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of the Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating the object of the Student class. Use “new” operator to create an instance of “name” member of class.
    Student stu0;
    Student stu1("prabhakar");
    Student stu2("shubham");
    Student stu3("aryan");
    cout << "student 1 name  " << stu0.get_name() << endl;
    cout << "student 2 name  " << stu1.get_name() << endl;
    cout << "student 3 name  " << stu2.get_name() << endl;
    cout << "student 4 name  " << stu3.get_name() << endl;

    return 0;
}