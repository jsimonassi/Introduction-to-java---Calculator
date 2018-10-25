package lista1;

import java.util.Scanner;

public class ParOuImpar {
    
    
    private static boolean par(int x){
         return x % 2 == 0;
    }
    
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
     
        int tam = teclado.nextInt();
     
        int vet[] = new int[tam];
        
        for(int i = 0; i < tam; i++){
            System.out.println("\n\nDigite o "+ (i+1) +"º valor: ");
            vet[i] = teclado.nextInt();
        }
        int somaimpar = 0;
        int somapar = 0;
        for(int i = 0; i < tam; i++){
            
        
            if(par(vet[i])){
                System.out.println(vet[i] + " É par!");
                somapar += vet[i];
            }
            else{
                System.out.println(vet[i] + " É impar!");
                somaimpar += vet[i];
                }
       }
        
        System.out.println("\nSoma dos pares: " +somapar+". Soma dos ímpares: "+ somaimpar);
    
    }
}
