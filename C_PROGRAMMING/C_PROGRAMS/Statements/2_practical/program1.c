
/*  WAP to check whether the input is a leap year or not
 *  */

 #include<stdio.h>
 void main()
{
  int i, year;
  printf("\n  Enter the year which you want to check:");
  scanf("%d",&year);

  if(year%400==0)
  {
   printf("\n %d is leap year  ",year);
  }
  else if(year%100==0)
  {
    printf("\n%d is not leap year  ",year);
  }
  else if(year%4==0)
  {
    printf("\n%d is leap year  ",year);
  }
  else
  {
    printf("\n %d is not leap year  ",year);
  }
  printf("\n\n");

}
