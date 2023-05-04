
// WAP to find max number among 2 numbers. Take all the values from users...
//
#include<stdio.h>
void main()
{
   int num1;
   printf("Enter the number1:\n");
   scanf("%d",&num1);

   if(num1%5==0 && num1%11==0){
      printf("\n%d is divisible by 5 & 11 ",num1);
   }
   else{
     printf("\n %d is not divisible by 5 & 11 ",num1);
   }

}   
