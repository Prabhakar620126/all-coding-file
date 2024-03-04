#include<iostream>
#include<math.h>

using namespace std;

class point{
    int x1,y1;
    public:
    point(int a, int b){
        x1 = a;
        y1 = b;
    }
    void displaypoint(){
        cout<<"the point is ("<<x1<<", "<<y1<<")"<<endl;
        
    }
    friend float distancepoint(int a, int b, int c, int d);
};
float  distancepoint(int a, int b, int c, int d){
    float A= ((a-c)*(a-c)) ;   
    float B= ((b-d)*(b-d));
    float C= A+B;
    float ans = sqrt(C);
    return ans;
    //printf("Distance between two point (%d, %d,)and (%d , %d) is %f  \n",a,b,c,d,ans );
    


}
//create a function which takes 2 points object and computes the distance 
//between those point.
int main(){
    int x1 , y1, x2 ,y2;
    cin>>x1>>y1>>x2>>y2;
point p(x1, y1);
p.displaypoint();
point q(x2, y2);
q.displaypoint();
cout<<"Distance between "<<" ("<<x1<<","<<y1<<" ) and ("<<x2<<","<<y2<<") is " << distancepoint(x1,y1,x2,y2)<<endl;


    return 0;
}