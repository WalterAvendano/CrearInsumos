/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class NFLJornada {
    
    public static String fecha;
    public static String local;
    public static String visitante;

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {

        // Declaramos la variable cadena como un String pues en ella se almacenara la direccion 
        String cadena;
        String basura;
        int cont = 0;
        int cont1 = 0;

        // Declaramos la variable "archivo1" tipo "File" e indicamos su dirección y nombre
        File archivo1 = new File("C:\\Proyecto ThyPhi\\NFL\\Archivos\\Entrada\\NFLJornada.txt");

        // Se crea la variable "b" tipo "BufferedReader" para guardar el contenido de la variable "archivo" y se indica
        // el tipo de registro ""ISO-8859-1"
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "ISO-8859-1"));

        // Declaramos la variable "escribir" para indicar el archivo a crear o escribir.
        // En este caso si el archivo existe escribira sobre el. Sino lo crea y escribe
        FileWriter escribir = new FileWriter(archivo1, true);

        // Declaramo la variable "bw" tipo BufferedWriter" para guardar el contenido de la variable "escribir"
        BufferedWriter bw = new BufferedWriter(escribir);

        // Declaramos algunas variables a utilizar en el proceso
        // El ciclo while se utiliza para leer cada linea del archivo de entrada la cual se almacena en la 
        // variable cadena. Para indicar cada columna se utiliza el comando "split" y con el  valor "," se
        // indica que cada columna esta separada por una comma
        while ((cadena = b.readLine()) != null) {
            //cont = cont + 1;
            cont1 = cont1 + 1;
            int caracter = cadena.indexOf(":");
            if (caracter > 1) {
                System.out.println(cadena + "cadena");
                cont1 = 0;
                fecha = (cadena);
                cont = cont + 1;
                System.out.println(fecha + "fecha");
            }

            if (cont1 > 0 && cont1 < 4) {
                System.out.println(cadena);
                
                switch (cont1) {
                    case 1:
                        local = (cadena);
                        System.out.println(local);
                        break;
                    case 2:
                        visitante = (cadena);
                        System.out.println(visitante);
                        escribir.write(fecha + ","+ cont+"," + local + "," + visitante + "," + "a" + "\r\n");
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }

            }

            //escribir.write("2019/" + variable1 + "/" + variable + ","+ cont+","+ visitante + "," +variable3 + ","+ homeclub +","+variable2 +"\r\n");
            //System.out.println("2018/" + variable1 + "/" + variable + ","+ cont+","+ visitante + "," +variable3 + ","+ homeclub +","+variable2 +"\r\n");
        }
        b.close();
        escribir.close();
    }

    // En el main se carga el parametro que tendra como entrada el metodo "muestraContenido" 
    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Proyecto ThyPhi\\NFL\\Archivos\\Datos\\Jornada_NFL.txt");
    }
}
