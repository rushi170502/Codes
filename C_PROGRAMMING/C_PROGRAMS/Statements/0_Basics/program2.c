//
//Write a program to print values of below expressions..
//
#include<stdio.h>
void main()
{
  int x=9,y=9,z=9,w=9,ans,ans1,ans2,ans3;
 // printf("\n Enter the number:");
 // scanf("%d",&x);

  ans= ++x + x++ + ++x;
  printf("\nAns: %d",ans);
  printf("\n  x: %d",x);

  ans1= ++y + ++y + ++y + ++y;
  printf("\nans1: %d",ans1);
  printf("\n   y: %d",y);

  ans2= z++ + z++ + ++z + z++;
  printf("\nans2: %d",ans2);
  printf("\n   z: %d",z);

  ans3= w++ + w++ + w++ + w++;
  printf("\nans3: %d",ans3);
  printf("\n   w: %d\n",w);

}
 

