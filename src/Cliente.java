public class Cliente extends Person{
    public String endereco;

    public Cliente(){
        
    }

    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }

    public Cliente(String nome, String cpf, String endereco){
        super(nome, cpf);
        this.endereco = endereco;
        
    }

}
