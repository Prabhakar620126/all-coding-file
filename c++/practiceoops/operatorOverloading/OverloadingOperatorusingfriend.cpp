#include<iostream>
using namespace std;
int const size =3;
class vector{
    int v[size];
    public:
    vector();  // constructor null vector
    vector(int *x);  // constructor vector from array
    friend vector operator*(int a, vector b); // friend 1
    friend vector operator*( vector b, int a); // friend 2
    friend istream & operator >>(istream &, vector &);
    friend ostream & operator <<(ostream &, vector &);
};
vector :: vector(){
    for(int i=0; i<size; i++){
        v[i] =0;
    }
}
vector :: vector(int *x){
    for(int i=0; i<size; i++){
        v[i] =x[i];
    }

}
vector operator *(int a, vector b){
    vector c;
    for(int i=0; i<size; i++){
        c.v[i]=a*b.v[i];
    }
    return c;

}
vector operator *(vector b, int a){
    vector c;
    for(int i=0; i<size; i++){
        c.v[i]=b.v[i]* a;
    }
    return c;

}
istream & operator >>(istream & din , vector &b){
    for(int i=0; i<size; i++){
        din >> b.v[i];
    }
    return din;

}
ostream & operator << (ostream & dout, vector & b){
    dout << "{" <<b.v[0];
    for(int i=0; i<size; i++){
        dout << ","<< b.v[i];
    }
    dout <<"}";
    return dout;
    
}
int x[size]= {2,4,6};
int main(){
    vector m;               // invoke constructor 1
    vector n= x;            // invoke constructor 2
    cout<<"enter element of vector m" <<"\n";
    cin>> m;
    cout<<"\n";
    cout<<" m= "<<m<<"\n";
    vector p,q;
    p=2*m;                  // invoke friend 1
    q=n*2;                  // invoke friend 2
    cout<<"\n";
    cout<<"p ="<< p<<"\n";
    cout<<"q ="<< q<<"\n";





    return 0;
}