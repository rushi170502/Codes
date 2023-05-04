
// WAP  take a number and print whether it is less than 10 or greater than 10, take all values from users....
//
#include<stdio.h>
void main(){
  int num;
  printf("Enter the number you want to check:");
  scanf("%d",&num);

  if(num > 10){
    printf("\n %d is Greater than 10\n",num);
   }
  else
  {
    printf("\n %d is less than 10\n",num);

  }
}
