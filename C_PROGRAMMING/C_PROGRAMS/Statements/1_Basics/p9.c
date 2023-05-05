//Write a program to print the sum of first 10 odd numbers

#include<stdio.h>
void main(){
	int i, num,num1, sum = 0;
	printf("\n1: Print sum of ODD numbers");
	printf("\n\nEnter the starting number: ");
	scanf("%d",&num);
    printf("\nEnter the ending number: ");
    scanf("%d",&num1);
	if(num <= num1){
		for(i = num; i <= num1; i++){
			if(i % 2 != 0 ){
				sum = sum + i;
			}	
		}
		printf("\nSum of first  odd numbers is: %d", sum);
	}


	else{
		printf("\nWrong input...!");
	}

	printf("\n\n");
}
