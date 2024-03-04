#include <iostream>
using namespace std;
class product
{
    string name;
    int item;
    double price;

public:
    product(string s = "", int x = 0, double d = 0.0) : name(s), item(x), price(d) {}
    void display()
    {
        cout << " name : " << name << endl
             << "item: " << item << endl
             << "price: " << price << endl;
    }
    int conversion(product p)
    {
        int totalamount = (p.item * p.price);
        return totalamount;
    }
    product conversion(int a)
    {
        product p;
        p.name = name;
        p.item = static_cast<int>(a / (price));
        p.price = static_cast<double>(a / static_cast<double>(item));
        return p;
    }
};

int main()
{
    // Write a program for an inventory of product in store. Use appropriate data type conversion functions to perform the required conversion.
    product p("biscuit", 566, 10.5);
    p.display();
    int t = p.conversion(p);
    cout << "total amount " << t << endl;
    product p1 = p.conversion(t);
    p1.display();

    return 0;
}