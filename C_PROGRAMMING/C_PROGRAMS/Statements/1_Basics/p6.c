//Write a program to print reverse from 100 to 1
#include<stdio.h>
void main(){
	int i, start, end;
	{
		printf("\nEnter Starting number:: ");
		scanf("%d", &start);
		printf("Enter Ending number:: ");
		scanf("%d", &end);	
		if(start == end){
			printf("\nBoth inputs are same...!");
		}
		else if(start > end){
			for(i = start; i >= end; i--){
				printf(" %d ", i);
			}
		}
		else if(start < end){
			for(i = end; i >= start; i--){
				printf(" %d ", i);
			}
		}
		else{
			printf("\nWrong input");
		}
	}
	printf("\n\n");
}

