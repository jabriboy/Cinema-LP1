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

    public void createSessao(int salaID, int sessao[], int dia, int filmeID){
        //int expression = (n) -> { if(n.getID() == salaID) return salaID; } 
        Sala sala = salas.get(salaID);
        Filme filme = cartaz.get(filmeID);
        
        sala.addSessao(sessao, filme, dia);
    }

}
