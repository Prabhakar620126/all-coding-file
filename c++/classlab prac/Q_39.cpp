#include <iostream>
using namespace std;
class student
{
protected:
    string name;
    int rollnumber;

public:
    student(string s, int a)
    {
        name = s;
        rollnumber = a;
    }
    void display()
    {
        cout << "name : " << name << "  roll number : " << rollnumber << endl;
    }
};
class fees : public student
{
    double fee;

public:
    fees(string s, int r, double d) : student(s, r), fee(d)
    {
        fee = d;
    }
    void submitFees()
    {
        cout << "Fees submitted for " << name << " (Roll No: " << rollnumber << "). Amount: " << fee << endl;
    }

    void generateReceipt()
    {
        cout << "Receipt generated for " << name << " (Roll No: " << rollnumber << "). Amount: " << fee << endl;
    }
};
class result : public student
{
    int mark;
    char grade;

public:
    result(string s, int r, int m, char ch) : student(s, r), mark(m), grade(ch) {}
    void displayResult()
    {
        cout << "Result for " << name << " (Roll No: " << rollnumber << "):\n";
        cout << "Marks: " << mark << "\nGrade: " << grade <<  endl;
    }
};

int main()
{
    // Define a class Student with data members as rollno and name. Derive a class Fees from student that has a data member fees and functions to submit fees and generate receipt.. Derive another class Result from Student and display the marks and grade obtained by the student.
    fees studentWithFees("priyanshu ", 101, 500.0);
    studentWithFees.display();
    studentWithFees.submitFees();
    studentWithFees.generateReceipt();

    cout << endl;

    result studentWithResult("prabhakar ", 102, 90, 'A');
    studentWithResult.display();
    studentWithResult.displayResult();

    return 0;
}