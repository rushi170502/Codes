
// WAP to print max number among three number input given by users
//
#include<stdio.h>
void main()
{
  int x,y,z;
  printf("\n Enter the three numbers:\n\n");
  scanf("%d",&x);
  scanf("%d",&y);
  scanf("%d",&z);

  if(x>y && x>z)
  {
    printf("\n %d is greater than %d & %d \n",x,y,z);
  }

 else if(y>x && y>z)
 {
    printf("\n %d is greater than %d & %d \n",y,x,z);
 }

  else
  { 
    printf("\n %d is greater than %d & %d \n",z,x,y);
  }

}
