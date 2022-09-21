import java.util.ArrayList;

public class Filme {
    private int ID;
    public String tituloOriginal;
    ArrayList<Ator> atores = new ArrayList<>();
    Ator diretor = new Ator();
    public float tamanho;
    private boolean estrangeiro = false;
    public String tituloTraduzido = "";
    public String sinopse;
    public String nacionalidade;
    public String genero;

    public Filme(){

    }
    
    public Filme(int ID, String tituloOriginal, float tamanho, boolean estrangeiro, String tituloTraduzido, String sinopse, String nacionalidade, String genero){
        this.ID = ID;
        this.tituloOriginal = tituloOriginal;
        this.tamanho = tamanho;
        this.estrangeiro = estrangeiro;
        this.tituloTraduzido = tituloTraduzido;
        this.sinopse = sinopse;
        this.nacionalidade = nacionalidade;
        this.genero = genero;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }
    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }
}
