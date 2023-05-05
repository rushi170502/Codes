//Write a program to print even numbers 1 - 100
#include<stdio.h>
void main(){
	int i;
	int start, end;
	
		printf("\nEnter starting number:: ");
		scanf("%d", &start);
		printf("Enter ending number:: ");
		scanf("%d", &end);

		for(i = start; i <= end; i++){
			if(i % 2 == 0){
				printf(" %d ", i);
			}
		}	
	printf("\n\n");
}

