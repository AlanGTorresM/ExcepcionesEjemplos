package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void leer(String ruta) throws IOException{

        try{
            BufferedReader reader= new BufferedReader(new FileReader(ruta));
            String line="";
            while ((line= reader.readLine())!= null){
                System.out.println("Info: "+line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
    public void metodoUno(String ruta) throws IOException{
        this.metodoDos(ruta);
    }
    public void metodoDos(String ruta) throws  IOException{
        this.leer(ruta);
    }
}
