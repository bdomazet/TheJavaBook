package Predavanje;

import javax.swing.*;

public class ContinueDemo {
    public static void main(String[] args) {
        String text = "petar pan je pojeo pancakes";
        char[] textArray = text.toCharArray();
        int brojac = 0;
        for (int i=0; i<textArray.length; i++) {
            char element = textArray[i];
            if (element != 'p') {
                continue;
            }
            brojac++;
        }
        String poruka = String.format("Broj ponavljanja slova p je %d", brojac);
        JOptionPane.showMessageDialog(null, poruka);
    }
}
