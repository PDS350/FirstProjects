/**
 * Quis fazer um jogo da velha ._. (n sei se ta 100% certo)
 * -PDS
 */
import java.util.*;
public class Jogo_da_velha
{
    public static void main (String [] args){
        Scanner tec = new Scanner(System.in);
        byte p=1;
        byte a1=3,a2=4,a3=5,b1=6,b2=7,b3=8,c1=9,c2=10,c3=11;
        boolean win = false;
        while (true){
            System.out.println("\fTurno atual: Jogador "+p+"("+XO(p)+").\nDigite a casa no formato A1,C2,B3,etc.");
            Tabuleiro(a1,a2,a3,b1,b2,b3,c1,c2,c3);
            String casa = tec.next();
            switch (casa){
                case "A1": if(a1<3){System.out.print("A1 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}a1=p;break;
                case "A2": if(a2<3){System.out.print("A2 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}a2=p;break;
                case "A3": if(a3<3){System.out.print("A3 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}a3=p;break;
                case "B1": if(b1<3){System.out.print("B1 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}b1=p;break;
                case "B2": if(b2<3){System.out.print("B2 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}b2=p;break;
                case "B3": if(b3<3){System.out.print("B3 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}b3=p;break;
                case "C1": if(c1<3){System.out.print("C1 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}c1=p;break;
                case "C2": if(c2<3){System.out.print("C2 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}c2=p;break;
                case "C3": if(c3<3){System.out.print("C3 já foi marcado, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}break;}c3=p;break;
                default: System.out.print("Casa inválida, perdeu o turno.");try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            }
            if (a1==a2&&a2==a3||b1==b2&&b2==b3||c1==c2&&c2==c3||a1==b1&&b1==c1||a2==b2&&b2==c2||a3==b3&&b3==c3||a1==b2&&b2==c3||a3==b2&&b2==c1){System.out.println("\fParabéns Jogador "+p+"!");win=true;break;}
            if(a1<3&&a2<3&&a3<3&&b1<3&&b2<3&&b3<3&&c1<3&&c2<3&&c3<3) {System.out.println("\fDeu velha ._.");win=false;break;} 
            if (p==1){p=2;} else{p=1;}
        }
        Tabuleiro(a1,a2,a3,b1,b2,b3,c1,c2,c3);
        if (win == true){System.out.println("Parabéns Jogador "+p+"!");} else{System.out.println("Deu velha ._.");}
    }
    public static String XO(int n){
        switch (n){
            case 1: return "X";
            case 2: return "O";
            default: return " ";
        }
    }
    public static void Tabuleiro(byte a1,byte a2,byte a3,byte b1,byte b2,byte b3,byte c1,byte c2,byte c3){
        System.out.println ("  1   2   3 \nA "+XO(a1)+" | "+XO(a2)+" | "+XO(a3)+" \n -----------\nB "+XO(b1)+" | "+XO(b2)+" | "+XO(b3)+" \n -----------\nC "+XO(c1)+" | "+XO(c2)+" | "+XO(c3)+" ");
    }
}
