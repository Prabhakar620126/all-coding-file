#include<iostream>
#include <string.h>

using namespace std;

class string {
    char *p;
    int len;
    public:
    string(){len=0,p=0;}            // create null string
    string(const char * s);       //create string from array
    string(const string & s);       // copy constructor
    ~string(){delete[] p;}            // destructor
    //+ operator
    friend string operator+(const string &s, const string &t);
    // <= operator
    friend bool operator <=(const string & s , const string & t ); 


};
string :: string (const char *s){
    len=strlen(s);
    p= new char[len+1];
    strcpy(p,s);
}
string :: string (const string &s){
    len= s.len;
    p=new char[len+1];
    strcpy (p, s.p);
}
// o erloading + operator
string operator+(const string &s, const string &t){
    string temp;
    temp.len= s.len+t.len;
    p= new char[temp.len+1];
    strcpy(temp.p, s.p);
    strcat(temp.p, t.p);
    return temp;
}
//  overloading <=  operator
bool operator<= (const string &s, const string &t){
    int m= strlen(s.p);
    int n= string(t.p);
    if(m<= n){
        return 1
        true;
    }else{
        return false;
    }
}
void show(const string s){
    cout<<s.p;
}

int main(){
    string s1= "New";
    string s2="york";
    string s3= "delhi";
    string string1, string2, string3;
    string1= s1;
    string2= s2 ;
    string3 = s1+ s3;
    cout<<"string 1= \n";
    show(string1);
    cout<<"string 2= \n ";
    show(string2);
    cout<<"string 3= \n ";
    show(string3);
    cout<<"\n";
    if(string1 <=string3){
        show(string1);
        cout<<"smaller than ";
        show(string3);

    }else{
        show (string3);
        cout<<"smaller than ";
        show(string1);
    }



    return 0;
}
