#include <iostream>
using namespace std;
int main()
{
    int n, i, m = 0;
    bool inv = false;
    cout << "Enter a number to check whether a number is prime or not: " << endl;
    cin >> n;
    m = n / 2;
    for (i = 2; i <= m; i++)
    {
        if (n % i == 0)
        {
            cout << "Number is not Prime" << endl;
            inv = true;
            break;
        }
    }
    if (inv == false)
        cout << "Number is Prime" << endl;
    return 0;
}
