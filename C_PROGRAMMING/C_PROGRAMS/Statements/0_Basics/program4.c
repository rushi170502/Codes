
// WAP to find min number among 2 numbers. Take all the values from users...
//
#include<stdio.h>
void main()
{
   int num1,num2;
   printf("Enter the number1 and number2:\n");
   scanf("%d",&num1);
   scanf("%d",&num2);

   if(num1 < num2){
      printf("\n %d ",num1);
   }
   else{
     printf("\n %d\n",num2);
   }

}   
