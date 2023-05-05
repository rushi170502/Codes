
// WAP to print the given numbers are pythogrous triplet or not..

 #include<stdio.h>
 void main()
{
  int a,b,c;
  printf("\nEnter the values a,b,c :\n\n");
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);

  if(a*a== c*c + b*b)
  {
    printf("%d  %d  %d  are pythogrous triplet \n\n",a,c,b);
  }

  else if(b*b== a*a + c*c)
  {
    printf("%d  %d  %d are pythogrous triplet \n\n",b,a,c);
  }
  else if( c*c== a*a + b*b)
  {
        printf("%d  %d  %d are pythogrous triplet \n\n",c,a,b);
  }

  else
  {

    printf("%d  %d  %d are not pythogrous triplet \n\n",a,b,c);
  }
}
