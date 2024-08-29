
package Procesadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WalterIvan
 */
public class ProcesarResultadosNFL {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        File archivo1 = new File("C:\\Proyecto ThyPhi\\NFL\\Archivos\\Salida\\ResultadosNFL.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));
        FileWriter escribir = new FileWriter(archivo1, true);
        BufferedWriter bw = new BufferedWriter(escribir);
        while ((cadena = b.readLine()) != null) {
            String[] parts = cadena.split(";");
            String fecha = parts[0];
            String ano = fecha.substring(0, 4);
            String dia = fecha.substring(5, 7);
            String mes = fecha.substring(8,10);
            String hora = fecha.substring(12,17);
            String local = parts[1];
            String puntoslocal = parts[2];
            String local1 = parts[3];
            String local2 = parts[4];
            String local3 = parts[5];
            String local4 = parts[6];
            String visitante = parts[7];
            String puntosvisitante = parts[8];
            String visitante1 = parts[9];
            String visitante2 = parts[10];
            String visitante3 = parts[11];
            String visitante4 = parts[12];
            escribir.write(ano + "-" + mes +  "-"+ dia+";"+hora+";"+local+";"+puntoslocal+";"+local1+";"+local2+";"+local3+";"+local4+";"+visitante+";"+puntosvisitante+";"+visitante1+";"+visitante2+";"+visitante3+";"+visitante4  +"\r\n");
          //escribir.write(ano + "-" + mes +  "-"+ dia+";"+hora+";"+local+"\r\n");
        }
        escribir.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Proyecto ThyPhi\\NFL\\Archivos\\Entrada\\NFLResultados.txt");

    } 
}
