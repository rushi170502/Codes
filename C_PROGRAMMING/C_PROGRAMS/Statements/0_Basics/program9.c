
// WAP take a number and check whether it is positive or negative..
//
#include<stdio.h>
void main(){
  int num;

  printf("\n Enter the number:");
  scanf("%d",&num);
  
  if(num==0)
  {
    printf("\n%d you entered number is zero.\n",num);
  }
  else if(num<1){
    printf("\n%d is Negative number\n",num);
   }
  else{
    printf("\n%d is Positive number\n",num);
  }

}


