

//WAP to print the divisors of the given number by user
//
#include<stdio.h>
void main()
{
  int num;
  printf("Enter the Number:  ");
  scanf("%d",&num);

  for(int i=1;i<=num;i++)
  {
    if(num%i==0)
    {
      printf("\n%d ",i);
    }
  }
 printf("\n");
}
