//
// WAP to find the maximum among 3 numbers;
//
#include<stdio.h>
void main()
{
  int x,y,z;
  printf("Enter 3 numbers:");
  scanf("%d",&x);
  scanf("%d",&y);
  scanf("%d",&z);

  if(x==y && y==z && z==x)
  {
    printf("\n all are equal...");
    }

   else if(x>y)
   {
     printf("\n %d is greater than %d & %d\n",x,y,z);
   }
  else if(z>x)
  {
    printf("\n %d is greater than %d & %d\n",z,x,y);
  }

  else if(y>z)
  {
   printf("\n %d is greater than %d & %d\n",y,x,z);
  }
  else if(y>x)
  {
   printf("\n %d is greater than %d & %d \n",y,x,z);
  }
  else
  {
    printf("\n %d is greater than %d & %d \n\n",z,x,y);

  }
}

