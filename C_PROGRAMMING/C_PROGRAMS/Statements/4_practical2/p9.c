
// WAP to take input from user and print it in reverse order..
//
#include<stdio.h>
void main()
{
  int num,rem;
  printf("Enter the number:  ");
  scanf("%d",&num);

  while(num!=0)
  {
    rem=num%10;
    printf("%d",rem);
    num=num/10;

  }
  printf("\n\n");
}


