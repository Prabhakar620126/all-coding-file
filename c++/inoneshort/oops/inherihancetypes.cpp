#include <iostream>
using namespace std;
class parent1 {
    public:
    parent1(){
        cout<<"parent1 class  "<<endl;  
    }   
    
};
class parent2 {
    public:
    parent2(){
        cout<<"parent2 class  "<<endl;  
    }   
    
};
class child1: public parent1 , public parent2{
    public: 
    child1(){
        cout<<"child class"<<endl;
    }
};
class child2: public parent1 {
    public: 
    child2(){
        cout<<"child class"<<endl;
    }
};
class grandchild: public child1 { 
    public:
    grandchild(){
    cout<<"grandchild class"<<endl;
    }
};

int main(){
   

    // single inheritance 
    //child1 c;
    // multiple inheritance 
    //grandchild gc;


    

    return 0;
}