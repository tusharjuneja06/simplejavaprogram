//Program take input from the user and give output

#include<iostream>
using namespace std;

int main()
{
    system("cls");
    int a, b, c;
    cout<<"Enter two values: ";
    cin>>a>>b;                                  //Taking two values from the user
    c = a + b;
    cout<<"The sum of "<<a<<" and "<<b<<" is "<<c<<endl;            //outputting their sum
    system("pause");
}