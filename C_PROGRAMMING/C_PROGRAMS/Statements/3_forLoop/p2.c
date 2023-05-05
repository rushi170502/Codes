
// WAP to print the character whose ASCII value is even..
//
#include<stdio.h>
 void main()
{
  int num;
  for(int i=1;i<=127;i++)
  {
    if(i%2==0)
    {
      printf("%d =  %c  \n",i,i);

    }

  }
  printf("\n\n");
}
