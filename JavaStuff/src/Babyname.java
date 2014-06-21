
import java.util.*;
import java.io.*;
import java.awt.*;
public class Babyname{
    public static int decades = 9;
    public static int horizwidth = 70;
    public static int startingYear = 1900;

    public static void main(String[] args)
    throws FileNotFoundException{
        introduction();
        Scanner console = new Scanner(System.in);

        System.out.print("name?");
        String n = console.next();
        String N = Capitalize(n);

        Scanner input = new Scanner( new File("names2.txt"));
        DrawPanel(FindName(N , input),N ,input);

    }

    public static void introduction(){
        System.out.println("This program allows you to search through the");
        System.out.println("data from the Social Security Administration");
        System.out.println("to see how popular a particular name has been");
        System.out.println("since" + startingYear);
        System.out.println("");
    }

    public static Boolean FindName(String N, Scanner input){
        while(input.hasNext()){
            String Name = input.next();
            if(Name.equals(N)){
                return true;
            }
        }return false;
    }

    public static void DrawPanel(boolean T ,String N, Scanner input){
        if(T == false){
            System.out.print("name not found");
        }else{ 

            DrawingPanel BN = new DrawingPanel ((horizwidth *decades),1000);
            Graphics g = BN.getGraphics();

            g.drawLine(0, 25,(horizwidth *decades),25);
            g.drawLine(0,975,(horizwidth *decades),975);

            for (int i = 1; i <= decades; i++){
                g.drawLine((-horizwidth+ (i*horizwidth)),0,(-horizwidth +(i* horizwidth)),1000);
                g.drawString(""+(startingYear +(i*10 - 10)),(-horizwidth +(i* horizwidth)),1000);        
            }
            if(input.hasNextInt()){
                int yCord2 = input.nextInt();
                int yCord  = 975;
                g.setColor(Color.red);
                for(int i=1; i<= decades; i++){
                    if(yCord2 == 0){             
                        g.drawLine((-horizwidth * 2 + (i*horizwidth)),yCord,(-70 +(i* horizwidth)),975);
                        g.drawString(N +" " + yCord2,(-horizwidth +(i* horizwidth)),975);
                        yCord = 975;
                        if(input.hasNextInt()){
                            yCord2 = input.nextInt();
                        }
                    }else {
                        g.drawLine((-horizwidth * 2+ (i*horizwidth)),yCord,(-horizwidth +(i* horizwidth)),(975-yCord2) );
                        g.drawString(N + " " + yCord2,(-horizwidth +(i* horizwidth)),(975-yCord2));
                        yCord = (975-yCord2) ;
                        if(input.hasNextInt()){
                            yCord2 = input.nextInt();
                        }

                    }
                }

            }
        }
    }

    public static String Capitalize(String s) {        
        String firstLetter = s.substring(0,1);  
        String remainder   = s.substring(1);    
        String capitalized = firstLetter.toUpperCase() + remainder.toLowerCase();
        return capitalized;
    }
}

            
