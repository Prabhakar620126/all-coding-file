#include <iostream>
#include <fstream>
using namespace std;


int main(){
    ofstream hout("country.txt");
    cout<<"enter your name ";
    string name;
    cin>>name;
    hout<<name;
    hout.close(); 
    ifstream in;
    in.open("country.txt");
    string line;
    getline(in,line);
    cout<<line;
    

    
    return 0;
}