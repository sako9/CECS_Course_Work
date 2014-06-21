#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <ctype.h>
int main(){
// declarations
    int num1;
    int num2;
    int op;
    int addsubmult =0;
    float div = 0.0;
    
 // asks for operation  
    printf("Please choose an operation:");
    scanf("%d",&op);
 // checks if valid operation   
        
     printf("Please enter two numbers:");
     scanf("%d %d", &num1, &num2);
     
// checks if valid inputs            
    if(isalpha(num1)|| isalpha(num2)){
        printf("invalid inputs");
        op = 5;
        }

// computatons
    switch (op){
           case 1:
                addsubmult = num1 + num2;
                printf("%d + %d = %d", num1, num2,addsubmult);
                printf("\nGood bye!\n");
                break;
           case 2:
                addsubmult = num1 - num2;
                printf("%d - %d = %d", num1, num2,addsubmult);
                printf("\nGood bye!\n");
                break;
           case 3:
                addsubmult = num1 * num2;
                printf("%d * %d = %d", num1, num2,addsubmult);
                printf("\nGood bye!\n");
                break;
           case 4:
                if(num2 !=0){
                div = (double)num1/num2;
                printf("%d / %d = %f", num1, num2,div);
                } else { 
                       printf("Error divide by zero");
                       }
                printf("\nGood bye!\n");
                break;
           case 5:
                printf("\nGood bye!\n");
                break;
            default:
                    printf("\nGood bye!\n");   
            }
            
system("pause");
return 0;
}     
                
    
    
    
