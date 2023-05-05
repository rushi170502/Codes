
// WAP to take a input number and print all the factors of that numbers
#include<stdio.h>
void main()
{
  int num;
  printf("\n Enter the number:  ");
  scanf("%d",&num);
 printf("\n Factors of %d are : ",num);
  for(int i=1;i<=num;i++)
  {
    if(num%i==0)
    {
      printf("%d  ",i);
    }
  }
  printf("\n\n");
}
