package ClassePrincipal;

import java.util.Scanner;
import Objeto.Ocupacao;
import Objeto.Vaga;
import Objeto.Veiculo;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        Menu(scan);  
    }

    public static void Menu(Scanner scan) {
        Integer resp = 0;

        while (resp != 6) {
            mostrarMenu();  
            if (scan.hasNextInt()) {
                resp = scan.nextInt();
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número válido.");
                scan.nextLine();  
                continue; 
            }

            switch (resp) {
                case 1:
                    Vaga.criarVaga(scan);  
                    break;
                case 2:
                    Ocupacao.entrada(scan);  
                    break;
                case 3:
                    Vaga.visualizarVagas();
                    break;
                case 4:
                    Ocupacao.saida(scan); 
                    break;
                case 5:
                    Veiculo.visualizarVeiculos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scan.close();  
    }

   
    public static void mostrarMenu() {
        System.out.println("\nDigite uma opção: \n"
                + "1 - Cadastrar nova vaga \n"
                + "2 - Registrar uso de vaga \n"
                + "3 - Ver vagas \n"
                + "4 - Registrar saída \n"
                + "5 - Visualizar veículos \n"
                + "6 - Sair");
    }
}
