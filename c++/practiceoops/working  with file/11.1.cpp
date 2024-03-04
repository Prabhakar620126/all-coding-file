#include <iostream>
#include <fstream>

using namespace std; // Added this line to use the standard namespace

int main() {
    ofstream outf("item.txt"); // Changed the filename and added the file extension
    cout << "Enter item name: ";
    char name[30];
    cin >> name;
    outf << name << "\n";
    cout << "Enter item cost: ";
    float cost;
    cin >> cost;
    outf << cost << "\n";
    outf.close();

    ifstream inf("item.txt"); // Changed the filename and added the file extension
    inf >> name; // Changed "intf" to "inf"
    inf >> cost; // Changed "cout" to "cost"
    cout << "\n";
    cout << "Item name: " << name << "\n";
    cout << "Item cost: " << cost << "\n";
    inf.close();

    return 0;
}
