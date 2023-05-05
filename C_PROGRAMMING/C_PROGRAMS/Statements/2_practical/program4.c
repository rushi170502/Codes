
// WAP to print to print the days of month in year
//
#include<stdio.h>
void main()
{
  int mn;
  printf("\n Enter the month :  ");
  scanf("%d",&mn);

  switch(mn)
  {
    case 1:
      printf("\n January has 31 days.\n");
      break;

    case 2:
       printf("\n February has 28 days and 29 days in leap year.\n");
       break;

    case 3:
       printf("\n March has 31 days.\n");
       break;

    case 4:
       printf("\n April has 30 days.\n");
       break;

    case 5:
       printf("\n May has 31 days.\n");
       break;

    case 6:
       printf("\n June has 30 days.\n");
       break;

    case 7:
       printf("\n July has 31 days.\n");
       break;

    case 8:
       printf("\n August has 31 days.\n");
       break;

    case 9:
       printf("\n September has 30 days.\n");
       break;

    case 10:
       printf("\n October has 31 days.\n");
       break;

    case 11: 
       printf("\n November has 31 days.\n");
       break;
       
    case 12:
       printf("\n December has 30 days.\n");
       break;

   default:
       printf("\n Wrong input....\n");
  }

}
  
