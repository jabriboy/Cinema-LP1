import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    Scanner sc = new Scanner(System.in);

    private int qntFilmes;
    private int qntSalas;
    public String cidade;
    public String estado;
    ArrayList<Sala> salas = new ArrayList<>();
    ArrayList<Filme> cartaz = new ArrayList<>();

    public Cinema(){
        
    }

    public Cinema(String cidade, String estado){
        this.cidade = cidade;
        this.estado = estado;
        this.qntFilmes = 0;
        this.qntSalas = 0;
    }

    public void addFilmeCartaz(int qnt){
        int i, tamanho;
        String tituloOriginal, sinopse, nacionalidade, genero, lixo;
        for(i = 0; i < qnt; i++){
            clearScreen();
            this.qntFilmes++;
            System.out.println("Digite o Titulo Original: ");
            tituloOriginal = sc.nextLine();

            System.out.println("Digite o Tamanho do filme (em minutos): ");
            tamanho = sc.nextInt();

            lixo = sc.nextLine();
            System.out.println("Digite a Sinopse do filme: ");
            sinopse = sc.nextLine();

            System.out.println("Digite a Nacionalidade do filme: ");
            nacionalidade = sc.nextLine();

            System.out.println("Digite o Genero do filme: ");
            genero = sc.nextLine();

            /*tituloOriginal = "filme 1";
            tamanho = 90;
            sinopse = "sinopse do filme";
            nacionalidade = "Brasileiro";
            genero = "acao";*/
            
            cartaz.add(new Filme(this.qntFilmes, tituloOriginal, tamanho, sinopse, nacionalidade, genero));
            
        }
    }

    public void addSalas(int qnt){
        int i, lotacao;
        for(i = 0; i < qnt; i++){
            clearScreen();
            this.qntSalas++;
            System.out.println("Digite a lotação maxima da sala: ");
            lotacao = sc.nextInt();

            //lotacao = 50;

            salas.add(new Sala(this.qntSalas, lotacao));
        }
    }

    public void createSessao(int salaID, int filmeID){
        Integer[] sessao = {0,0,0,0,0};
        int iniSessao;
        System.out.println("Digite o inicio da sessao: ");
        iniSessao = sc.nextInt();
        sessao[0] = iniSessao;

        Sala sala = salas.get(salaID - 1);
        Filme filme = cartaz.get(filmeID - 1);
        
        sala.addSessao(sessao, filme);
    }

    public boolean vendaIngresso(){
        int i, x = 0, salaId, z;
        clearScreen();
        System.out.println("Qual filme deseja assistir?\n");
        for(i = 0; i < cartaz.size(); i++){
            System.out.println(cartaz.get(i).tituloOriginal + " - " + cartaz.get(i).getID());
        }
        System.out.print("Digite o ID do filme: ");
        int filmeID = sc.nextInt();

        if(!existeSessao()){
            clearScreen();
            System.err.println("NAO EXISTE NENHUMA SESSAO");
            int y;
            System.out.println("[0] voltar ao menu principal");
            System.out.print("--->");
            y = sc.nextInt();
            return false;
        }
        else{
            System.out.println("Salas que possuem esse filme:\n");
            salas.forEach( n -> { if( n.sessoes.get(num(x))[4] == filmeID) System.out.println("Lotação: " + n.lotacao + " ID: " + n.getID()); } );
            System.out.println("Digite o id da sala: ");
            salaId = sc.nextInt();
        }
        clearScreen();
        Sala sala = salas.get(salaId - 1);
        for(i = 0; i < sala.sessoes.size(); i++){
            System.out.println("inicio: " + sala.sessoes.get(i)[0] + " fim: " + sala.sessoes.get(i)[1] + " ID: " + sala.sessoes.get(i)[3]);
        }

        System.out.println("Digite o ID da sessão desejada: ");
        int sessaoId = sc.nextInt();
        sala.subtrairLotacao(sessaoId);
        System.out.println("Poltronas disponiveis: " + sala.sessoes.get(sessaoId)[2]);
        System.out.println("Digite [0] para sair");
        System.out.print("--->");
        z = sc.nextInt();
        return true;
    }

    public boolean existeSessao(){
        int i;
        for(i = 0; i<salas.size(); i++){
            if(salas.get(i).sessoes.size() > 0){
                return true;
            }
        }
        return false;
    }

    public int num(int x){
        return x++;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

}
