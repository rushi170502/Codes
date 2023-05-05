
// WAP to calculate the square root of numbers ranging from 100 to 300
//
#include<stdio.h>
void main()
{
  int n1,n2,res=1,i;
  printf("Enter the number 1 : ");
  scanf("%d",&n1);
  printf("\nEnter the number 2 : ");
  scanf("%d",&n2);

  for( i=n1;i<=n2;i++)
  {
    res=(i/res + res)/2;
    if(res * res == i)
    {
      printf("\n %d  = %d ",i,res);
    }
  }
  printf("\n\n");
}


