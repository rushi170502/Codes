

// WAP,take two chracter from user and check them are equal or not if true then print both chracters are equal and if false then print thier differnce in interger
//
#include<stdio.h>
void main()
{
  cha ch1,ch2;
  int diff=0;

  printf("Enter the character 1: ");
  scanf("%c",&ch1);
  printf("\nEnter the chracter 2: ");
  scanf(" %c",&ch2);

  if(ch1==ch2)
  {
    printf("\n%c & %c  Both characters are equal..\n",ch1,ch2);
  }
  else
  {
    if(ch1>ch2)
    {
      diff=ch1-ch2;
      printf("\n\n%c & %c difference is : %d  \n\n",ch1,ch2,diff);
    }
    else
    {
      diff=ch2-ch1;
      printf("%c & %c difference is : %d  \n",ch1,ch2,diff);
    }

  }

}
