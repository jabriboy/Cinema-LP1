import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    Scanner sc = new Scanner(System.in);
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
        Integer duracao = filme.tamanho;
        int finalSessao = sessao[0] + duracao; 
        sessao[1] = finalSessao;
        sessao[2] = this.lotacao;
        sessao[3] = sessoes.size();
        sessao[4] = filme.getID();
        sessoes.add(sessao);
        return true;
    }

    public boolean subtrairLotacao(int sessaoId){
        int qntIngressos, y;
        Integer[] sessao = sessoes.get(sessaoId);
        System.out.println("Quantidade de ingressos disponíveis: " + sessao[2]);
        System.out.println("Quantos ingressos deseja comprar?: ");
        qntIngressos = sc.nextInt();
        if(qntIngressos > sessao[2]){
            System.out.println("Quantidade indisponivel");
            System.out.println("Digite [0] para sair");
            System.out.print("--->");
            y = sc.nextInt();
            return false;
        }
        else{
            sessao[2] = sessao[2] - qntIngressos;
            
            return true;
        }
    }

}
