package assignment6;

import java.util.Scanner;

public class Driver {

public static void main (String [] args)
{
    String done = "DONE";

    System.out.println("Each valid document must begin with: U = Unclassified, C = Confidential, P = Proprietary.");
    System.out.println("Type DONE, in all caps to end.");

    Scanner scan = new Scanner(System.in);
    String docType = scan.next();

    while(docType.compareTo(done) != 0)
    {
        Document doc = new Document(docType);
        System.out.println(doc);
        docType = scan.next();
    }
    System.out.println("Program Fin~");
}
}
