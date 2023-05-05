
// WAP to print the spelling of given number...
//
#include<stdio.h>
void main()
{
  int num;
  printf("\n Enter the number :\n");
  scanf("%d",&num);
  
  switch(num)
  {
    case 0:
       printf("\n zero\n");
       break;

    case 1:
       printf("\n One\n");
       break;

   case 2:
       printf("\n Two\n");
       break;

   case 3:
       printf("\n Three\n");
       break;

   case 4:
       printf("\n Four\n");
       break;
  
   case 5:
       printf("\n Five\n");
       break;

  deafult:
       printf("\n You entered greater than 5\n\n");
  }

}
