#include <iostream>

using namespace std;

void FindGreaterNumber(int n)
{
    int num;
    string result;
    num = n / 2;
    if (n % 2 != 0)
    {
        result = "7";
        for (int i = 0; i < num - 1; i++)
        {
            result += "1";
        }
    }
    else
    {
        for (int i = 0; i < num; i++)
        {
            result += "1";
        }
    }
    cout << result << "\n";
}

int main()
{
    int n;
    cin >> n;
    while (n < 2 || n > 100000)
    {
        cin >> n;
    }

    FindGreaterNumber(n);
}