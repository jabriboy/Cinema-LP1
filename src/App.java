import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer[] sessoes;
        Cinema cinema = new Cinema("Salvador" , "Bahia");
        cinema.addFilmeCartaz(2);
        cinema.addSalas(3); 
        //cinema.createSessao(1, sessoes, 1); 
        //cinema.createSessao(2, sessoes, 2);
        //cinema.createSessao(3, sessoes, 2);
        cinema.vendaIngresso();
    }
}
