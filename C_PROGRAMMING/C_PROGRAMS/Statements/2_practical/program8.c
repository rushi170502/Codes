
// WAP to print the triangle is valid or not values given by users and addition become 180
//
#include<stdio.h>
void main()
{
  int a,b,c;
  printf("\n Enter the three values/; \n\n");
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);

  if(a+b+c==180)
  {
    printf("\n It is valid triangle.\n");
  }

  else
  {
    printf("\n It is not valid traingle.\n\n");
  }

}

