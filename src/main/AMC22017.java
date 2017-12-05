/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


/**
 *
 * @author usuario
 */
public class AMC22017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo datafile = new Archivo();
        System.out.println("\nCálculo del trio de puntos + cercano\n\n\n");
        System.out.println("Introduzca la ruta absoluta del archivo a analizar \n");
        datafile.ruta=datafile.leerRuta();
    }
    
}
