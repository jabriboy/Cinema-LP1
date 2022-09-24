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
        String tituloOriginal, sinopse, nacionalidade, genero;
        for(i = 0; i < qnt; i++){
            this.qntFilmes++;
            System.out.println("Digite o Titulo Original: ");
            tituloOriginal = sc.next();
            System.out.println("Digite o Tamanho do filme (em minutos): ");
            tamanho = sc.nextInt();
            System.out.println("Digite a Sinopse do filme: ");
            sinopse = sc.next();
            System.out.println("Digite a Nacionalidade do filme: ");
            nacionalidade = sc.next();
            System.out.println("Digite o Genero do filme: ");
            genero = sc.next();
            
            cartaz.add(new Filme(this.qntFilmes, tituloOriginal, tamanho, sinopse, nacionalidade, genero));
            
        }
    }

    public void addSalas(int qnt){
        int i, lotacao;
        for(i = 0; i < qnt; i++){
            this.qntSalas++;
            System.out.println("Digite a lotação maxima da sala: ");
            lotacao = sc.nextInt();

            salas.add(new Sala(this.qntSalas, lotacao));
        }
    }

    public void createSessao(int salaID, Integer[] sessao, int filmeID){
        Sala sala = salas.get(salaID - 1);
        Filme filme = cartaz.get(filmeID - 1);
        
        sala.addSessao(sessao, filme);
    }

    public void vendaIngresso(){
        int i;
        System.out.println("Qual filme deseja assistir?\n");
        for(i = 0; i < cartaz.size(); i++){
            System.out.println(cartaz.get(i).tituloOriginal + cartaz.get(i).getID());
        }
        System.out.print("Digite o ID do filme: ");
        int filmeID = sc.nextInt();

        System.out.println("Salas que possuem esse filme:\n");
        salas.forEach( n -> { if( n.sessoes.contains(filmeID)) System.out.println("Lotação: " + n.lotacao + "ID: " + n.getID()); } );
        System.out.println("Digite o id da sala ");
        int salaId = sc.nextInt();

        Sala sala = salas.get(salaId - 1);
        for(i = 0; i < sala.sessoes.size(); i++){
            System.out.println("inicio: " + sala.sessoes.get(i)[0] + "fim: " + sala.sessoes.get(i)[1] + "ID: " + sala.sessoes.get(i)[3]);
        }

        System.out.println("Digite o ID da sessão desejada: ");
        int sessaoId = sc.nextInt();
        sala.subtrairLotacao(sessaoId);
    }

}
