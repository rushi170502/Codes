

// WAP to print addition of 1 to 10  with 10 to 1
//
   #include<stdio.h>
  void main()
  {
    int num,j=11;
    printf("Enter the number:  ");
    scanf("%d",&num);

    for(int i=1;i<=num;i++)
    {  

      j--;
       printf("\n %d + %d = %d \n",i,j,i+j);
    }
  }
