#include<iostream>
using namespace std;
int primenumber(int m,int n,int x){
    int a=0;
    for(int i =m+1; i<n;i++){
        for(int j=2; j<i; j++){
            if(i%j==0){
                x=0;
                break;
            }   
            x++;
        }
        if(x!=0){
            a++;
              cout<<i<<endl;  
        } 
      
    }   
    return a; 
}


void loops(){
    // even number  between 1 to 100
    for(int i=0 ; i<=100; i++){
        if(i%2 == 0 ){
            cout<<i<<" ";
        }
    }
    cout<<endl; 

}
 void sumofdigit(){
    int n , sum =0 ;
    cout<<"enter the number :";
    cin>>n;
    for(int i=0 ; n!=0;i++){
        int lt = n%10;
        n /= 10;
        sum += lt;
    }
    cout<<"sum of digit "<<sum <<endl;

    }   
void productofdigit(){

    int n , product=1 ;
    cout<<"enter the number :";
    cin>>n;
    for(int i=0 ; n!=0;i++){ 
        int lt = n%10;
        n /= 10;
        product *= lt;
    }
    cout<<"products of digit "<<product <<endl;

    } 
void lecture(){

    //cout<<"prabhakar";
    // simple calculator
    cout<<"Enter the first number :";
    int x, y ;
    char op;
    cin>>x;
    cout<<"Enter the second number : ";
    cin>>y;
    cout<<"Enter the operation sign :";
    cin>>op;
    if(op=='+') cout<<x+y;
    if(op=='-') cout<<x-y;
    if(op=='*') cout<<x*y;
    if(op=='/') cout<< x/y ;
}
void reverseofdigit(){
    int n , result =0 ;
    cout<<"enter the number :";
    cin>>n;
    for(int i=0 ; n!=0;i++){
        int lt = n%10;
        result *= 10;
        result += lt;
        n /=10;
    }
    cout<<"reverse of digit "<<result <<endl;

    } 
void sumofdigitandreverse(){
    int n , sum =0 ;
    cout<<"enter the number :";
    cin>>n;
    int N= n;
    for(int i=0 ; n!=0;i++){
        int lt = n%10;
        n /= 10;
        sum += lt;
    }
    int result =0;
    for(int i=0 ; N!=0;i++){
        int lt = N%10;
        result *= 10;
        result += lt;
        N /=10;
        sum += lt;
    }
    cout<<result<<endl;
    cout<<"sum of digit  and reverse is :"<<sum <<endl;

    } 
void factorial(){
    cout<<"Enter the number :";
    int n , result =1;
    cin>>n;
    for(int i=1; i<=n;i++){
        result *=i;
        cout<<" factorial of number"<<i<< "is "<< result<< endl;
    }
    cout<<result;
}
void pattern(){
    cout<<"Enter the number of row and coloum :";
    int n , m;
    cin>>n >>m;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            cout<<"* ";
        }
        cout<<endl;
    }
}
void patternnumber(){
    cout<<"Enter the number  :";
    int n ;
    cin>>n ;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout<<j <<" ";
        }
        cout<<endl;
    }   
}
void patternalphabet(){
    cout<<"Enter the number :";
    int n ;
    cin>>n ;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout<<(char)(j+64) <<" ";
        }
        cout<<endl;
    }
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout<<(char)(j+96) <<" ";
        }
        cout<<endl;
    }  

}
void trianglepattern(){
    cout<<" enter the number :";
    int n;
    cin>>n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            cout<<"*" <<" ";
        }
        cout<<endl;
    }
}
void trinum_alp(){
    cout<<" enter the number :";
    int n;
    cin>>n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(i%2!= 0){
                cout<<j;
            }
            else{
                cout<<(char)(j+64);
            }
        }
        cout<<endl;
    }
}
void triulta(){
    cout<<" enter the number :";
    int n;
    cin>>n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n+1-i; j++){
            cout<<"*" <<" ";
        }
        cout<<endl;
    }
}
void trizeroandone(){
    cout<<" enter the number :";
    int n;
    cin>>n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0) cout<<"1";
            else cout<<"0";
        }
        cout<<endl;
    }
   
}

int main(){
    trizeroandone();
    //triulta();
    //trinum_alp();
    //trianglepattern();
    //patternalphabet();
    //patternnumber();
    //pattern();
    //sumofdigitandreverse();
    //factorial();
    //reverseofdigit();
    //productofdigit();
    //sumofdigit(); 
    //loops();
    
     // prime number between m and n
    // int m, n ;
    // cout<<"enter the boundary between prime no."<<endl;
    // cin>>m>>n;
    // int x=0;
    // cout<<"the total prime no is "<<primenumber(m,n,x);


}