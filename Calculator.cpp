#include<iostream>

using namespace std;                    //Declaring input/output operator as std

int main()
{
    system("cls");                      //To clear the screen
    int a,b,c;
    char ch;
    
    cout<<"Enter the first value: ";
    cin>>a;
    cout<<"Enter the second value: ";
    cin>>b;

    opratr: 
    cout<<"Enter the operator(+, -, *, /): ";
    cin>>ch;

    switch(ch)
    {
        case '+' : c = a + b;
                  cout<<"\nThe sum of "<<a<<" and "<<b<<" is " <<c<<endl;
                  break;
        case '-' : c= a - b;
                   cout<<"\nThe difference between "<<a<<" and "<<b<<" is "<<c<<endl;
                   break;
        case '*' : c = a * b;
                   cout<<"\nThe product of "<<a<<" and "<<b<<" is "<<c<<endl;
                   break;
        case '/' : c = a / b;
                   cout<<"\nThe quotient of "<<a<<" and "<<b<<" is "<<c<<endl;
                   break;
        default : cout<<"\n\nWrong operator!\nEnter a valid one!\n"<<endl;
                  goto opratr;                  //goto function so the continuity of program doesn't break
    }

    system("pause");                            //It is an function which holds the screen
    return 0;
}