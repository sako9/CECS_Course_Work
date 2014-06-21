#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h >
#include <windows.h>
#include <unistd.h>
#include <vector>
#include <fstream>

using namespace std;

class Person{
      private:
              string Fname;
              string Lname;
              long long  Homenum;
              long long  Cellnum;
      public:
             void setFname();
             void setLname();
             void setHomenum();
             void setCellnum();
             void FsetFname(string input);
             void FsetLname(string input);
             void FsetHomenum(long long input);
             void FsetCellnum(long long input);
             string getFname();
             string getLname();
             long long getHomenum();
             long long getCellnum();
             Person()
             {
                      Fname = "";
                      Lname = "";
                      Homenum = 0;
                      Cellnum = 0; 
                      }
};

             
             
void Person::setFname(){
     cout<<"Please enter a name:";
     cin>>Fname;
}

void Person::FsetFname(string input){
     Fname = input;
}

void Person::setLname(){
     cout<<"Please enter a last name:";
     cin>>Lname;
}

void Person::FsetLname(string input){
     Lname = input;
}

void Person::FsetHomenum(long long input){
     Homenum = input;
}

void Person::FsetCellnum(long long input){
     Cellnum = input;
}

void Person::setHomenum(){
     cout<<"Please enter a Home number(10 digit number ex. 1234567890)";
     cin>>Homenum;
}

void Person::setCellnum(){
     cout<<"Please enter a Cellphone number(10 digit number ex. 1234567890)";
     cin>>Cellnum; 
}

string Person::getFname(){
       return Fname;
}

string Person::getLname(){
       return Lname;
}

long long Person::getHomenum(){
       return Homenum;
}

long long Person::getCellnum(){
       return Cellnum;
}

//void addContact(vector<Person> *contacts, int *numcontacts){
//     (*numcontacts)++;
//     (*contacts).resize(*numcontacts);
//     contacts[*numcontacts-1].setFname();
//     contacts[*numcontacts -1].setLname();
//     contacts[*numcontacts-1].setHomenum();
//     contacts[*numcontacts-1].setCellnum();     
//     cout<<"Record added to the phone book\n\n";
//     }

void makeFile( vector<Person> contacts,ofstream& fp,int numcontacts){
     string fname ="";
     string answer = "";
     int i; 
     cout<<"Do you wish to save your phonebook as a file? Yes or No:";
     cin>>answer;
     if(answer.compare("yes") == 0){
        cout<<"Please enter file name:";
        cin>>fname;
        fp.open(fname.c_str());
        for(i =0;i<numcontacts;i++){
        fp<<contacts[i].getFname(); 
        fp<<" ";
        fp<<contacts[i].getLname();
        fp<<" ";
        fp<<contacts[i].getHomenum();
        fp<<" ";
        fp<<contacts[i].getCellnum();
        fp<<"\n";
           }
        fp.close();
        cout<<"\n\nThe File has been made\n\n";
        }
}

void addFile(vector<Person>& contacts,int& numcontacts){
     string line;
     string name;
     string fname ="";
     string answer = "";
     string Fname = "";
     string Lname = "";
     long long Homenum =0;
     long long Cellnum =0;
     int i; 
     cout<<"Do you wish to save your phonebook as a file? Yes or No:";
     cin>>answer;
     if(answer.compare("yes") == 0){
        cout<<"Please enter file name:";
        cin>>fname;                        
        ifstream myfile (fname.c_str());
      if (myfile.is_open())
      {
        while ((myfile >> Fname).good())
        {
          numcontacts++;
          contacts.resize(numcontacts);
          contacts[numcontacts -1].FsetFname(Fname);
          myfile>>Lname;
          contacts[numcontacts -1].FsetLname(Lname);
          myfile>>Homenum;
          contacts[numcontacts -1].FsetHomenum(Homenum);
          myfile>>Cellnum;    
          contacts[numcontacts -1].FsetCellnum(Cellnum);
        }
        myfile.close();
        cout << "Your file has been added";
      }
    
      else cout << "Unable to open file"; 
}   
}
     
     
void Del (vector<Person> contacts,int *numcontacts ){
    int i = 0;
    int count = 0;
    string delTempf="";  // Temporary string for deletion of an entry - first name
    string delTempl="";  // Temporary string for deletion of any array - last name
 
    cout<<"\nFirst name: ";
    cin>> delTempf;
    cout<<"Last name: ";
    cin>>delTempl;
    // compare strings, find entry or return entry not found
    if(*numcontacts > 0){
    for (i=0; i<*numcontacts; i++){
        if( contacts[i].getFname().compare(delTempf) == 0 && contacts[i].getLname().compare(delTempl)==0 ){ 
//           vector<Person>::iterator it = contacts[i];                             
           contacts.erase(contacts.begin()+i);
            (*numcontacts)--;   // Contact deleted, update the contact total counter
            count++;
        }        
    }   // End for loop
 if(count != 0){
    printf("Record deleted from the phone book\n\n");
}else
        {
            printf("\nEntry not found.\n\n");               
        }
}else{
      printf("Phonebook is currently empty\n\n");
}
} 

void printFriend (vector<Person> contacts,int numcontacts ){
     int i;
     string  searchname ="";
      
    cout<<"Last name: ";
    cin>>searchname;
   if (numcontacts > 0){
        cout<<"\n\nPhone Book Entries:\n\n";
        for(i=0; i<numcontacts; i++){
            if (contacts[i].getLname().compare(searchname) == 0)    {
                cout<<contacts[i].getFname();
                cout<<contacts[i].getLname();
                cout<<contacts[i].getHomenum();
                cout<<contacts[i].getCellnum();
            }else{
                  cout<<"Name not found\n\n";
                  }
        }
    }
    else {
        cout<<"\n\nThe phone book is currently empty.\n\n";
    }
}

int printfirstFriend (vector<Person> contacts,int numcontacts ){
     int i;
     int count = 0;
     string searchname="";
      
     cout<<"Last name: ";
     cin>>searchname;
   if (numcontacts > 0){
        cout<<"\n\nPhone Book Entries:\n\n";
        for(i=0; i<numcontacts; i++){
            if (contacts[i].getLname().compare(searchname) == 0)    {
                cout<< contacts[i].getFname();
                cout<<contacts[i].getLname();
                cout<<contacts[i].getHomenum();
                cout<<contacts[i].getCellnum();
                return 0;
            }else{
                  cout<<"Name not found\n\n";
        } }
    }
    else {
        cout<<"\n\nThe phone book is currently empty.\n\n";
    }
}                                     

void Print (vector<Person> contacts,int numcontacts){
     int i;
     string nullStr ="\0";  
    if (numcontacts > 0) {
        cout<<"\n\nPhone Book Entries:\n\n";
        for(i=0; i<numcontacts; i++){
            if (contacts[i].getFname().compare(nullStr) != 0)    {
                cout<< contacts[i].getFname();
                cout<<" ";
                cout<<contacts[i].getLname();
                cout<<" ";
                cout<<contacts[i].getHomenum();
                cout<<" ";
                cout<<contacts[i].getCellnum();
                cout<<"\n\n";
            }
        } 
    }
    else {
        cout<<"\n\nThe phone book is currently empty.\n\n";
        
    }
}
  

int main(){
    vector<Person> contacts;
    int numcontacts = 0;
    int op = 0;
    ofstream myfile;
    addFile(contacts,numcontacts);
    
    Sleep(1000);     
    system("cls");
    
     while(op != 6){
         cout<<"Phonebook Application\n1) Add Friend\n2) Delete Friend\n3) Show a Friend\n4) Show Phonebook\n5) Search phonebook\n6) Exit\n\nWhat do you want to do?:";
         cin>>op;
         
         switch (op){
                case 1:
//                     addContact(&contacts, &numcontacts);
                     numcontacts++;
                     contacts.resize(numcontacts);
                     contacts[numcontacts-1].setFname();
                     contacts[numcontacts -1].setLname();
                     contacts[numcontacts-1].setHomenum();
                     contacts[numcontacts-1].setCellnum();     
                     cout<<"Record added to the phone book\n\n";
                     break;
                case 2:    // User wants to delete an entry
                    Del (contacts, &numcontacts);
                    break;

               case 3:    // User wants to print the phone book
                    printfirstFriend(contacts,numcontacts);
                    break;
               case 4: 
                    Print (contacts,numcontacts);
                    break;
               case 5:
                    printFriend(contacts,numcontacts);
                    break;            
               case 6:
                    makeFile(contacts, myfile,numcontacts);
                    cout<<"Goodbye";
                    break;
               default:   
                    printf("You entered an invalid selection.  Try again.\n\n\n");
                    break;                     
                     }
                     }
                     system("pause");
//                     free(contacts);
                     }

    
