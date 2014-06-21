#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <time.h>
void fillArray(int a[20][20], int numrow,int numcolm){
     
     int i,j,randNum;
     
     
     for(i=0;i<numrow;i++){
         for(int j=0; j<numcolm;j++){
         randNum = rand()%100;
         a[i][j] = randNum;
         }
     }
}

void printArrayin(int a[20][20],int numrow,int numcolm){
     
     int i,j;
     
     printf("The created array is :\n");
     for(i = 0;i<numrow;i++){
           for(j=0;j<numcolm;j++){
           printf("%d ",a[i][j]);
           }printf("\n");
           }
}
void printArrayout(int a[20][20],int numrow,int numcolm){
     
     int i,j;
     
     printf("The smoothened array is :\n");
     for(i = 0;i<numrow;i++){
           for(j=0;j<numcolm;j++){
           printf("%d ",a[i][j]);
           }printf("\n");
           }
}
void maxArray(int a[20][20],int numrow, int numcolm){

     int i,j,max;
     int count =1;
     for(i =0;i<numrow;i++){
           for(j=0;j<numcolm;j++){
           if(a[i][j]>max){
           max = a[i][j];
             }
           }
     } 
     printf("the max vzlue in this array is %d\n",max);
}
void traceArray(int a[20][20],int numrow){
     int i,j;
     int sum = 0;
     int place = 0;
     for(i=0;i<numrow;i++){
         sum += a[i][place];
         place++;
         }
        printf("the trace value is %d",sum);
        }                  
     

int main ()
{
  int arrrow,arrcol, arr1[20][20],arr2[20][20];
  srand ( time(NULL) );
  
  printf("Enter number of rows and columns for each array :");
  scanf("%d %d",&arrrow,&arrcol);
  
  fillArray(arr1,arrrow,arrcol);
  printArrayin(arr1,arrrow, arrcol);
  maxArray(arr1,arrrow,arrcol);
  traceArray(arr1,arrrow);
  getch();
  return 0;
}
