package assignment6;

public class Document {

private String dType = "U";


public Document (String docType)
{
    try
    {
        if (docType.compareToIgnoreCase("U") != 0
            && docType.compareToIgnoreCase("C") != 0
            && docType.compareToIgnoreCase("P") != 0)

            throw new InvalidDocumentCodeException();
            dType = docType;
    }
    catch(InvalidDocumentCodeException error)
    {
        System.out.println("Error caught and handled! Contine processing with valid document beginning.");
        System.out.println(error.getMessage());
    }

}
public void setdocType (String docType)
{
    dType = docType;
}

public String toString()
{
    return "Document type:" + dType.toUpperCase();
}
}