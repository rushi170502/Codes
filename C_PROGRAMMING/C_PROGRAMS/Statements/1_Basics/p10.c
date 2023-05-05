//Write a program to print the product of the first 10 numbers

#include<stdio.h>
void main(){

	int i, product = 1, start, end;

	printf("\n Print product of first 10 numbers");
  	
		printf("\nEnter starting number:: ");
		scanf("%d", &start);

		printf("Enter ending number:: ");
		scanf("%d", &end);
		
		for(i = start; i <= end; i++)
        {
			product = product * i;
		}
		printf("\nProduct of numbers is: %d", product);
	

	printf("\n\n");
}
