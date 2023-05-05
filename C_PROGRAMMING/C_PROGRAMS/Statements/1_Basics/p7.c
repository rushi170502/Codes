// Write a program to print a table of given number from user

#include<stdio.h>
void main(){

	int i, num;

	printf("\nEnter the number whose table you want to print:: ");
	scanf("%d", &num);

	if(num >= 1){
		for(i = 1; i <= 10; i++){
			printf("\n %d * %d = %d", num, i, num * i);
		}
	}
	else{
		printf("\nWrong input");
	}

	printf("\n\n");
}

	
