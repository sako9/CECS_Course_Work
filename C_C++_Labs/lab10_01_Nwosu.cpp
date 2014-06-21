#define length 100
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h >

typedef struct f{
        char Fname[20];
        char Lname[20];
        int homenum;
        int cellnum;
        }friends;
        
void addFname (int *numcontacts,friends *contacts){
    (*numcontacts)++;
    printf("\nFirst name: ");
    scanf("%s", &contacts[*numcontacts-1].Fname);
}   // End function Add




void addLname(int *numcontacts, friends *contacts){
    printf("Last name: ");
    scanf("%s", &contacts[*numcontacts-1].Lname);
     
}

void addHnum(int *numcontacts, friends *contacts){
    printf("home number (7-digit, no dash): ");
    scanf("%d",  &contacts[*numcontacts-1].homenum); 
}

void addCnum(int *numcontacts,  friends *contacts){
    printf("cell number (7-digit, no dash): ");
    scanf("%d",  &contacts[*numcontacts-1].cellnum);
}

void Del (int numcontacts, friends *contacts)
{
    int i = 0;
    char delTempf[21];  // Temporary string for deletion of an entry - first name
    char delTempl[21];  // Temporary string for deletion of any array - last name
    char nullStr[21] = {"\0"};  // Null string for use in deleting entries
 
    printf("\nFirst name: ");
    scanf("%s", &delTempf);
    printf("Last name: ");
    scanf("%s", &delTempl);
    // compare strings, find entry or return entry not found
    for (i=0; i<numcontacts; i++){
        if (strcmp(delTempf, contacts[i].Fname) == 0 || strcmp(delTempl,contacts[i].Lname) == 0 ){
            strcpy(contacts[i].Fname, nullStr);
            strcpy(contacts[i].Lname, nullStr);
            contacts[i].homenum= 0;
            contacts[i].cellnum= 0;
            free(&contacts[i]);
            (numcontacts)--;   // Contact deleted, update the contact total counter
            
        }
        else
        {
            printf("\nEntry not found.\n\n");               
        }
    }   // End for loop
 
    printf("Record deleted from the phone book\n\n");
}   // End function Del

void printFriend (int *numcontacts, friends *contacts){
     int i;
    char searchname[21];
      
    printf("Last name: ");
    scanf("%s", &searchname);
   if (*numcontacts > 0){
        printf("\n\nPhone Book Entries:\n\n");
        for(i=0; i<*numcontacts; i++){
            if (strcmp(searchname, contacts[i].Lname) == 0)    {
                printf("%s %s %d %d\n", contacts[i].Fname, contacts[i].Lname, contacts[i].homenum,contacts[i].cellnum);
            }
            else {} 
        } 
    }
    else {
        printf("\n\nThe phone book is currently empty.\n\n");
    }
} 
 void findFriend (int *numcontacts, friends *contacts){
     int i;
    char searchname[21];
      
    printf("Last name: ");
    scanf("%s", &searchname);
   if (*numcontacts > 0){
        printf("\n\nPhone Book Entries:\n\n");
        for(i=0; i<*numcontacts; i++){
            if (strcmp(searchname, contacts[i].Lname) == 0)    {
                printf("%s %s %d %d\n", contacts[i].Fname, contacts[i].Lname, contacts[i].homenum,contacts[i].cellnum);
            }
            else {
                 printf("\n\nname not found");} 
        } 
    }
    else {
        printf("\n\nThe phone book is currently empty.\n\n");
    }
}                               

void Print (int *numcontacts, friends *contacts){
     int i;
    char nullStr[21] = {"\0"};  
    if (*numcontacts > 0) {
        printf("\n\nPhone Book Entries:\n\n");
        for(i=0; i<*numcontacts; i++){
            if (strcmp(nullStr, contacts[i].Fname) != 0)    {
                printf("%s %s %d %d\n", contacts[i].Fname, contacts[i].Lname, contacts[i].homenum,contacts[i].cellnum);
            }
            else {} 
        } 
    }
    else {
        printf("\n\nThe phone book is currently empty.\n\n");
    }
}   
 
int main(){
    friends contacts[50]; 
    friends *pcontacts;
    pcontacts = (friends*) calloc(0, sizeof(friends));
    int numcontacts = 0;
    int op = 0;
    while(op != 6){
         printf("Phonebook Application\n1) Add Friend\n2) Delete Friend\n3) Show a Friend\n4) Show Phonebook\n5) Search phonebook\n6) Exit\n\nWhat do you want to do?:");
         scanf("%d",&op);
         
         
         switch (op){
                case 1:
                     pcontacts = (friends*) realloc(pcontacts, numcontacts * sizeof(friends));
                     addFname(&numcontacts,contacts);
                     addLname(&numcontacts,contacts);
                     addHnum(&numcontacts,contacts);
                     addCnum(&numcontacts,contacts);
                     printf("Record added to the phone book\n\n");
                     break;
                case 2:    // User wants to delete an entry
                    Del (numcontacts, contacts);
                    break;
               case 3:    // User wants to print the phone book
                    printFriend(&numcontacts,  contacts);
                    break;
               case 4: 
                    Print (&numcontacts,  contacts);
                    break;
               case 5:
                    findFriend(&numcontacts,  contacts);
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
                     free(pcontacts);
                     }
                     
                     
                     
                     
                     
