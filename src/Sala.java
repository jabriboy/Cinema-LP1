public class Sala {
    private int ID;
    public int lotacao;
    private float sessao;
    private Object filme;

    public Sala(){

    }

    public Sala(int ID, int lotacao, float sessao, Object filme){
        this.ID = ID;
        this.lotacao = lotacao;
        this.sessao = sessao;
        this.filme = filme;
    }

    public int getID(){
        return this.ID;
    }

    public void setID(int novoID){
        this.ID = novoID;
    }

    public float getSessao() {
        return sessao;
    }

    public void setSessao(float sessao) {
        this.sessao = sessao;
    }

    public Object getFilme() {
        return filme;
    }

    public void setFilme(Object filme) {
        this.filme = filme;
    }

}
