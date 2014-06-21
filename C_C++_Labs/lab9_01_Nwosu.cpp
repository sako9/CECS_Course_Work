#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h >

typedef struct f{
        char *Fname;
        char *Lname;
        int  Homenum;
        int  Cellnum;
        }friends;
void setFname(f *pb, char *name,int num){
     scanf("%s",name);
     pb[num-1].Fname = (char*)malloc((strlen(name)+1)*sizeof(char));
     strcpy(pb[num -1].Fname,name);      
}

void setLname(f *pb, char *name,int num){
     scanf("%s",name);
     pb[num-1].Lname = (char*)malloc((strlen(name)+1)*sizeof(char));
     strcpy(pb[num -1].Lname,name);   
}

void setHomenum(f *pb,int num,int input){
     scanf ("%d", &input);
     pb[num-1].Homenum = input;
}

void setCellnum(f *pb,int num,int input){
     scanf ("%d", &input);
     pb[num-1].Cellnum = input;
}

void Del (friends *pb,int *numcontacts ){
    int i = 0;
    int count = 0;
    char delTempf[21];  // Temporary string for deletion of an entry - first name
    char delTempl[21];  // Temporary string for deletion of any array - last name
 
    printf("\nFirst name: ");
    scanf("%s", &delTempf);
    printf("Last name: ");
    scanf("%s", &delTempl);
    // compare strings, find entry or return entry not found
    if(*numcontacts > 0){
    for (i=0; i<*numcontacts; i++){
        if (strcmp(delTempf,(pb+i)->Fname) == 0 && strcmp(delTempl, (pb+i)->Lname)==0){                              
            free(pb+i);
            (*numcontacts)--;   // Contact deleted, update the contact total counter
            count++;
        }
        else
        {
            printf("\nEntry not found.\n\n");               
        }
    }   // End for loop
 if(count != 0){
    printf("Record deleted from the phone book\n\n");
}
}
else{
      printf("Phonebook is currently empty\n\n");
}
}

void printFriend (friends *pb,int numcontacts ){
     int i;
     int count = 0;
    char searchname[21];
      
    printf("Last name: ");
    scanf("%s", &searchname);
   if (numcontacts > 0){
        printf("\n\nPhone Book Entries:\n\n");
        for(i=0; i<numcontacts; i++){
            if (strcmp(searchname,(pb+i)->Lname) == 0)    {
                printf("%s %s %d %d\n", (pb+i)->Fname, (pb+i)->Lname, (pb+i)->Homenum,(pb+i)->Cellnum);
            }
        else{
            printf("\n\nname not found\n\n");}
            } 
    }
    else {
        printf("\n\nThe phone book is currently empty.\n\n");
    }
}                   

void Print (friends *pb,int numcontacts){
     int i;
//    char nullStr[21] = {"\0"};  
    if (numcontacts > 0) {
        printf("\n\nPhone Book Entries:\n\n");
        for(i=0; i<numcontacts; i++){
//            if (strcmp(nullStr, (pb+i)->Fname) != 0)    {
                printf("%s %s %d %d\n\n", (pb+i)->Fname, (pb+i)->Lname, (pb+i)->Homenum,(pb+i)->Cellnum);
//            }
        } 
    }
    else {
        printf("\n\nThe phone book is currently empty.\n\n");
    }
}

int main(){
    int input;
    friends *pb = NULL;
    char buffer[100];
    int numcontacts = 0;
    int op = 0;
    while(op != 6){
         printf("Phonebook Application\n1) Add Friend\n2) Delete Friend\n3) Show a Friend\n4) Show Phonebook\n5) Search phonebook\n6) Exit\n\nWhat do you want to do?:");
         scanf("%d",&op);
         
         switch (op){
                case 1:
                     numcontacts++;                     
                     pb = (friends*) realloc(pb, numcontacts * sizeof(friends));
                     
                     printf("please enter a First name:");
                     setFname(pb,buffer,numcontacts);
                     
                     printf("please enter a Last name:");
                     setLname(pb,buffer,numcontacts);
                     
                     printf("please enter a Home phone number (max 7 digits)");
                     setHomenum(pb,numcontacts, input);
                     
                     printf("please enter a Cell number (max 7 digits)");
                     setCellnum(pb,numcontacts, input);
                     printf("Record added to the phone book\n\n");
                     break;
                case 2:    // User wants to delete an entry
                    Del (pb, &numcontacts);
                    break;

               case 3:    // User wants to print the phone book
                    printFriend(pb,numcontacts);
                    break;
               case 4: 
                    Print (pb,numcontacts);
                    break;
               case 5:
                    printFriend(pb,numcontacts);
                    break;            
               case 6:
                    printf("Goodbye");
                    break;
               default:   
                    printf("You entered an invalid selection.  Try again.\n\n\n"); 
                    break;                     
                     }
                     }
                     system("pause");
                     free(pb);
                     }

     
