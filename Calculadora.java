package lista1;

import java.util.Scanner;

public class Calculadora {
    
    public static void potencia(Scanner teclado){
        
        System.out.println("\n\nDigita a base: ");
        double base = teclado.nextDouble();
        
        System.out.println("\nElevado a quanto?: ");
        double expoente = teclado.nextDouble();
        
        System.out.println("\n Aí está: " + Math.pow(base, expoente));
    }
    
    
    public static void log(Scanner teclado){
        
        System.out.println("\n\nDigite um numero para calcular o log neperiano: ");
        double crianca = teclado.nextDouble();
        
        System.out.println("\n Aí está: "+ Math.log(crianca));
    }
    
    public static void raiz(Scanner teclado){
        
        System.out.println("\n\n Qual o indice da raiz?");
        double indice = teclado.nextInt();
        
        System.out.println("\nRaiz de qual número?");
        double num = teclado.nextDouble();
        
        if (num < 0){
            if ((indice % 2) != 0){
                System.out.println("Aí está: "+ Math.pow(num,(1/indice)));
            }
            else
                System.out.println("\n\nNão tá no domínio, manow!!!");
         }
        else
            System.out.println("Aí está: "+ Math.pow(num,(1/indice)));
    }
        
    
    public static void divisao(Scanner teclado ){
        
  
        System.out.println("\nDigite um número: ");
        double a = teclado.nextDouble();
        
        System.out.println("\nDigite outro número: ");
        double b = teclado.nextDouble();
        
        if(b != 0)
            System.out.println("\n\nResultado: " + (a/b));
        else
            System.out.println("\n\nNÃO EXISTE DIVISÃO POR ZERO!!!");
    }
    
    public static void multiplica(Scanner teclado ){
        
  
        System.out.println("\nDigite um número: ");
        double a = teclado.nextDouble();
        
        System.out.println("\nDigite outro número: ");
        double b = teclado.nextDouble();
        
        System.out.println("\n\nResultado: " + (a*b));
    }
    
    public static void subtracao(Scanner teclado ){
        
  
        System.out.println("\nDigite um número: ");
        double a = teclado.nextDouble();
        
        System.out.println("\nDigite outro número: ");
        double b = teclado.nextDouble();
        
        System.out.println("\n\nResultado: " + (a-b));
        
        
    }
     
    public static void soma(Scanner teclado ){
        
  
        System.out.println("\nDigite um número: ");
        double a = teclado.nextDouble();
        
        System.out.println("\nDigite outro número: ");
        double b = teclado.nextDouble();
        
        System.out.println("\n\nResultado: " + (a+b));
        
        
    }
    
    public static String menu(Scanner teclado){
        
        System.out.println("--------------------------\n");
        System.out.println("Somar ---------- [1]\n");
        System.out.println("Subtrair ------- [2]\n");
        System.out.println("Multiplicar ---- [3]\n");
        System.out.println("Dividir -------- [4]\n");
        System.out.println("Raiz ----------- [5]\n");
        System.out.println("Log ------------ [6]\n");
        System.out.println("Potência ------- [7]\n\n");
        
        System.out.println("Digite um número: ");
       
        return teclado.next();
    }
    
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        while(true){
            
            String opcao = menu(teclado);
            System.out.println("\n----------------------\n");
            switch(opcao){
                case "1":
                    soma(teclado);
                    break;
                case "2":
                    subtracao(teclado);
                    break;
                case "3":
                    multiplica(teclado);
                    break;
                case "4":
                    divisao(teclado);
                    break;
                case "5":
                    raiz(teclado);
                    break;
                case "6":
                    log(teclado);
                    break;
                case "7":
                    potencia(teclado);
                    break;
                default:
                    System.out.println("Digitou algo errado, vai de novo! \n");
            
            }
            
            
        }
        
        
    }
}
