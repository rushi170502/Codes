

// WAP to check whether the entered character is vowel or consonant , take all the values form users...
//
#include<stdio.h>
void main()
{
  char ch;

  printf("Enter the character: ");
  scanf("%c",&ch);

  int up=( ch=='A' || ch=='E' || ch=='I'  || ch=='O' || ch=='U');

  int lc=( ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u');

  if( up || lc)
  {
    printf("\n %c is Vowel..\n",ch);
  }

  else
  {
    printf("\n %c is Consonant..\n",ch);
  }

} 
