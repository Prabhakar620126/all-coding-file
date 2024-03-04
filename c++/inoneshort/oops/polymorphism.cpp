#include <iostream>
using namespace std;
// function overloading
class sum {
    public:
        void add(int x, int y){
            int sum = x+y;
            cout<<sum<<endl;
        }
        void add(int x, int y , int z){
            int sum = x+y+z;
            cout<<sum<<endl;
        }
        void add(float x, float y){
            float sum = x+y;
            cout<<sum<<endl;
        }


};
// operator overloading

int main(){
    // FUNCTION OVERLOADING 
    sum s;
    s.add(3,5);
    s.add(2,6,4);
    s.add(float(2.4) , float(5.9));

    return 0;
}
/*
 Polymorphism -->ability of object / method to take different forms
  TYPES 
  1. compile time polymorphism
  2. run time polymorphism
  function overloading --> define a number of function  with same function name they perform differently according to the arrgument passed 

*/