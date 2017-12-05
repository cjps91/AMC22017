/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Archivo {
    String ruta;
    
    String leerRuta()
    {
        String rutaArchivo;
        Scanner fileRead = new Scanner(System.in);
        rutaArchivo=fileRead.nextLine();
        return rutaArchivo;
    }
    
    void leerArchivo(int matrizDatos[][]) //Para leer los datos del archivo especificado
    {
        
    }
    
    void escribirArchivo() //Para escribir los datos de solución en el archivo de solución (Si lo hubiera) 
    {
        
    }
}
