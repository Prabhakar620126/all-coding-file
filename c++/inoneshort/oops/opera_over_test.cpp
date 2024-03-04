#include <iostream>

class Date {
private:
    int day;
    int month;
    int year;

public:
    // Constructor
    Date(int d, int m, int y) : day(d), month(m), year(y) {}

    // Overloading << operator for output
    friend std::ostream& operator<<(std::ostream& os, const Date& date) {
        os << date.day << '/' << date.month << '/' << date.year;
        return os;
    }

    // Overloading >> operator for input
    friend std::istream& operator>>(std::istream& is, Date& date) {
        char slash; // to store the '/' character
        is >> date.day >> slash >> date.month >> slash >> date.year;
        return is;
    }

    // Other member functions or operators can be defined as needed
};

int main() {
    // Example usage of the Date class and operator overloading
    Date today(12, 12, 2023);

    // Output using overloaded <<
    std::cout << "Today's date: " << today << std::endl;

    // Input using overloaded >>
    Date userDate(0, 0, 0);
    std::cout << "Enter a date (dd/mm/yyyy): ";
    std::cin >> userDate;
    std::cout << "You entered: " << userDate << std::endl;

    return 0;
}
