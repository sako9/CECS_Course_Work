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
#include <sstream>

using namespace std;
class People{
      private:
              string Fname;
              string Lname;
      public:
             void setFname();
             void setLname();
             void FsetFname(string input);
             void FsetLname(string input);
             string getFname();
             string getLname();
};
                     

class Person:public People{
      private:
              long long  Homenum;
              long long  Cellnum;
      public:           
             void setHomenum();
             void setCellnum();
             void FsetHomenum(long long input);
             void FsetCellnum(long long input);            
             long long getHomenum();
             long long getCellnum();
};

class PersonalFriend:public Person{
      private:
              string Email;
      public:
             void setEmail();
             void FsetEmail(string input);
             string getEmail();   
};

void PersonalFriend::setEmail(){
     cout<<"please enter an Email address:";
     cin>>Email;
}

void PersonalFriend::FsetEmail(string input){
     Email = input;
}

string PersonalFriend::getEmail(){
       return Email;
}   
             
void People::setFname(){
     cout<<"Please enter a name:";
     cin>>Fname;
}

void People::FsetFname(string input){
     Fname = input;
}

void People::setLname(){
     cout<<"Please enter a last name:";
     cin>>Lname;
}

void People::FsetLname(string input){
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

string People::getFname(){
       return Fname;
}

string People::getLname(){
       return Lname;
}

long long Person::getHomenum(){
       return Homenum;
}

long long Person::getCellnum(){
       return Cellnum;
}

void addFContact(vector<Person>& contacts, int& numcontacts){
     numcontacts++;
     contacts.resize(numcontacts);
     contacts[numcontacts-1].setFname();
     contacts[numcontacts -1].setLname();
     contacts[numcontacts-1].setHomenum();
     contacts[numcontacts-1].setCellnum();     
     cout<<"Record added to the phone book\n\n";
}
     
void addPcontact(vector<PersonalFriend>& contacts, int& numcontacts){
     numcontacts++;
     contacts.resize(numcontacts);
     contacts[numcontacts-1].setFname();
     contacts[numcontacts -1].setLname();
     contacts[numcontacts-1].setHomenum();
     contacts[numcontacts-1].setCellnum();
     contacts[numcontacts-1].setEmail();     
     cout<<"Record added to the phone book\n\n";
}

void addContacts(vector<Person>& contacts, vector<PersonalFriend>& pcontacts, int& numcontacts, int& pnumcontacts){
     string answer;
     cout<<"Is this person a personal friend? yes or no:";
     cin>>answer;
     if(answer.compare("yes") == 0){
        addPcontact(pcontacts, pnumcontacts);
        }else{
              addFContact(contacts, numcontacts);
              }
}
         
void Delp (vector<Person>& contacts,int *numcontacts ){
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

void Delpf (vector<PersonalFriend>& contacts,int *numcontacts ){
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

void Del(vector<Person>& contacts, vector<PersonalFriend>& pcontacts, int *numcontacts, int *pnumcontacts){
     string answer;
     cout<<"Is this person a personal friend? yes or no:";
     cin>>answer;
     if(answer.compare("yes") == 0){
        Delpf(pcontacts, pnumcontacts);
        }else{
              Delp(contacts, numcontacts);
              }
} 

void printFriend (vector<Person> contacts,int numcontacts,vector<PersonalFriend> pcontacts, int numpcontacts ){
    int i;
    string  searchname ="";
    string answer;
    cout<<"Is this person a personal friend? yes or no:";
    cin>>answer; 
    cout<<"Last name: ";
    cin>>searchname;
    if(answer.compare("yes") != 0){
       if (numcontacts > 0){
           cout<<"\n\nPhone Book Entries:\n\n";
           for(i=0; i<numcontacts; i++){
               if (contacts[i].getLname().compare(searchname) == 0)    {
                   cout<<contacts[i].getFname();
                   cout<<" ";
                   cout<<contacts[i].getLname();
                   cout<<" ";
                   cout<<contacts[i].getHomenum();
                   cout<<" ";
                   cout<<contacts[i].getCellnum();
                   cout<<"\n\n";
                   }else{
                         cout<<"Name not found in contacts\n\n";
                        }
               }
          } 
          else{
                  cout<<"\n\nThe phone book is currently empty.\n\n";
          }
       }else{
             if(numpcontacts>0){
                cout<<"\n\nPersonal Friend Entries:\n\n";                   
                for(i=0; i<numpcontacts; i++){
                    if (pcontacts[i].getLname().compare(searchname) == 0)    {
                        cout<<pcontacts[i].getFname();
                        cout<<" ";
                        cout<<pcontacts[i].getLname();
                        cout<<" ";
                        cout<<pcontacts[i].getHomenum();
                        cout<<" ";
                        cout<<pcontacts[i].getCellnum();
                        cout<<" ";
                        cout<<pcontacts[i].getEmail();
                        cout<<"\n\n";
                    }else{
                          cout<<"Name not found in personal contacts\n\n";
                          }
                }
            }
            else {
                cout<<"\n\nThe phone book is currently empty.\n\n";
            }
}
}

int printfirstFriend (vector<Person> contacts,int numcontacts,vector<PersonalFriend> pcontacts, int numpcontacts){
     int i;
     int count = 0;
     string searchname="";
     string answer;
     cout<<"Is this a personal friend?yes or no:?"; 
     cin>>answer;
     cout<<"Last name: ";
     cin>>searchname;
     if(answer.compare("yes")!=0){
       if (numcontacts > 0){
            cout<<"\n\nPhone Book Entries:\n\n";
            for(i=0; i<numcontacts; i++){
                if (contacts[i].getLname().compare(searchname) == 0)    {
                    cout<< contacts[i].getFname();
                    cout<<" ";
                    cout<<contacts[i].getLname();
                    cout<<" ";
                    cout<<contacts[i].getHomenum();
                    cout<<" ";
                    cout<<contacts[i].getCellnum();
                    cout<<"\n\n";
                    return 0;
                }else{
                      cout<<"Name not found\n\n";
            }
            }
        }
        else {
            cout<<"\n\nThe phone book is currently empty.\n\n";
        }
        }else{
              if(numpcontacts > 0){
            cout<<"\n\nPhone Book Entries:\n\n";
            for(i=0; i<numpcontacts; i++){
                if (pcontacts[i].getLname().compare(searchname) == 0)    {
                    cout<<pcontacts[i].getFname();
                    cout<<" ";
                    cout<<pcontacts[i].getLname();
                    cout<<" ";
                    cout<<pcontacts[i].getHomenum();
                    cout<<" ";
                    cout<<pcontacts[i].getCellnum();
                    cout<<" ";
                    cout<<pcontacts[i].getEmail();
                    cout<<"\n\n";
                    return 0;
                }else{
                      cout<<"Name not found\n\n";
            }
            }
        }
        else {
            cout<<"\n\nThe phone book is currently empty.\n\n";
        }
        }
}                                     

void Print (vector<Person> contacts,int numcontacts,vector<PersonalFriend> pcontacts, int numpcontacts){
     int i;
     string nullStr ="\0";  
    if (numcontacts > 0 || numpcontacts>0) {
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
        for(i=0; i<numpcontacts; i++){
            if (pcontacts[i].getFname().compare(nullStr) != 0)    {
                cout<<pcontacts[i].getFname();
                cout<<" ";
                cout<<pcontacts[i].getLname();
                cout<<" ";
                cout<<pcontacts[i].getHomenum();
                cout<<" ";
                cout<<pcontacts[i].getCellnum();
                cout<<" ";
                cout<<pcontacts[i].getEmail();
                cout<<"\n\n"; 
               }
            }
            }    
    else {
        cout<<"\n\nThe phone book is currently empty.\n\n";
        }
    }



void makeFile( vector<Person> contacts,vector<PersonalFriend> pcontacts,ofstream& fp,int numcontacts,int numpcontacts){
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
        fp<<"\n";
        for(i =0;i<numpcontacts;i++){
        fp<<pcontacts[i].getFname(); 
        fp<<" ";
        fp<<pcontacts[i].getLname();
        fp<<" ";
        fp<<pcontacts[i].getHomenum();
        fp<<" ";
        fp<<pcontacts[i].getCellnum();
        fp<<" ";
        fp<<pcontacts[i].getEmail();
        fp<<"\n";
        }           
        fp.close();
        cout<<"\n\nThe File has been made\n\n";
        }
}

int addFile(vector<Person>& contacts,int& numcontacts,vector<PersonalFriend>& pcontacts, int& numpcontacts){
     string line ="";
     string name = "";
     string fname ="";
     string answer = "";
     string Fname = "";
     string Lname = "";
     string Email = "";
     long long Homenum =0;
     long long Cellnum =0;
     int i; 
     cout<<"Do you wish to load your phonebook from a file? Yes or No:";
     cin>>answer;
     if(answer.compare("yes") == 0){
        cout<<"Please enter file name:";
        cin>>fname;                        
        ifstream myfile (fname.c_str());
      if (myfile.is_open())
      {
        while (getline(myfile, line))
        {
        if (line.empty()){
          while (getline(myfile, line)){                                      
          istringstream tmp(line);                    
          numpcontacts++;
          
          pcontacts.resize(numpcontacts);
          tmp>>Fname;
          pcontacts[numpcontacts -1].FsetFname(Fname);
          tmp>>Lname;
          pcontacts[numpcontacts -1].FsetLname(Lname);
          tmp>>Homenum;
          pcontacts[numpcontacts -1].FsetHomenum(Homenum);
          tmp>>Cellnum;    
          pcontacts[numpcontacts -1].FsetCellnum(Cellnum); 
          tmp>>Email;
          pcontacts[numpcontacts -1].FsetEmail(Email);                           
          } myfile.close();
          cout << "Your file has been added";
          return 0;
          }
          istringstream tmp(line);
          numcontacts++;
          contacts.resize(numcontacts);
          tmp>>Fname;
          contacts[numcontacts -1].FsetFname(Fname);
          tmp>>Lname;
          contacts[numcontacts -1].FsetLname(Lname);
          tmp>>Homenum;
          contacts[numcontacts -1].FsetHomenum(Homenum);
          tmp>>Cellnum;    
          contacts[numcontacts -1].FsetCellnum(Cellnum);
        }
        myfile.close();
        cout << "Your file has been added";
      }
    
      else cout << "Unable to open file"; 
}   
}  

int main(){
    vector<Person> contacts;
    vector<PersonalFriend> pcontacts;
    int numcontacts = 0;
    int numpcontacts = 0;
    int op = 0;
    ofstream myfile;
    addFile(contacts,numcontacts,pcontacts,numpcontacts);
    
    Sleep(1000);     
    system("cls");
    
     while(op != 6){
         cout<<"Phonebook Application\n1) Add Friend\n2) Delete Friend\n3) Show a Friend\n4) Show Phonebook\n5) Search phonebook\n6) Exit\n\nWhat do you want to do?:";
         cin>>op;
         
         switch (op){
                case 1:
                     addContacts(contacts,pcontacts,numcontacts,numpcontacts);
                     break;
                case 2:    // User wants to delete an entry
                    Del (contacts,pcontacts,&numcontacts,&numpcontacts);
                    break;

               case 3:    // User wants to print the phone book
                    printfirstFriend(contacts,numcontacts,pcontacts,numpcontacts);
                    break;
               case 4: 
                    Print (contacts,numcontacts,pcontacts,numpcontacts);
                    break;
               case 5:
                    printFriend(contacts,numcontacts,pcontacts,numpcontacts);
                    break;            
               case 6:
                    makeFile(contacts,pcontacts, myfile,numcontacts,numpcontacts);
                    cout<<"Goodbye";
                    break;
               default:   
                    printf("You entered an invalid selection.  Try again.\n\n\n");
                    break;                     
                     }
                     }
                     system("pause");
                     }

    
