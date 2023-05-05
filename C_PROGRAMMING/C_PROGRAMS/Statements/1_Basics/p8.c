//Write a program to print table of 11 in reverse order.

#include<stdio.h>
void main(){

	int i, num;

	printf("\nEnter the number whose table you want to print:: ");
	scanf("%d", &num);

	for(i = 10; i >= 1; i--){
		printf("\n %d * %d = %d", num , i, num * i);
	}

	printf("\n\n");
}
