

// WAP take input from user to print the fibonacci series ...
//
 #include<stdio.h>
 void main()
{
   int  num,temp=0,i=3,temp1=1,temp2;
   printf("Enter the number :  ");
   scanf("%d",&num);
  
     printf("%d\t%d\t",temp,temp1);
   while(i<=num)

   {
   //  printf("%d\t",temp);
     temp2=temp+temp1;
     printf("%d\t",temp2);
     temp=temp1;
     temp1=temp2;
     i=i+1;

    }

  }

