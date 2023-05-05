
// WAP to print the factorial of given number:
//
#include<stdio.h>
void main()
{
  int num,fact=1;
  printf("Enter the number : ");
  scanf("%d",&num);

  for(int i=1;i<=num;i++)
  {
    fact=fact*i;
  }

  printf("\n Factorial of %d is : %d  \n\n",num,fact);
}
