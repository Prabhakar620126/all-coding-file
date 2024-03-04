#include <iostream>
using namespace std ;
class abc{
    int x;
    public:

    void set(int n){
        x= n;
    }
    int get(){
        return x;
    }
};
int main(){
    abc p1;
    p1.set(5);
    cout<<p1.get();

return 0;
}
/*
encapsulation -> binding of method and variable together into a single unit [class]
*data is only accessible  from the class method .
* also lead to data abstraction / hinding .
class ->Abstract data types( A D T )


&  abstraction 
-->enable us to display only essential  information while hiding impletation details

example pow(x, y) --> (x to the power y )
 
 we can use this function but we can't see impletation part 


*/