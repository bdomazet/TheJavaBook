package AdvancedJavaProject.one;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicalArrayWriter {
    private ArrayList<Integer> lista = new ArrayList<>();

    public DynamicalArrayWriter() {
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

    }


    //try catch finally
    //fileWriter -> IOExeption
    //printWriter
    public void writeListIntoFile(){
        PrintWriter out = null;
        try {
            FileWriter writer = new FileWriter("output.txt");
            out = new PrintWriter(writer);
            for (int i = 0; i < lista.size(); i++) {
                out.println("Value at: " + i + " is: " + lista.get(i));
            }
            out.close();
        }catch (IOException exception){
            System.err.println("IO se desio: " + exception.getMessage());

        }finally {
            if(out!=null){
                out.close();
            }

        }
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    //try with resource
    public void readFile(){
        try (FileReader fileReader = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fileReader);){
            String line = null;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Nisi dobro unio podatke");
        }catch (Exception e){
            System.err.println(e.getMessage());

        }
    }
}
