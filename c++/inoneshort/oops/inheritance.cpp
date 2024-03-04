#include <iostream>
using namespace std;

class parent{

    public:
        int x;

    protected:
        int y;
    
    private:
        int z;

};
class child1: public parent{
    // x will remain public
    //y will remain protected
    // z will not be accessible
};
class child2: private parent{
    // x will be private 
    // y will be private 
    // z will be inaccessible 
};

class child3: protected parent{
    // x will be protected
    //y will be protected
    // z will be inaccessible 
};
class parent1 {
    public:
    parent1(){
        cout<<"parent class  "<<endl;  
    }
    
    
    
};
class child: public parent1 {
    public: 
    child(){
        cout<<"child class"<<endl;
    }
};
int main(){
    parent p;
    p.x;

    child c;
    

    return 0;
}
/*
Access specifiers & modes of inheritance 
*public  --> data and function from anywhere in the code 
*private  --> accessible in own class, parent class , and derived class 
*protected   --> accessible only in own class


        TYPES OF INHERITANCE 
* single  inheritance
* multiple inheritance
* hierarchical interitance
* hybrid inheritance --> combination of more than 1 inheritance types 
   
*/