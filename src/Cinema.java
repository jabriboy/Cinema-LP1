import java.util.ArrayList;

public class Cinema {
    public String cidade;
    public String estado;
    ArrayList<Sala> salas = new ArrayList<>();
    ArrayList<Filme> cartaz = new ArrayList<>();

    public Cinema(){
        
    }

    public Cinema(String cidade, String estado){
        this.cidade = cidade;
        this.estado = estado;
        
    }

}
