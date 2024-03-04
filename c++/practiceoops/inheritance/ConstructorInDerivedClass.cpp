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
    float y;

public:
    beta(float b)
    {
        y = b;
        cout << " beta is initilized \n";
    }
    void show_y()
    {
        cout << "Y = " << y << "\n";
    }
};
class gamma : public beta, public alpha
{
    int m, n;

public:
    gamma(int a, float b, int c, int d) : alpha(a), beta(b)
    {          // constructor in derived class
        m = c; // beta invoke first because  at derived class beta is first
        n = d;
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
    gamma g(5, 10.75, 020, 30);
    cout << "\n";
    g.show_x();
    g.show_y();
    g.show_mn();

    return 0;
}