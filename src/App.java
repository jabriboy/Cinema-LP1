import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer[] sessoes = {0};
        int iniSessao;
        Cinema cinema = new Cinema("Salvador" , "Bahia");
        cinema.addFilmeCartaz(1);
        cinema.addSalas(1);
        iniSessao = sc.nextInt();
        sessoes[0] = iniSessao;
        cinema.createSessao(1, sessoes, 1); 
        //cinema.createSessao(2, sessoes, 2);
        //cinema.createSessao(3, sessoes, 2);
        cinema.vendaIngresso();
    }
}
