import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        Cinema cinema = new Cinema("Salvador" , "Bahia");
        
        while(opcao != 0){
            clearScreen();
            System.out.println("[1] CRIAR FILME");
            System.out.println("[2] CRIAR SALA");
            System.out.println("[3] CRIAR SESSAO");
            System.out.println("[4] COMPRAR INGRESSO");
            System.out.println("[0] FECHAR APP");
            System.out.print("--->");
            opcao = sc.nextInt();

            if(opcao == 0){
                clearScreen();
                System.out.println("SAIU");
            }
            else if(opcao == 1){
                clearScreen();
                int qnt;
                System.out.println("Digite a quantidade de filmes: ");
                qnt = sc.nextInt();
                cinema.addFilmeCartaz(qnt);
            }
            else if(opcao == 2){
                clearScreen();
                int qnt;
                System.out.println("Digite a quantidade de salas: ");
                qnt = sc.nextInt();
                cinema.addSalas(qnt);
            }
            else if(opcao == 3){
                clearScreen();
                int salaID, filmeID, i;
                for(i = 0; i<cinema.salas.size(); i++){
                    System.out.println("Lotacao: " + cinema.salas.get(i).lotacao + " ID: " + cinema.salas.get(i).getID());
                }
                System.out.println("Digite o ID da sala");
                salaID = sc.nextInt();
                clearScreen();
                for(i = 0; i<cinema.cartaz.size(); i++){
                    System.out.println("Titulo: " + cinema.cartaz.get(i).tituloOriginal + " ID: " + cinema.cartaz.get(i).getID());
                }            
                System.out.println("Digite o ID do filme");
                filmeID = sc.nextInt();
                clearScreen();
                cinema.createSessao(salaID, filmeID);
            }
            else if(opcao == 4){
                clearScreen();
                if(cinema.cartaz.size() == 0 || cinema.salas.size() == 0){
                    System.out.println("Não possui filme ou sala criada");
                }
                else{
                    cinema.vendaIngresso();
                }
            }
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
