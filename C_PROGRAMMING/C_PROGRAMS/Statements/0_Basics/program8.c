
// WAP , take a character from user and check whether it is UPPERCASE or lowercase..
//
#include<stdio.h>
void main()
{
  char ch;
  printf("\n Enter the character:");
  scanf("%c",&ch);

  if(ch >='A' && ch <='Z')
  {
    printf("\n You entered a UPPERCASE character..");
  }

  else if( ch >='a' && ch<='z')
  {
    printf("\n You entered a lowercase character..");
  }
 else
  {
   printf("\n Wrong input..\n");
  }
}
