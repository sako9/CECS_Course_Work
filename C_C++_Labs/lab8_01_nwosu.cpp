#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h >
#include <std_lib_facilities.h>
void fillArray(char a[40][40],int numnames,int numlength){
     int i;
     int count = numnames;
     char name[100];
     for(i = 0;i<numnames;i++){
           printf("please enter %d more names that is at the most %d characters:",count,numlength);
           scanf("%s",&name);
           while(strlen(name) >numlength){
                 printf("please enter a name of the correct size:");
                 scanf("%s",&name);
                 }strcpy(a[i],name);
                 count--;
         }
}
int searchArray(char a[40][40],int numnames){
     int i;
     int place = -1;
     char sname[20];
     int arplace[20];
     printf("please enter a name to search for:");
     scanf("%s",&sname); 
            for(int i =0;i<numnames;i++){
                if(strcmp(a[i],sname)==0){
                   return place = i;                     
                   }
               }
     return place;          
}    
             
             
           
int main(){
    const int Max_Names = 20;
    int Max_Nsize=20;
    char arrayName[40][40];
    fillArray(arrayName,Max_Names,Max_Nsize);
    printf("%d\n",searchArray(arrayName,Max_Names));
    system("pause");
}
    
