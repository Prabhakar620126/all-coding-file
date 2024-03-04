#include <iostream>
using namespace std;

class bankdetail
{
    string nameof_depositor;
    double account_number;
    string type_of_account;
    double balace_amount;
    public:
    // to assign the initial value
    void getdata(string s, long double a, string t, long double b){
        nameof_depositor=s;
        account_number = a;
        type_of_account = t;
        balace_amount = b;
    }

    // deposite an amount
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
        cout<<" acount number of customer ::"<< account_number<<endl;
        cout<<"Types of  account  :" <<type_of_account<<endl;
        cout<<"blance amount in your account :"<<balace_amount<<endl;
            
    }
    
};
 
int main(){
    /*
    Define a class to represent a bank account. Include the following members: 
Data members: 
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


   bankdetail customer1;
   customer1.getdata(" Prabhakar kumar shahi ", 917632 , " saving", 10000);
   customer1.display();
   customer1.deposite_amount();
   customer1.withdraw();
   customer1.display();


    return 0;
}