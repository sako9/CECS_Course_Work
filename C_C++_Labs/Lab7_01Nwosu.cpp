#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <time.h>
bool sameArray(int a[20],int numrow, int number){
        bool isSame = false;
        int i;
        for( i = 0; i<numrow;i++){
            if(number == a[i]){
               isSame = true;
               }
            }
        return isSame;
}
              
void fillArray(int a[20], int numrow){
     
     int i,randNum;         
     for(i=0;i<numrow;i++){
         randNum = rand()%101;
         if(sameArray(a,numrow,randNum) == false){
            a[i] = randNum;
            }else{
                  while(sameArray(a,numrow,randNum)){
                         randNum = rand()%101;
                        }a[i] = randNum;
                  }
        }
}

void printArrayin(int a[20],int numrow){
     
     int i,j;
     
     printf("The lucky array is :\n");
     for(i = 0;i<numrow;i++){
           printf("%d ",a[i]);
           }printf("\n");
           }

     

int main ()
{
  int arr1[20],guess;
  int count = 0;
  const int arrrow = 20;
  srand ( time(NULL) );
  
  fillArray(arr1,arrrow);
  
  printf("Initializing lucky numbers...");
  printf("\nPlease guess a number between 0 and 100 :");
        scanf("%d",&guess);
  while(count<2 && !sameArray(arr1,arrrow,guess)){
        if(guess>100||guess<0){
          printf("%d is not a valid number",guess);
          count++;
          printf("\nPlease guess a number between 0 and 100 :");
          scanf("%d",&guess);
          }else{       
        printf("%d is not a lucky number,try again",guess);
        printf("\nPlease guess a number between 0 and 100 :");
        scanf("%d",&guess);
        count++;
        }
     } 
  if(count == 2 && !sameArray(arr1,arrrow,guess)){
     printf("HA! You Lost!\n\n");
     }else{
     printf("YOU ARE A WINNER!!!!!!!!!!\n\n");
     }
  printArrayin(arr1,arrrow);
  getch();
  return 0;
}
