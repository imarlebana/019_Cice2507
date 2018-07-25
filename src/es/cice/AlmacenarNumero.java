package es.cice;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import es.cice.Excepciones.FicheroNoRecuperado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlmacenarNumero {

    private File file;
    private FileWriter fw;
    private FileReader fr;
    private BufferedReader br;

    public AlmacenarNumero() {
        preprarRecursos();
    }

    public boolean guardarNumero(int num){

        boolean add = false;
        try{
            fw = new FileWriter(file,true);
            fw.append("" + num);
            fw.append("\n");
            fw.flush();
            fw.close();

            add = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return add;

    }

    public List<Integer> recuperarNumero(){
        List<Integer> numeros = new ArrayList<>();
        br = new BufferedReader(fr);

        try{

            String line = br.readLine();

            while (line != null) {
                int num = Integer.parseInt(line.trim());
                numeros.add(num);
                line = br.readLine();
            }
            //br.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        return numeros;
    }

    private void preprarRecursos() {
        this.file = new File("src/Text.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            //this.fw = new FileWriter(this.file,true);
            this.fr = new FileReader(this.file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(){

        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
