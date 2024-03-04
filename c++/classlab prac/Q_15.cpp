#include<iostream>
using namespace std;

struct student
{
    int roll_number;
    string name;
    float total_marks;

};



int main(){
    //Create a structure data type with data items roll number, name, and total marks.Write main function to read data for two students and also display the stored data.
    student student1 , student2;
    cout<<"enter roll no: "<<endl;
    cin>>student1.roll_number;
    cout<<"enter the name: "<<endl;
    cin>>student1.name;
    cout<<"enter the total number "<<endl;
    cin>>student1.total_marks;

    cout<<"enter roll no: "<<endl;
    cin>>student2.roll_number;
    cout<<"enter the name: "<<endl;
    cin>>student2.name;
    cout<<"enter the total number "<<endl;
    cin>>student2.total_marks;
    cout<<"detail of student 1:"<<endl;

    cout<<student1.name<<endl;
    cout<<student1.roll_number<<endl;
    cout<<student1.total_marks<<endl;
    cout<<"detail of student 2:"<<endl;
    
    cout<<student2.name<<endl;
    cout<<student2.roll_number<<endl;
    cout<<student2.total_marks<<endl;
    





    return 0;

}


