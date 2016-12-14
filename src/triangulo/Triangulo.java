/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author NUDES
 */
public class Triangulo{
    private int lado1, lado2, lado3;
    private String tipo = null;
     
    public boolean verTriangulo(int l1, int l2, int l3){
        
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        
        if (      lado2-lado3 < lado1 && lado1 < lado2+lado3 
                | lado1-lado3 < lado2 && lado2 < lado1+lado3 
                | lado2-lado1 < lado3 && lado3 < lado2+lado1){
            return true;
        }else{
            return false;            
        }            
    }
    
    public String verTipo(int l1, int l2, int l3){        
        
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        
        if (lado1 == lado2 | lado2 == lado3 | lado3 == lado1) {
           tipo = "isosceles";
        }
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
           tipo ="equilatero";
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2!=lado3){
           tipo = "escaleno";
        }
        return this.tipo;
    }
}
