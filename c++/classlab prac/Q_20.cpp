#include <iostream>
using namespace std;

class bank_account
{
    string nameof_depositor;
    double account_number;
    string type_of_account;
    double balace_amount;
    public:
    void getdata(string s, long double a, string t, long double b){
        nameof_depositor=s;
        account_number = a;
        type_of_account = t;
        balace_amount = b;
    }
    void deposite_amount(){
        cout<<"enter the amount for deposite :";
        int balance;
        cin>>balance;
        balace_amount += balance;
        cout<<"your amount deposite successfully  :"<<endl;
    }
    void withdraw(){
        int amount;
        cout<<"enter the amount for withdral amount: ";
        cin>>amount;
        if(balace_amount>= amount ) {
            balace_amount-= amount;
            cout<<" amount withdral successfuly: "<<endl;
        }else{
            cout<<"insufficient balance withdral falled : "<<endl;
        }
    }
    void display(){
        cout<<"name of customer:   "<<nameof_depositor <<endl;
        cout<<"acount number of customer ::"<< account_number<<endl;
        cout<<"Types of  account  :" <<type_of_account<<endl;
        cout<<"blance amount in your account :"<<balace_amount<<endl;
            
    }
};

int main(){
    /*Define a class to represent a bank account (FOR 100 CUSTOMERS). Include the following members: Data members: 
1. Name of the depositor. 
2. Account number. 
3. Type of account. 
4. Balance amount in the account. 
Member functions: 
1. To assign initial values. 
2. To deposit an amount. 
3. To withdraw an amount after checking the balance. 
4. To display the name and balance. 
Write a main program to test the program
*/

const int num_customer=100;
bank_account customer[num_customer];
string name = "customer";

for(int i=0; i<num_customer; i++){
    
    customer[i].getdata(name + to_string(i+1), 1000+i, "saving", 10000);
}

customer[10].display();
customer[10].withdraw();
customer[10].display();



    return 0;
}