//Write a program to print ASCII values from 0 to 127

#include<stdio.h>
void main(){

	int i;
    int start, end;
    printf("\n Enter the num1:");
    scanf("%d",&start);
    printf("\n Enter the num2:");
    scanf("%d",&end);
	for(i = start; i <= end; i++){
		printf("\n %c = %d", i, i);
	}

	printf("\n\n");
}
