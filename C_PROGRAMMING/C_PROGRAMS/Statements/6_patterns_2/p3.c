/*
 * WAP to print pattern..
  1  1  1  1
  2  2  2  2
  3  3  3  3
  4  4  4  4
*/
#include<stdio.h>
void main()
{
  int rows;
  printf("\nEnter the rows : ");
  scanf("%d",&rows);
  int x=1;
  for(int i=1;i<=rows;i++)
  {
    for(int j=1;j<=rows;j++)
    {
      printf("%d  ",x);
    }

     printf("\n");
     x++;
  }
}


