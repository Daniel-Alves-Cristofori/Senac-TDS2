
package problema2;

//Escreva um programa Java que faça a troca de quartos entre dois;
//hospedes. Receba o nome de um cliente e sua idade; ele a princípio será
//hospedado no quarto A. Depois receba o nome de outro cliente e sua
//idade; se ele for mais jovem, ficará no quarto B, mas se for velho que o
//primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará no quarto
//B. Além disso, se a pessoa mais velha for idosa (tem 60 anos ou mais)



import java.util.Scanner;

public class Problema2 {

   public static void main(String[] args) {
       
       String cliente1, cliente2, maisVelho, maisNovo;
       byte idadeCliente1, idadeCliente2, maiorIdade, menorIdade;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o nome do cliente: \n");
        cliente1 = entrada.nextLine();
        System.out.println("Informe a idade do cliente: \n");
        idadeCliente1 = entrada.nextByte();
        
        System.out.println("Informe o nome do segundo cliente: \n");
        cliente2 = entrada.next();
        System.out.println("Informe a idade do segundo cliente: \n");
        idadeCliente2 = entrada.nextByte();
        
        
        if (idadeCliente1 < idadeCliente2) {
            
            maisVelho = cliente2;
            maisNovo = cliente1;
            maiorIdade = idadeCliente2;
            menorIdade = idadeCliente1;
            
        }else {
            
            maisVelho = cliente1;
            maisNovo = cliente2;
            maiorIdade = idadeCliente1;
            menorIdade = idadeCliente2;
            
        }
        
        
         if (maiorIdade >= 60) {
            
            System.out.println("Quarto A: " + maisVelho + " com desconto de 40%" +
                    "\nQuarto B: " + maisNovo);
             
        }else {
            
            System.out.println("Quarto A: " + maisVelho +  
                    "\nQuarto B: " + maisNovo);
            
        }      
    }   
}
