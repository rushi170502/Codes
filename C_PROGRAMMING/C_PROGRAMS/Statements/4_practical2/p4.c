
// WAP to print to take input from user and print whether it is prime number or not..
//  for loop

  #include<stdio.h>
  void main()
  {
    int num,cnt=0;
    printf("Enter the number : ");
    scanf("%d",&num);
   
    for(int i=2;i<=num/2;i++)
     {
       if( num%i==0)
       {
         cnt++;
        // break;
       }
     }

    if(cnt==0)
    {
      printf("\n %d is a prime number \n",num);

    }
    else
    {
      printf("%d is not prime number\n",num);
    }

}
