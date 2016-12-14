/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author NUDES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("digite o valor do lado 1");
        int lado1 = scan.nextInt();
        System.out.println("digite o valor do lado 2");
        int lado2 = scan.nextInt();
        System.out.println("digite o valor do lado 3");
        int lado3 = scan.nextInt();
        
        Triangulo triangulo = new Triangulo();      
        
        boolean tri = triangulo.verTriangulo(lado1, lado2, lado3);
        System.out.println(tri);
        String tipo = triangulo.verTipo(lado1, lado2, lado3);
        System.out.println(tipo);        
        
    }
    
}
