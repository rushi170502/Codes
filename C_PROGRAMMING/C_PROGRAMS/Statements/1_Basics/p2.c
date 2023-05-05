//Write a program to print first 100 numbers

#include<stdio.h>
void main(){

	int i, start, end;

		printf("\nEnter starting number:: ");
		scanf("%d", &start);

		printf("Enter ending number:: ");
		scanf("%d", &end);

		for(i = start; i <= end; i++){
			printf("  %d",i);
	  }
	printf(" \n\n\n");
}
