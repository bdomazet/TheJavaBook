package Predavanje;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] brojevi = {23, 12, 234, 456, 678, 12, 200, 111};
        String uneseniBrojTekst = JOptionPane.showInputDialog("Unesi zeljeni text");
        int uneseniBroj = Integer.parseInt(uneseniBrojTekst);
        boolean postojiBroj = false;
        //for (int i = 0; i < brojevi.length; i++){
        for (int broj : brojevi){
            if (broj == uneseniBroj){
                postojiBroj = true;
                break;
                 }
            }
        String poruke = postojiBroj ? "Sretan" : "Nesretan";
        JOptionPane.showMessageDialog(null, poruke);
    }
}
