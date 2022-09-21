public class Ingresso {
    private int ID;
    public int[] sessao;
    public Object filme;

    public Ingresso(int ID, int sessao[], Object filme){
        this.ID = ID;
        this.sessao = sessao;
        this.filme = filme;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }
}
