import java.util.ArrayList;

public class Sala {
    private int ID;
    public int lotacao;
    ArrayList<Integer[]> sessoes = new ArrayList<>();

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

    public boolean addSessao(Integer[] sessao, Filme filme){
        int i;
        for(i = 0; i > sessoes.size(); i++){
            if(sessao[0] == sessoes.get(i)[0]){
                return false;
            }
        }
        Integer finalSessao = filme.tamanho;
        sessao[1] = finalSessao;
        sessoes.add(sessao);
        return true;
    }

}
