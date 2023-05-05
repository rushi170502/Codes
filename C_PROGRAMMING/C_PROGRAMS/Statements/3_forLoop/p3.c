

 //WAP to print the all even numbers in reverse order and odd numbers in standard way both seperately within range

 #include<stdio.h>
 void main()
{
  int num1,num2;
  printf("\nEnter the range you want to check :  ");
  scanf("%d",&num1);
  scanf("%d",&num2);
   int rem=0;
  for(int i=num1;i<=num2;i++)
  {
    if(i%2==1)
    {

      printf("%d  ",i);
    
    }
  }
  printf("\n\n");

    for(int j=num2;j>=num1;j--)
    {
      if(j%2==0)
      {
         printf("%d  ",j);
      } 

    }

}
