
package lista1;

import java.util.Scanner;

/**
 *
 * @author joao lindo
 */
public class Circulo {
    
    public static void main(String[] args) {
        
        
    Scanner teclado = new Scanner(System.in);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    System.out.println("Digite o raio do círculo:");
    
    float raio = teclado.nextFloat();
    double perimetro = 2*Math.PI*raio;
    double area = Math.PI*Math.pow(raio, 2);
    
    System.out.println(" O perímetro é : "+ perimetro + ". A area é: "+ area);
    
    
    }
    
}
