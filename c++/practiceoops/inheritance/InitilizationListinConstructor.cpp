#include <iostream>
using namespace std;
class alpha
{
    int x;

public:
    alpha(int i)
    {
        x = i;
        cout << " alpha initalized \n";
    }
    void show_x()
    {
        cout << "x = " << x << "\n";
    }
};
class beta
{
    float y, p;

public:
    beta(float a, float b)
    {
        y = a;
        p = b;
        cout << " beta is initilized \n";
    }
    void show_y()
    {
        cout << "Y = " << y << "\n";
        cout << "p = " << p << "\n";
    }
};
class gamma : public beta, public alpha
{
    int m, n;

public:
    gamma(int a, float c, int b) : alpha(a * 2), beta(c, c), m(a)
    {
        n = b;
        cout << "gamma is initilized \n ";
    }
    void show_mn()
    {
        cout << "m = " << m << "\n";  
        cout << "n= " << n << "\n";
    }
};

int main()
{
    gamma g(5, 20.5, 30);
    cout << "\n";
    g.show_x();
    g.show_y();
    g.show_mn();

    return 0;
}