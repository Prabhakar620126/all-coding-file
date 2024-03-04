#include <iostream>
using namespace std;
class date
{
    int dd , mm , yy;
    public:
    date(int d , int m , int y){
        dd=d;
        mm=m;
        yy= y;
    }
    friend ostream & ip(ostream ip, int d1);
    friend istream & op(istream op , int d2);
};
ostream & ip <<(ostream & ip, date & d1){
    ip = ostream >> d1>> mm>> yy;
    return

}
istream &op>>(istream &op , dat & d2 ){
     int op =istream>> dd >>mm>> yy;
     return op;
}
int main(){
    date d1;
    d1.date(13, 2 ,2003);
    return 0;
}