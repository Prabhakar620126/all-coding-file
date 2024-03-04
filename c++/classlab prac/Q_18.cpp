#include <iostream>
using namespace std;

class Employee
{
    public:
    string name;
    int year_joinig;
    int salary;
    string address;

    void display(){
        cout<<name <<"\t\t"<<year_joinig<<" \t\t\t\t"<<salary<<"\t\t\t"<<address<<endl;

    }
    



};

int main(){
    /*
    Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows: 
           Name       Year of joining       Address 
           Ramesh     1994                  64-C New Delhi 
           Sam        2000                  68-D Bilaspur 
           John       1999                  26-B-Banglore 

    */

   Employee E1, E2, E3;
   E1.name = "Ramesh";
   E1.year_joinig = 1994;
   E1.salary = 50000;
   E1.address ="64-C New Delhi";
   E2.name = "sam";
   E2.year_joinig = 2000;
   E2.salary = 80000;
   E2.address ="68-D bilaspur";
   E3.name = "jhone";
   E3.year_joinig = 1999;
   E3.salary = 60000;
   E3.address ="26-B- banglore";

   cout<<" name "<<"\t\t year of joining"<<"\t\t  salary"<<"\t\t adresss "<<endl;
   E1.display();
   E2.display();
   E3.display();



    return 0;
}