package lista1;

import javax.swing.JOptionPane;

public class ListarNomes {

    public static void main(String[] args) {
        
       int tam =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos: "));
       int vet [] = new int [tam];
       String nome [] = new String [tam];
       
       for(int i = 0; i < tam; i++){
           nome [i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i+1) + "º aluno");
           vet[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do "+ nome[i]));
       }
       
       for(int i = 0; i < tam; i++){
           JOptionPane.showMessageDialog(null, "Aluno: "+ nome[i] + "   Nota: " + vet[i]+ "\n");
       }
       
       
        
        
       

    }
}
