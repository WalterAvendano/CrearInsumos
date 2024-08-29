
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
public class ProcesarResultadosFE {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        File archivo1 = new File("C:\\Proyecto ThyPhi\\Futbol Espanol\\Archivos\\Salida\\FEResultados.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));
        FileWriter escribir = new FileWriter(archivo1, true);
        BufferedWriter bw = new BufferedWriter(escribir);
        while ((cadena = b.readLine()) != null) {
            String[] parts = cadena.split(",");
            String fecha = parts[0];
            String fecha1 = fecha.substring(3, 5);
            String fecha2 = fecha.substring(0, 2);
            String hora = fecha.substring(7,9);
            String local = parts[1];
            String goleslocal = parts[2];
            String goleslocal1 = parts[3];
            String visitante = parts[4];
            String golesvisitante = parts[5];
            String golesvisitante1 = parts[6];
            if ("01".equals(fecha1)) {
                //escribir.write("2023/" + fecha1 + "/" + fecha2 + "," + hora+ ","+ local + "," + goleslocal + "," + "," + goleslocal1 + ","+ visitante + "," + golesvisitante+ "+ \",\" + golesvisitante1 + \",\"\r\n");
                escribir.write("2023/" + fecha1 + "/" + fecha2 +  ","+ hora+ ","+ local + ","+ goleslocal + ","+ goleslocal1 + "," + visitante + "," + golesvisitante+ "," + golesvisitante1+ "\r\n");
            } else {
                if ("02".equals(fecha1)) {
                    escribir.write("2024/" + fecha1 + "/" + fecha2 +  ","+ hora+ ","+ local + ","+ goleslocal + "," + visitante + "," + golesvisitante+ "\r\n");
                    //escribir.write("2023/" + fecha1 + "/" + fecha2 + "," + hora+ ","+ local + "," + goleslocal + "," + "," + goleslocal1 + ","+ visitante + "," + golesvisitante+ "+ \",\" + golesvisitante1 + \",\"\r\n");
                    escribir.write("2024/" + fecha1 + "/" + fecha2 +  ","+ hora+ ","+ local + ","+ goleslocal + ","+ goleslocal1 + "," + visitante + "," + golesvisitante+ "," + golesvisitante1+ "\r\n");
                } else {
                    //escribir.write("2022/" + fecha1 + "/" + fecha2 + ","+ hora+ ","+ local + "," + goleslocal + "," + visitante + "," + golesvisitante+ "\r\n");
                    //escribir.write("2022/" + fecha1 + "/" + fecha2 + "," + hora+ ","+ local + "," + goleslocal + "," + "," + goleslocal1 + ","+ visitante + "," + golesvisitante+ "+ \",\" + golesvisitante1 + \",\"\r\n");
                    escribir.write("2024/" + fecha1 + "/" + fecha2 +  ","+ hora+ ","+ local + ","+ goleslocal + ","+ goleslocal1 + "," + visitante + "," + golesvisitante+ "," + golesvisitante1+ "\r\n");
                }
            }
        }
        escribir.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Proyecto ThyPhi\\Futbol Espanol\\Archivos\\Entrada\\ResultadosFE.txt");

    } 
}
