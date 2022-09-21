public class Sala {
    private int ID;
    public int lotacao;
    public int sessao;
    public Object filme;

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

    public boolean addSessao(int sessao[], Object filme){
        
        return true;
    }

}
