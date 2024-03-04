#include<iostream>
using namespace std;
void print(int n){
    if(n==0) return;
    
    print(n-1);
    cout<<n<<endl;
    
}
int sum(int n){
    if(n==0) return 1;
    return n+ sum(n-1);

}
int fact(int n){
    if(n==0) return 1;
    return n* fact(n-1);

}
int pow(int a , int b){
    if(b==0) return 1;
    return a* pow(a, b-1);

} 
int fibo(int n){
    if(n==1|| n==2) return 1;
    return fibo(n-1)+ fibo(n-2);
}
int main() {
    //print(3);
    // cout <<sum(5)<<endl;
    // cout <<fact(5)<<endl;
    // cout << pow(3,5);
    cout <<fibo(15);
}