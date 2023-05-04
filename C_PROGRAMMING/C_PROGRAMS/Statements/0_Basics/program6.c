
// WAP to check whether the number is even or odd, take all values from users...
//
#include<stdio.h>
void main()
{
   int num;

   printf("Enter the number: ");
   scanf("%d",&num);

   if(num%2==0){
     printf("\n %d is an even number..",num);
   }

   else{
     printf("\n %d is an odd number..",num);
    }
}
