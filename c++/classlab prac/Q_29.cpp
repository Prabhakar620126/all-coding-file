#include <iostream>
using namespace std;
class student{
    public:
    int age;
    void display(){
        cout<<" age of student is:"<<age<<endl;
    }
};

int main (){
    //Write a program to illustrate pointer to member and pointer to object concepts of 00P. 
    student s1;
    s1.age=18;
    //pointer to object
    student* ps1= &s1;
    // pointer to data member
    int student::* page = &student::age;
    // pointer  to member function
    void (student::* pdisplay)() = &student::display;
    // Accessing data member using pointer to object
    cout<<" using pointer to object " <<ps1->age<<endl;
    //accessing data member using pointer to member
    cout<<"using pointer to member "<<s1.*page<<endl;
    // Calling member function using pointer to object
    (ps1->*pdisplay)();

    // Calling member function using pointer to member
    (s1.*pdisplay)();


    return 0;
}