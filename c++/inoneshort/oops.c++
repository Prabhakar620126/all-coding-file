#include <iostream>
using namespace std;
class fruit{
public:
    string name;
    string color;
};
int main(){
    fruit apple;// object
    apple.name = "apple";
    apple.color = "red";
    cout<<apple.name<<" - "<<apple.color<<endl;

    fruit *mango = new fruit();
    mango->name= "mango";
    mango->color = "yellow";
    cout<<mango->name<<"-"<< mango->color<<endl;
    return 0;
}