
public class Rocket {
    public static final int Rcon = 2;
    public static void drawtriangle (){
        for (int line = 1;line <=Rcon+(Rcon-1) ; line ++) {
            for (int i= 1; i <=(-1 * line +6 )+(2*(Rcon-3)); i++){
                System.out.print(" ");
            }
            for (int j = 1; j <= line; j++){
                System.out.print("/");
            }    
            System.out.print("**");
            
        for (int k = 1; k <= line; k++){
            System.out.print("\\");
        }
        System.out.println("");
    }
}
    public static void line () {
        System.out.print("+");
        for(int i = 1; i <= Rcon+Rcon; i++){
            System.out.print("=*");
        }
        System.out.print("+");       
}
    public static void topsquare(){
        for(int line = 1; line <= Rcon; line++) {
            System.out.print("|");
            for(int i = 1; i <= Rcon - line; i++){
                System.out.print(".");
            }
            for(int j = 1; j <= line; j++){
                System.out.print("/\\");
            }
            
            for(int k=1; k <= -1 * ((line - 5) + (line - 1))+(2*(Rcon-3)); k++){
                    System.out.print(".");
            }
                 for(int j = 1; j <= line; j++){
                System.out.print("/\\");
            }
                for(int i = 1; i <= Rcon - line; i++){
                System.out.print(".");
            }
                
            System.out.println("|");
            
        }
    }
    public static void bottomsquare() {
        for(int line = 1; line <= Rcon; line++) {
            System.out.print("|");
            for(int i = 1; i <= line - 1; i++){
                System.out.print(".");
            }
            for(int j = 1; j <= (Rcon+1) - line; j++){
                System.out.print("\\/");
            }
            for(int k=1; k <= 2*line - 2; k++) {
                System.out.print(".");
            }
            for(int j = 1; j <= (Rcon+1) - line; j++){
                System.out.print("\\/");
            }
            for(int i = 1; i <= line - 1; i++){
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
    public static void main(String[] args) {
        drawtriangle();
        line();
        System.out.println("");
        topsquare();
        bottomsquare();
        line();
        System.out.println("");
        bottomsquare();
        topsquare();
        line();
        System.out.println("");
        drawtriangle();
    }
}
   
