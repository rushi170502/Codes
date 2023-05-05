

// WAP to print the LCM of a given number
//
#include<stdio.h>
void main()
{
  int num1,num2,gcd,lcm;
  printf("Enter the number 1 : ");
  scanf("%d",&num1);
  printf("\nEnter the number 2 : ");
  scanf("%d",&num2);

   for(int i=1;i<=num1 && i<=num2;i++)
   {
     if(num1%i==0 && num2%i==0)
     {
       gcd=i;
     }

   }
   lcm=(num1*num2)/gcd;

   printf("\n The LCM of %d and %d is : %d \n",num1,num2,lcm);
}
