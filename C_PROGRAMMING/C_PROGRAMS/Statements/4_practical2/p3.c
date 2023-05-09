
// WAP to print the divisors and count of divsiorsof entered number..
//
#include<stdio.h>
void main()
{
  int num,cnt=0,sum=0;
  printf("Enter the number:  ");
  scanf("%d",&num);

  for(int i=1;i<=num;i++)
  {
    if(num%i==0)
    {
      cnt++;
      sum=sum+i;
      printf(" %d \n",i);
    }
  }
    printf("\n count : %d \n",cnt);
    printf("\n Addition : %d \n\n",sum);
}
