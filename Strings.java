
package lista1;

import java.util.Scanner;

public class Strings {
    
    public static boolean palindromo (int inicio, int fim, String palavra){
        if(inicio == fim)
            return true;
        if (palavra.charAt(inicio) == palavra.charAt(fim))
            return palindromo(inicio+1,fim-1,palavra);
        
        return false;
    }
    
    public static boolean evogal(char a){
        return a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite alguma coisa: ");
        String texto = teclado.nextLine().toUpperCase().trim();
        System.out.println(texto);
        
        System.out.println("Tamanho da String "+ texto.length());
        
        int num_vogal = 0;

        for(int i = 0; i < texto.length(); i++){
            if(evogal(texto.charAt(i)))
                num_vogal++;
                }
        
        System.out.println("Numero de vogais: "+ num_vogal);

        if(texto.length() > 3){
            if((texto.substring(0, 3)).equalsIgnoreCase("UNI"))
                System.out.println("É igual a UNI");

            if((texto.substring((texto.length()-3), texto.length())).equalsIgnoreCase("RIO"))
                System.out.println("É igual a RIO");
        }

        if(palindromo(0, texto.length()-1, texto))
            System.out.println("É palindromo");
        else
            System.out.println("Não é palindromo");
        
            
        } 
    }

