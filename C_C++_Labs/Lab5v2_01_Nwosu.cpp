

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <time.h>
void fillArray(int a[20][20], int numrow,int numcolm){
     
     int i,j,Num;
     
     
     for(i=0;i<numrow;i++){
         for(int j=0; j<numcolm;j++){
         printf("enter element [%d][%d] ",i,j);
         scanf("%d",&Num);
         a[i][j] =Num;
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
void meanArray(int a[20][20],int b[20][20],int numrow, int numcolm){

     int i,j;
     int count =1;
     for(i =0;i<numrow;i++){
           for(j=0;j<numcolm;j++){
           b[i][j]= a[i][j];                       
           if(j+1 <numcolm){
               b[i][j] += a[i][j+1];
               count++;
               }
           if(i+1<numrow){
            b[i][j] += a[i+1][j];
            count++;
            }
            if(j-1>= 0){
            b[i][j] += a[i][j-1];
            count++;
            }
            if(i-1>=0){
            b[i][j] += a[i-1][j];
            count++;
            }
            b[i][j] = b[i][j] / count;
            count = 1;         
     }
    
     }printArrayout(b,numrow,numcolm);
     }

int main ()
{
  int arrrow,arrcol, arr1[20][20],arr2[20][20];
  srand ( time(NULL) );
  
  printf("Enter number of rows and columns for each array :");
  scanf("%d %d",&arrrow,&arrcol);
  
  fillArray(arr1,arrrow,arrcol);
  printArrayin(arr1,arrrow, arrcol);

  meanArray(arr1,arr2,arrrow,arrcol);
  getch();
  return 0;
}
