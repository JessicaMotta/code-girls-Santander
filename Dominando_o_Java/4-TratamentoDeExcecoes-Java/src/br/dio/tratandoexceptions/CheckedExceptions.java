package br.dio.tratandoexceptions;

import javax.swing.*;
import java.io.*;

//imprimir um arquivo no console.
public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeDoArquivo = "romance-bleke-crouch.txt";
        try {
            ImprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir "+e.getCause());
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte "+e.getCause());
        }finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar sa exception ou não, o programa continua...");
    }

    public static void ImprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();

        }while(line != null);
        bw.flush();
        br.close();
    }

}
