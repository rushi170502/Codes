
// WAP to print all even numbers in reverse order & odd numbers in standard form.
//
// 8642 even
// 3579 odd

#include<stdio.h>
 void main()
 {
   int num,num1;
   printf("Enter the number: ");
   scanf("%d",&num);
   printf("\n Enter the number 2 :  ");
   scanf("%d",&num1);

   for(int i=num1;i>=num;i--)
   {
     if(i%2==0)
     {
      printf("%d\t",i);
     }
 
  }
   printf("\n");

  for(int i=num;i<=num1;i++)
  {
    if(i%2==1)
    {
      printf("%d\t",i);
    }
  }
}
