// While loop
// WAP take a input from user and count the number of digit..
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
     num/=10;
    cnt++;
  }

   printf("\n Count of digits : %d\n ",cnt);
}
