#include<iostream>
#include <cstdlib>

using namespace std;

int main(int argc, char** argv) {

    int n;
    cout << "ingrese altura de la piramde: ";
    cin >> n;

    for (int i = 1; i <= n; i = i + 1) {
        for (int j = 1; j <= n - i; j = j + 1)
            cout << " ";
        for (int j = 1; j <= 2 * i - 1; j = j + 1)
            cout << "*";
        cout << endl;
    }
    cout << endl;
    system("pause");


    return 0;
}

