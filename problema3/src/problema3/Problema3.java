
package problema3;

//Escreva um programa Java que receba o valor padrão de uma diária. Em
//seguida, receba vários nomes de hóspedes e suas idades. Caso o
//hóspede seja menor que 4 anos, ele não paga hospedagem – nesses
//casos mostre na tela “(Nome do hóspede) possui gratuidade”; hóspedes
//com mais de 80 anos pagam metade – mostre na tela “(Nome do
//hóspede) paga meia”. O usuário informará hóspedes até digitar a palavra
//“PARE”, que interrompe a entrada de dados. Ao fim, mostre a quantidade
//de gratuidades, a quantidade de meias hospedagens e o valor total,
//considerando todos os hóspedes informados.



import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        
        int valorPadrao, valorTotal = 0, meia = 0, gratuidade = 0;
        byte idade;
        String nomeCliente = " ";
       
         Scanner entrada = new Scanner (System.in);
         
         System.out.println("R$ valor padrão da diária \n");
         valorPadrao = entrada.nextInt();
         
         
         do {            
             
             System.out.println("nome do hóspede: \n");
             nomeCliente = entrada.next();
             
             if (nomeCliente.equals("PARE")) {
                 
                 break;
                 
             }else {
                 
                 System.out.println("idade : \n");
                 idade = entrada.nextByte();
                 
                 if (idade < 4) {
                     
                     System.out.println(nomeCliente  +  " possui gratuidade");
                     gratuidade++;
                     
                 }
                  if (idade > 80) {
                     
                     System.out.println(nomeCliente  +  "  paga meia");
                     valorTotal += (valorPadrao / 2);
                     meia++;
                     
                 }
                  if (idade >= 4 && idade <= 80) {
                      
                      valorTotal += valorPadrao;
                     
                 }  
             }
         }while (!nomeCliente.equals("PARE") ); 
        
            System.out.println("Total de hospedagens: R$" + valorTotal + 
                    "\n" + gratuidade + " gratuidade(s) \n" +
                    meia + " meia(s)");
         
    }    
}
    

