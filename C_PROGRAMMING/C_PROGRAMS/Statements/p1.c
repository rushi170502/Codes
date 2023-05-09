
// WAP to print the sum of the numbers that are not divisible by 3 upto a given number..
//
#include<stdio.h>
void main()
{
  int num,sum=0;
  printf("Enter the number: ");
  scanf("%d",&num);

  for(int i=1;i<=num;++i)
  {
    if(i%3!=0)
    {
       sum=sum+i;
    }
  }

  printf("\n Sum of numbers not divisible by 3 is %d \n\n ",sum);

}

