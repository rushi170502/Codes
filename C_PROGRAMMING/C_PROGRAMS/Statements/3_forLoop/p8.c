
// WAP to take two characters  if thses characters are equal print both are equal and if not then print their differnece..
//
#include<stdio.h>
void main()
{
  char ch1,ch2;
  int diff=0;
  printf("Enter the character 1 : ");
  scanf("%c",&ch1);
  printf("\nEnter the character 2 : ");
  scanf(" %c",&ch2);

  if(ch1==ch2)
  {
    printf("Both characters are equal ..\n");
  }
  else
  {
    if(ch1>ch2)
    {
      diff=ch1-ch2;
      printf("\n The differnce between %c & %c are %d  \n",ch1,ch1,diff);
    }
    else
    {
      diff=ch2-ch1;
      printf("\n The differnce between %c & %c are %d  \n",ch1,ch2,diff);
    }
  }

}

