/**
 * Quis fazer um jogo da velha ._. 
 * -PDS
 */
import java.util.*;
public class TicTacToe
{
    public static void main (String [] args){
        Scanner tec = new Scanner(System.in);
        byte p=1;
        byte a1=3,a2=4,a3=5,b1=6,b2=7,b3=8,c1=9,c2=10,c3=11;//each space is a different value
        boolean win = true;//used to check for an early draw and for a better-looking end screen 
        while (true){
            System.out.println("\fCurrent turn: "+XO(p)+"\nType a letter and a number (A1,C2,B3,etc.)");
            Grid(a1,a2,a3,b1,b2,b3,c1,c2,c3);
            System.out.println("Type 'end' to stop the game early.");
            String spc = tec.next();
            switch (spc){
                case "A1","a1","1A","1a": if(a1<3){p=BadSpace(spc,true,p); break;}a1=p;break;
                case "A2","a2","2A","2a": if(a2<3){p=BadSpace(spc,true,p); break;}a2=p;break;
                case "A3","a3","3A","3a": if(a3<3){p=BadSpace(spc,true,p); break;}a3=p;break;
                case "B1","b1","1B","1b": if(b1<3){p=BadSpace(spc,true,p); break;}b1=p;break;
                case "B2","b2","2B","2b": if(b2<3){p=BadSpace(spc,true,p); break;}b2=p;break;
                case "B3","b3","3B","3b": if(b3<3){p=BadSpace(spc,true,p); break;}b3=p;break;
                case "C1","c1","1C","1c": if(c1<3){p=BadSpace(spc,true,p); break;}c1=p;break;
                case "C2","c2","2C","2c": if(c2<3){p=BadSpace(spc,true,p); break;}c2=p;break;
                case "C3","c3","3C","3c": if(c3<3){p=BadSpace(spc,true,p); break;}c3=p;break;
                case "end","END": win=false;break;
                default: p=BadSpace("",false,p);
            }
            if (a1==a2&&a2==a3||b1==b2&&b2==b3||c1==c2&&c2==c3||a1==b1&&b1==c1||a2==b2&&b2==c2||a3==b3&&b3==c3||a1==b2&&b2==c3||a3==b2&&b2==c1){System.out.println("\f   "+XO(p)+" wins!");win=true;break;} //win condition
            if(a1<3&&a2<3&&a3<3&&b1<3&&b2<3&&b3<3&&c1<3&&c2<3&&c3<3||win==false) {System.out.println("\f  Draw ._.");win=false;break;} //checks if the game ended
            if (p==1){p=2;} else{p=1;}//swaps the player
        }
        Grid(a1,a2,a3,b1,b2,b3,c1,c2,c3);
        if (win == true){System.out.println("   "+XO(p)+" wins!");} else{System.out.println("  Draw ._.");}
    }
    public static String XO(int n){//turns the player's value into their symbol
        switch (n){
            case 1: return "X";
            case 2: return "O";
            default: return " ";
        }
    }
    public static void Grid(byte a1,byte a2,byte a3,byte b1,byte b2,byte b3,byte c1,byte c2,byte c3){//Visually displays the grid
        System.out.println ("  1   2   3 \nA "+XO(a1)+" | "+XO(a2)+" | "+XO(a3)+" \n -----------\nB "+XO(b1)+" | "+XO(b2)+" | "+XO(b3)+" \n -----------\nC "+XO(c1)+" | "+XO(c2)+" | "+XO(c3)+" ");
    }
    public static byte BadSpace(String s, boolean valid, byte p){//punishes wrong inputs
        if(valid){System.out.print(s+" was already chosen.");} else{System.out.print("Invalid space.");}
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}//delays screen wipe
        if (p==1){return 2;} else{return 1;}
    }
}
