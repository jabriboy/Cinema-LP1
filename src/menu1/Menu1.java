package menu1;

import java.util.Scanner;

public class Menu1 {
    public static void menup(){
        System.out.println("Executando 'menu principal': ");
        System.out.println("Bem-vindo ao simulador do CinemaXYZ");
        System.out.println("-->[1]Alterar/Criar filme");
        System.out.println("-->[2]Alterar/Criar sala");
        System.out.println("-->[3]Simular 'criacao' de sessoes em salas");
        System.out.println("-->[4]Simular 'criacao' de conta");
        System.out.println("-->[5]Simular compra de ingresso");
        System.out.println("-->[0]Fechar aplicativo");
        System.out.println("-------------------------------------------");   
    }
    public static void menu1(){
        System.out.println("Executando 'alterar/criar filme': ");
        System.out.println("-->[1]Alterar titulo original");
        System.out.println("-->[2]Alterar tamanho (em minutos)");
        System.out.println("-->[3]Adicionar/Alterar titulo traduzido");
        System.out.println("-->[4]Alterar sinopse");
        System.out.println("-->[5]Alterar nacionalidade");
        System.out.println("-->[6]Alterar genero");
        System.out.println("-->[7]Adicionar um novo filme em cartaz");
        System.out.println("-->[8]Voltar");
        System.out.println("-------------------------------------------");
    }
    public static void menu2(){
        System.out.println("Executando 'alterar/criar sala': ");
        System.out.println("-->[1]Alterar lotacao");
        System.out.println("-->[2]Alterar sessao");
        System.out.println("-->[3]Adicionar uma nova sala ao cinema");
        System.out.println("-->[4]Voltar");
        System.out.println("-------------------------------------------");
    }
    public static void simular1(){
        System.out.println("Executando 'simular sessao': ");
        System.out.println("Qual o ID do filme que sera apresentado?");
        //checar se o filme existe em cartaz e, aproveitando o acesso em filme, saber seu tamanho para comparar com o tamanho da sessao, caso contrário, abortar.     
        System.out.println("Qual o periodo da sessao?");
        //Ex.: 12:30 até 15:00; checar se o tamanho do filme nao 'encaixa' no tamanho da sessao, caso sontrário, abortar
        System.out.println("Qual o ID da sala que ocorrera essa sessao?");
        //checar se o periodo da sessao esta livre na sala em especifico, caso contrário, abortar.
        //se tudo der certo, salvar a sessao no ID da sala em específico.
        System.out.println("-------------------------------------------");   
    }
    public static void simular2(){
        System.out.println("Executando 'simular conta': ");
        System.out.println("Qual o seu nome completo? ");
        System.out.println("Informe seu CPF(apenas numeros): ");
        System.out.println("Informe o seu endereco: ");
        //o ID do cliente sera os numeros do seu CPF, para facilitar a compra de um ingresso.
        System.out.println("-------------------------------------------");
    }
    public static void simular3(){
        System.out.println("Executando 'simular compra");
        System.out.println("Qual o ID do filme deseja assistir? ");
        //o usuario insere o ID do filme, caso o ID nao exista, abortar.
        System.out.println("Sessoes disponiveis: ");
        System.out.println("Digite o ID da sessao que deseja assistir: ");
        //o programa mostrara em tela os IDs das sessoes disponiveis e seu periodo de tempo, caso nao tenha sessoes com esse filme, abortar.
        System.out.println("Locacao disponivel: ");
        System.out.println("Quantas cadeiras deseja comprar? ");
        //o programa mostrara em tela a locacao disponivel, o usuario insere a quantidade de cadeiras desejadas, caso sobressaia a quantidade restante de poltronas, abortar. 
        System.out.println("Qual o ID(CPF, apenas os numeros) da sua conta?");
        //caso o ID nao exista no programa, abortar.
        System.out.println("-------------------------------------------");
    }
    public static void main(String[] args) {
        int opcao;
        Scanner option = new Scanner(System.in);
        do{
            System.out.println("-------------------------------------------");
            menup();
            System.out.println("--->Insira a opcao aqui:");
            opcao = option.nextInt();
            switch(opcao){
                case 1:
                    menu1();
                    System.out.println("--->Insira a opcao aqui:");
                    opcao = option.nextInt();
                    switch(opcao){
                        case 1:
                            
                        case 2:
                            
                        case 3:
                            
                        case 4:  
                            
                        case 5:  
                            
                        case 6:  
                            
                        case 7:
                            
                        case 8:
                            break;
                        default:
                            System.out.println("!!!Opcao invalida!!!");
                            System.out.println("\n...Retornando ao menu...\n");
                    }
                case 2:
                    menu2();
                    System.out.println("--->Insira a opcao aqui:");
                    opcao = option.nextInt();
                    switch(opcao){
                        case 1:
                            
                        case 2:
                            
                        case 3:
                            
                        case 4:
                            break;
                        default:
                            System.out.println("!!!Opcao invalida!!!");
                            System.out.println("\n...Retornando ao menu...\n");
                    }
                case 3:
                    simular1();                                 
                case 4:
                    simular2();                   
                case 5:
                    simular3();
                default:
                    System.out.println("!!!Opcao invalida!!!");
                    System.out.println("\n...Retornando ao menu...\n");
            }
        }while(opcao!=0);
    
    }
}
