import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileHandler {
    public static void main(String[] args) throws IOException {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        BufferedReader br = new BufferedReader(new FileReader("src/cadastro_pessoas.csv"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println("--> " + line);
            String[] fields = line.split(",");
            pessoas.add(new Pessoa(fields[0], fields[1], fields[2]));
        }
        System.out.println(pessoas);
        br.close();

        //Escrita de arquivos
        Pessoa p2 = new Pessoa("Pedro Lopes", "121.075.839-35", "09/10/2006");
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/cadastro_pessoas.csv", true));
        bw.newLine();
        bw.write(p2.toString());
        bw.close();
    }
}