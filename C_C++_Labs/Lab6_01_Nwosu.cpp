#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

#include <math.h>
void fillArray(int a[20], int num){    
     int i,aNum;         
     for(i=0;i<num;i++){
         printf("please enter a number:");            
         scanf("%d",&aNum);
         a[i]= aNum;
         }
}

void printArrayin(int a[20],int num){
     
     int i;
     
     printf("The created array is :\n");
     for(i = 0;i<num;i++){
           printf("%d ",a[i]);
           }printf("\n\n");           
}

int rangeArray(int a[20],int num){
    int i;
    int min =a[0];
    int max = a[0];
    int range = 0;
    for(i = 0;i<num;i++){
          if(max< a[i]){
             max= a[i];
          }
    }for(i = 0; i<num;i++){
           if(min> a[i]){
              min = a[i];
           }
    }range = max - min;
    return range;
}

double meanArray(int a[20],int num){
     int i;
     double mean=0;
     double count = 0;
     for(i = 0; i<num; i++){
           mean += a[i];
           count++;
     }mean /= (double)count;
     return mean;
           
}

double devArray(int a[20],int num, double mean){
       int i;
       double count=0;
       double var=0;
       double svar=0;
       for(i =0; i<num; i++){
             var+= pow((double)(a[i]-mean),2.0);
             count++;
       }svar=pow((var/count),.5);
       return svar;
}
           


int main ()
{
  int arrrow, arr1[20],op;
  int Maxin =20;
  
  printf("What is your max number of inputs? :");
  scanf("%d",&arrrow);
  
  if(arrrow<=Maxin){
                       
  fillArray(arr1,arrrow);
  printArrayin(arr1,arrrow);
  while(op != 4){
  printf("Compute Mean:1\nCompute Standard Deviation:2\nCompute Range:3\nExit:4\n\nWhat would you like to compute?:");
  scanf("%d",&op);
  
      switch (op){
           case 1:
                 printf("\nthe mean value of your inputs is %f\n",meanArray(arr1,arrrow));
                 break;
           case 2:
                printf("\nthe Standard Deviation of your inputs is %f\n",devArray(arr1,arrrow,meanArray(arr1,arrrow)));
                break;
           case 3:
                printf("\nthe Range of your inputs is %d\n",rangeArray(arr1,arrrow));
                break;
           case 4:
                printf("\nGoodbye\n");
                break;
           default:
                   printf("invalid operation\n");
                   break;
           }
           }     
}else{
      printf("Too many inputs\n");
      main();
      }
  getch();
  return 0;
}
