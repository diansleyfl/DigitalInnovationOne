package introducaoabuscaesubstituicaoemjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PedraPapelTesouraLagartoSpock {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroDeJogadas = scanner.nextInt();
        
        scanner.nextLine();
        
        List<Regra> regras = new ArrayList<>();
        regras.add(new Regra("tesoura", "papel"));
        regras.add(new Regra("papel", "pedra"));
        regras.add(new Regra("pedra", "lagarto"));
        regras.add(new Regra("lagarto", "spock"));
        regras.add(new Regra("spock", "tesoura"));
        regras.add(new Regra("tesoura", "lagarto"));
        regras.add(new Regra("lagarto", "papel"));
        regras.add(new Regra("papel", "spock"));
        regras.add(new Regra("spock", "pedra"));
        regras.add(new Regra("pedra", "tesoura"));
        
        for (int i = 0; i < numeroDeJogadas; i++) {
            List<String> palavras = Arrays.asList(scanner.nextLine().split(" "));
            if(palavras.get(0).equals(palavras.get(1))){
                System.out.println("empate");
            } else {
                boolean primeiro = false;
                for (Regra r : regras) {
                    if (r.getVence().equals(palavras.get(0)) && r.getPerde().equals(palavras.get(1))) {
                        primeiro = true;
                        break;
                    }
                }
                if(primeiro) {
                    System.out.println("fernanda");
                } else {
                    System.out.println("marcia");
                }
            }
        }
    }
    
        public static class Regra {
        private String vence;
        private String perde;
    
        public Regra(String vence, String perde) {
            this.vence = vence;
            this.perde = perde;
        }
    
        public String getVence() {
            return vence;
        }
    
        public void setVence(String vence) {
            this.vence = vence;
        }
    
        public String getPerde() {
            return perde;
        }
    
        public void setPerde(String perde) {
            this.perde = perde;
        }
    }
    
}
