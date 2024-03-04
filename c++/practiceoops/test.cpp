#include <iostream>
using namespace std;

class Complex {
private:
    double x;
    double y;

public:
    Complex() {}
    Complex(double real , double imaginary ){
x = real;
y=imaginary;
    }
    // Declaration of friend function for overloading '+'
    friend Complex operator+(const Complex& c1, const Complex& c2);

    // Display function to print complex numbers
    void display() const {
        std::cout << x << " + " << y << "i" << endl;
    }
};

// Definition of friend function for overloading '+'
Complex operator+(const Complex& c1, const Complex& c2) {
    // Create a temporary complex number to store the result
    Complex temp;
    temp.x= c1.x + c2.x;
    temp.y = c1.y + c2.y;
    return temp;
}

int main() {
    // Create two complex numbers
    Complex c1(3, 4.0);
    Complex c2(1.0, 20.0);

    // Use the overloaded '+' operator to add the complex numbers
    Complex result = c1 + c2;

    // Display the result
    std::cout << "Result of addition: ";
    result.display();

    return 0;
}