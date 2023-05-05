
//  WAP tp accept 10 numbers from users and print their sum and average..
//
#include<stdio.h>
void main()
{
  int sum=0,i,j;
  float avg=0;

  printf("\n Enter the values 0 to 10: \n");

  for(i=1;i<=10;i++)
  {
    scanf("%d",&j);
    sum= sum + j;
  }

  printf("\n Total sum : %d\n\n",sum);

    avg= sum/10;

  printf("\n Average : %f \n\n",avg);

}
