
//WAP to see the given number is divisible by 3
//
 #include<stdio.h>
void main()
{
  int num1,num2;
  printf("Enter the number 1:  ");
  scanf("%d",&num1);
  printf("\nEnter the number 2:  ");
  scanf("%d",&num2);

  for (int i=num1; i<=num2;i++)
  {
    if(i%3==0)
    {
      printf("%d  ",i);
    }

  }
  printf("\n\n");

}
