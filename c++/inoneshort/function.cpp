
#include<iostream>
using namespace std;
int fact(int n ){
    int res=1;
    for(int i=1; i<=n; i++){
        res *=i;
    }
    return res;
}
int combination(int n , int r){
    return fact(n)/(fact(r)*fact(n-r));
}
int main(){
    // pascal triangle 
    cout<<"Enter the n :";
    int n;
    cin>>n;
    for(int i=0; i<=n; i++){
        for(int j=0; j<=n-i; j++){
            cout<<" ";
        }
        for(int j=0; j<=i; j++){
            cout<<combination(i,j)<<" ";
        }
        cout<<endl;

    }



}