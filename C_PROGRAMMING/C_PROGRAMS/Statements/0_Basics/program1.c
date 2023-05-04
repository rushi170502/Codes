//
// Write a program to print the value and size of below variables, Takes values from users..

#include<stdio.h>
 void main(){
   
  int num;
  char ch;
  float x;
  double y;

  printf("\n Enter the values:(char,int,float,double)\n");
  printf("\n Enter the Character:");
  scanf("%c",&ch);
  printf("\n Enter the Integer:");
  scanf("%d",&num);
  printf("\n Enter the float value:");
  scanf("%f",&x);
  printf("\n Enter the double float value:");
  scanf("%lf",&y);

  printf("\n\n num:%d \n ch:%c \n x:%f \n y:%lf \n",num,ch,x,y);

  printf("\n Size of int: %d bytes",sizeof(num));
  printf("\n Size of float: %d bytes",sizeof(x));
  printf("\n Size of double: %d bytes",sizeof(y));
  printf("\n Size of char: %d bytes\n\n",sizeof(ch));
 }
