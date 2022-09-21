import java.util.ArrayList;
import java.util.Scanner;

public class Filme {
    Scanner sc = new Scanner(System.in);

    private int ID;
    public String tituloOriginal;
    ArrayList<Ator> atores = new ArrayList<>();
    Ator diretor = new Ator();
    public int tamanho;
    private boolean estrangeiro = false;
    public String tituloTraduzido = "";
    public String sinopse;
    public String nacionalidade;
    public String genero;

    public Filme(){

    }
    
    public Filme(int ID, String tituloOriginal, int tamanho, String sinopse, String nacionalidade, String genero){
        this.ID = ID;
        this.tituloOriginal = tituloOriginal;
        this.tamanho = tamanho;
        this.estrangeiro = false;
        this.tituloTraduzido = "";
        this.sinopse = sinopse;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
    }

    public int getID() {
        return this.ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }

    public boolean getEstrangeiro() {
        return this.estrangeiro;
    }

    public void setEstrangeiro(int valor) {
        if(valor == 0){
            this.estrangeiro = false;
            this.tituloTraduzido = "";
        }
        else if(valor == 1){
            this.estrangeiro = true;
            setTituloTraduzido();
        }
        else{
            System.out.println("Valor inválido, tente novamente.");
        }
        
    }

    public void setTituloTraduzido(){
        if(getEstrangeiro()){
            String novoTitulo;
            System.out.println("Digite o novo título traduzido: ");
            novoTitulo = sc.next();

            this.tituloTraduzido = novoTitulo;
        }
        else{
            System.out.println("Título traduzido não disponível");
        }

    }
}
