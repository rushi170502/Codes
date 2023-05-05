
// WAP to print the numbers in given range and their multipicative inverse
//

#include<stdio.h>
void main()
{
  float n1,n2;
  printf("\nEnter the number 1 : ");
  scanf("%f",&n1);
  printf("\nEnter the number 2 : ");
  scanf("%f",&n2);
 
 printf("\n Multiplicative inverse are : ");
   for(float i=n1;i<=n2;i++)
  {
    printf("\n%.2f ",1/i);
  }
// printf("\n Multiplicative inverse are : %f ",i);
}
