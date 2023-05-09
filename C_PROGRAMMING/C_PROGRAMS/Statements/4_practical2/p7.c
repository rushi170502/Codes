// While loop
// WAP to print  addition of digit given number by user..
// 
//
#include<stdio.h>
void main()
{
  int num,rem=0,cnt=0;
  printf("\n Enter the number:  ");
  scanf("%d",&num);

  while(num!=0)
  {
     rem = num%10;
     cnt = cnt+ rem;
     num=num/10;
  }
  printf("\n Addition is : %d\n ",cnt);

 }
