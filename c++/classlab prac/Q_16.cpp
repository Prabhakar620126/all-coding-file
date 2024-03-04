#include <iostream>
using namespace std ;
class student
{
    string name;
    int roll_number;
    public:
    void getdata(string s, int r){
        name= s;
        roll_number= r;
    }
    void display(){
        cout<<"name = "<<name<<endl;
        cout<<"roll number ="<<roll_number <<endl;
    }
};


int main(){
    //Create a class named 'Student' with a string variable 'name' and an integer variable 'roll no'. Assign the value of roll no as '2' and that of name as "John" by creating an object of the class Student
    student s1;
    string s;
    int r;
    cout<<"enter the name of student :"<<endl;
    cin>>s;
    cout<<"enter the roll no:"<<endl;
    cin>>r;
    s1.getdata(s,r);
    s1.display();







    return 0;
}