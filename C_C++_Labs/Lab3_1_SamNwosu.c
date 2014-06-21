#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <ctype.h>
int main(){
// declarations
    int num1 =0;
    int num2 = 0;
    int op = 0;
    int addsubmult =0;
    float div = 0.0;
    
while(op != 6){  
    printf("Calculator menu:\n(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Innersum\n(6) Exit\nPlease choos an operation:");
    scanf("%d",&op);           
    

// computatons
    switch (op){
           case 1:
                printf("Please enter two numbers:");
                scanf("%d %d", &num1, &num2);
                addsubmult = num1 + num2;
                printf("%d + %d = %d\n", num1, num2,addsubmult);
                break;
           case 2:
                printf("Please enter two numbers:");
                scanf("%d %d", &num1, &num2);
                addsubmult = num1 - num2;
                printf("%d - %d = %d\n", num1, num2,addsubmult);
                break;
           case 3:
                printf("Please enter two numbers:");
                scanf("%d %d", &num1, &num2);
                addsubmult = num1 * num2;
                printf("%d * %d = %d\n", num1, num2,addsubmult);
                break;
           case 4:
                printf("Please enter two numbers:");
                scanf("%d %d", &num1, &num2);
                if(num2 !=0){
                div = (double)num1/num2;
                printf("%d / %d = %f\n", num1, num2,div);
                } else { 
                       printf("Error divide by zero");
                       }
                break;
           case 5:
                printf("Please enter a number ");
                num2 = 0;
                scanf("%d",&num1);
                for(num1 >0; num1/10;){
                         num2 += (num1%10);
                         num1 = num1/10;
                         }
                         num2 += num1;
                printf("\nthe inner sum is %d \n",num2);
                break;
           case 6:
                printf("\nGood bye!\n"); 
                break;
                
            default:
                    printf("\nInvalid operation!\n");   
            }
            }
            
system("pause");
return 0;
}     
                
