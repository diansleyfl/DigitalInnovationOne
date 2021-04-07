package SolucaoDeProblemasComJava;

import java.util.Scanner;

public class VogaisExtraterrestres {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        
        while(scanner.hasNextLine()) {
            quantidade = 0;
            String alfabeto = scanner.nextLine();
            String frase = scanner.nextLine();
    
            for (int i = 0; i < alfabeto.length() ; i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if(frase.charAt(j) == alfabeto.charAt(i)) {
                        quantidade++;
                    }
                }
            }
            
            System.out.println(quantidade);
        }
    }
}