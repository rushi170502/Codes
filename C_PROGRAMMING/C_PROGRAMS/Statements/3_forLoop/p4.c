

// WAP to find the sum of  numbers that are divisible by 5 in the given range..
//
#include<stdio.h>
void main()
{
  int num1,num2;
  printf("Enter the number 1 :  ");
  scanf("%d",&num1);
  printf("\n Enter the number 2 :");
  scanf("%d",&num2);
 int sum=0;
  for(int i=num1;i<=num2;i++)
  {
    if(i%5==0)
    {
      sum=sum+i;
    }
  }
  printf("\nTotal sum is : %d \n\n",sum);
}

