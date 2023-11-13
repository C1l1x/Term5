/*
    Електрически ключ
Вчера Пешо без да иска блокирал врата вкъщи, която може да се отвори след въвеждане на код. Полето за въвеждане на кода представлява
безкрайна последователност от 7-сегментни индикатори. Пешо знае, че кодът е най-голямото естествено число, което може да се престави 
чрез n светещи сегмента.
    Дадено:
        0 съдържа 6 сегмента;
        1 съдържа 2 сегмента;
        2 съдържа 5 сегмента;
        3 съдържа 5 сегмента;
        4 съдържа 4 сегмента;
        5 съдържа 5 сегмента;
        6 съдържа 6 сегмента;
        7 съдържа 3 сегмента;
        8 съдържа 7 сегмента;
        9 съдържа 6 сегмента;
        Изобраване на цифрите чрез 7-сегментен индикатор.
Напишете програма, с която ще помогнете на Пешо да пресметне кода.

Вход
    На един ред на стандартния вход е зададено цяло число n - максимален брой светещи сегменти
за изобразяване на търсеното число (2 <= n  <= 100 000).

Изход
    На един ред на стандарния изход се извежда едно число - пресметнатият код.
*/

#include<iostream>

using namespace std;

void FindGreaterNumber(int n){
    int num, left, result;
    num = n / 2;
    left = num * 2;
    left-= n;
    if (left != 0)
    {
        cout << 7;
        for (int i = 0; i < num-1; i++)
        {
            cout << 1;
        }
        cout << "\n";
    }else
    {
        for (int i = 0; i < num; i++)
        {
            cout << 1;
        }
        cout << "\n";
        
    }
    
}

int main() {
    int n;
    cin >> n;
    while (n<2 || n>100000)
    {
        cin >> n;
    }
    
    FindGreaterNumber(n);
    
    
}