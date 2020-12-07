package Predavanje;

public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica = "Trazim koliko se Adi puta nasmijao. Adi je zaista zabavan tip";
        String rijec = "Adi";
        boolean imaLiAdija = false;
        int brojac = 0;
        char[] recenicaNiz = recenica.toCharArray();
        char[] rijecNiz = rijec.toCharArray();
        LABEL: for (int i=0; i<recenicaNiz.length; i++){
            int k = i;
            for(int j=0; j<rijecNiz.length; j++){
                if (rijecNiz[j] != recenicaNiz[k]) {
                    continue LABEL;
                }else{
                    k++;
                }
            }
            imaLiAdija = true;
            brojac++;
        }
        String poruka = imaLiAdija ? "Pronadjena" : "Nije pronadjena";
        System.out.println(poruka);
        if (imaLiAdija){
            String poruka2 = String.format("Rijec '%s' se u recenici '%s' ponavlja %d puta.", rijec, recenica, brojac);
            System.out.println(poruka2);
        }
    }
}
