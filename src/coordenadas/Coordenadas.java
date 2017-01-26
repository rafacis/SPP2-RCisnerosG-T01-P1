/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Coordenadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X1,X2,Y1,Y2; 
        double D;
        // X1,X2,Y1,Y2 = Coordenadas, D = Distancia
        Scanner T = new Scanner (System.in);
        
        System.out.println("Escribe el punto X1");
        X1 = (int) T.nextDouble();
        System.out.println("Escribe el punto X2");
        X2 = (int) T.nextDouble();
        System.out.println("Escribe el punto Y1");
        Y1 = (int) T.nextDouble();
        System.out.println("Escribe el punto Y2");
        Y2 = (int) T.nextDouble();
        
        D = Math.sqrt(Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2));
        
        System.out.println("La distancia entre los puntos es: " + D);
        
        
    }
    
}
