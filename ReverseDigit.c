#include <stdio.h>
main()
{
    int num,quo,n,rem,rev=0;
    printf("Enter a number: ");
    scanf("%d",&num);
    n=num;
    while(num>0)
    {
     quo=num/10;
     rem=num%10;
     rev=rev*10+rem;
     num=quo;
    }
    printf("The reverse of %d is %d",n,rev);

}
