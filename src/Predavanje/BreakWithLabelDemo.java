package Predavanje;

import javax.swing.*;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] brojevi = {
                {12, 23, 456},
                {13, 2076, 2000, 8},
                {987, 45, 234, 10}
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean postojiBroj = false;
        ADI: for (int i=0; i< brojevi.length; i++){
            int[] elementNiza = brojevi[i];
            for (int j=0; j<elementNiza.length; j++){
                int broj = brojevi [i][j];
                if ( broj == uneseniBroj){
                    postojiBroj = true;
                    break ADI;
                }
            }
        }
    }
}
