import java.util.ArrayList;

public class Sala {
    private int ID;
    public int lotacao;
    ArrayList<Integer> sessoes = new ArrayList<>();

    public Sala(){

    }

    public Sala(int ID, int lotacao){
        this.ID = ID;
        this.lotacao = lotacao;

    }

    public int getID(){
        return this.ID;
    }

    public void setID(int novoID){
        this.ID = novoID;
    }

    public boolean addSessao(int sessao[], Filme filme, int dia){

        return true;
    }

}
