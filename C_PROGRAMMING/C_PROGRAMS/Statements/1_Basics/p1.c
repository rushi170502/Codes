//Write a program to print the first ten capital alphabets

#include<stdio.h>
void main(){

	char i, start, end, choice;
	
		printf("\nEnter starting letter:: ");
		scanf(" %c", &start);
		printf("Enter ending letter:: ");
		scanf(" %d", &end);

		if((start >= 'A' && end <= 'Z'))
        {
			for(i = start; i <=end; i++){
				printf(" %c ", i);
            }
	    } 
    else{
	     printf("\nWrong input");
	    }

	  printf("\n\n");
}
