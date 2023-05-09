// While loop
// WAP to print  addition of digit given number by user..
// 
//
#include<stdio.h>
void main()
{
  int num,rem,cnt=1;
  printf("\n Enter the number:  ");
  scanf("%d",&num);

  while(num!=0)
  {
     rem = num%10;
     cnt = cnt* rem;
      num=num/10;    
  }
  printf("\n Product is : %d\n ",cnt);

 }
