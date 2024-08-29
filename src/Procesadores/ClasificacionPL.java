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
public class ClasificacionPL {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        String valor = "a";
        int cont = 0;
        String puntos;
        String posicion = null;
        String equipo = null;
        //File archivo1 = new File("C:\\Proyecto ThyPhi\\Futbol Italiano\\Archivos\\FIEncuentros.txt");
        File archivo1 = new File("C:\\Proyecto ThyPhi\\Premier League\\Archivos\\Salida\\ClasificacionPL.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));
        FileWriter escribir = new FileWriter(archivo1, true);
        BufferedWriter bw = new BufferedWriter(escribir);
        while ((cadena = b.readLine()) != null) {
            cont = cont + 1;
            String[] parts = cadena.split(" ");
            String lectura = parts[0].trim().replace(".","");
        if (cont > 0 && cont < 17) {
                System.out.println(cadena);
                switch (cont) {
                    case 1:
                        posicion = (cadena).trim().replace(".", "");
                        System.out.println(posicion);
                        break;
                    case 2:
                        equipo = (cadena).trim().replace("Ã©", "e");
                        System.out.println(equipo);
                   //     escribir.write(posicion + "," + equipo + "," + "a" + "\r\n");
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        puntos = (cadena).trim();
                        System.out.println(puntos);
                        escribir.write(posicion + "," + equipo + "," + puntos + "," + "a" +"\r\n");
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        cont = 0;
                        break; 
                }

            }
            
         System.out.println(lectura);
            
            
         
        }
       
        escribir.close();
    }

    public static void main(String[] args) throws IOException {
        
        muestraContenido("C:\\Proyecto ThyPhi\\Premier League\\Archivos\\Datos\\ClasificacionPL.txt");
        
    }       
}
