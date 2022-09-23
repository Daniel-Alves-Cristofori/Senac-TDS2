
package problema5;

//Monte um programa Java que mostre na tela em formato de tabela os
//quartos ocupados e os desocupados. Considere que o hotel tem 4
//andares e 3 quartos por andar. Primeiro o usuário registrará os quartos
//ocupados, informando para cada ocupação o número do apartamento
//(andar de 1 a 4 e número de quarto, de 1 a 3). O programa deverá
//questionar “Deseja informar outra ocupação? (S/N)” e o usuário poderá
//informar quantos quartos quiser, até que responda “N” a essa pergunta.
//Em seguida o programa mostrará uma tabela, em que o primeiro andar é
//o inferior e o último o superior, marcando com X o quarto ocupado.



import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        
        String andarQuartos[][] = new String[4][3], ocupado = "ocupado", parar = "N";
        
        int andar, quarto;
        
        Scanner entrada = new Scanner (System.in);
        
        
        for (int I = 0; I <= 3; I++) {  
             
             for (int J = 0; J <= 2; J++) {
                 
                 andarQuartos[I][J] = "desocupado";
                 
             }
        }
        
      
        do{
            
        System.out.println("Informe Andar e Quarto\n" +
                "andar: " );
        andar = entrada.nextInt();
        
        System.out.println("quarto: ");
        quarto = entrada.nextInt();
        
        
         for (int I = 0; I <= 3; I++) {
             
             for (int J = 0; J <= 2; J++) {
                
                 andarQuartos[andar - 1][quarto - 1] = ocupado;
            
             }
         }
         
        System.out.println("Deseja informar outra ocupação? (S/N)");
        parar = entrada.next();
         
        }while(parar.equals("S"));
        

           for (int I = 0; I <= 3; I++) {
             
               System.out.println((I + 1) + " º andar:");
               
             for (int J = 0; J <= 2; J++) {
                
                 System.out.println("- quarto " + (J + 1) + " " +  andarQuartos[I][J] + "\n");
                 
             }
         }
    }  
}
