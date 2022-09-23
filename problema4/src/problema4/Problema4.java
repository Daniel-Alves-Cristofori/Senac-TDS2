
package problema4;

//Monte um algoritmo em que o usuário poderá cadastrar e pesquisar
//hóspedes. O algoritmo deve oferecer um menu com três opções ao
//usuário: 1- cadastrar; 2- pesquisar; 3- sair. A opção “cadastrar” deve
//permitir que o usuário informe um nome de hóspede, gravando-o em
//memória (máximo de 15 cadastros; caso atinja essa quantidade, mostre
//“Máximo de cadastros atingido”). A opção “pesquisar” deve permitir que o
//usuário informe um nome e, caso seja encontrado um nome exatamente
//igual, mostre a mensagem “Hospede (nome) foi encontrado no índice
//(índice onde foi cadastrado)”. Se o nome não foi encontrado mostre
//“Hóspede não encontrado”. O algoritmo deve permitir que o usuário
//realize essas operações repetidas vezes, até que use a opção “3”, que
//encerra o algoritmo.



import java.util.Scanner;


public class Problema4 {
 
    public static void main(String[] args) {
        
        String [] hospedesC = new String[15];
        String nome;
        int opcao = 0, c = 0;
        
        Scanner entrada = new Scanner (System.in);
        
       
       while(opcao != 3) {
           
           System.out.println("Digite 1- cadastrar; 2- pesquisar; 3- sair");
           opcao = entrada.nextInt();
           
           
           if (opcao == 1) {

                 if (c < 15) {

                         System.out.println("Informe o nome do hóspede que deseja cadastrar : ");
                         hospedesC[c] = entrada.next();
                         c++;

                 }
	if (c == 15) {

                        System.out.println("Limite de hóspedes atingido\n");
					
                 }	
             }
           
           if (opcao == 2) {
               
               System.out.println("Informe o nome do hóspede que deseja pesquisar: ");
               nome = entrada.next();
               
               for (int i = 0; i < hospedesC.length; i++) {
                   
                   if (nome.equals(hospedesC[i])) {
                                                                
                         System.out.println("Hóspede " + hospedesC[i] + " foi encontrado no índice " +  i + "\n\n");
                         break;
                   
                   }
                   
                   if (i == -1) {
                      
                      System.out.println("Hóspede não encontrado\n");
                      break;	
                      
                    }
                }      
           }
       }
    }
}
  