public class Ator extends Person{
    public String nacionalidade;
    public String descricao;

    public Ator(){
        
    }

    public Ator(String nome, String cpf){
        super(nome, cpf);
    }

    public Ator(String nome, String cpf, String nacionalidade, String descricao){
        super(nome, cpf);
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.descricao = descricao;
        
    }
}
