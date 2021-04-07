package SolucaoDeProblemasComJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntosBonsOuRuins {
    
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        int N;
        ArrayList<String> stringsSet = new ArrayList<>();
        boolean eConjuntoRuim = false;
        final String CONJUNTO_RUIM = "Conjunto Ruim";
        final String CONJUNTO_BOM = "Conjunto Bom";
        String conditionStr = CONJUNTO_BOM;

        while (true) {
            N = Integer.parseInt(scanner.nextLine());
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                stringsSet.add(scanner.nextLine().toLowerCase().trim());
            }

            int i = 0, j = 0;

            for (i = 0; i < stringsSet.size(); i++) {
                
                for (j = 0; j < stringsSet.size(); j++) {
                    
                    if (i != j) {
                        
                        if (stringsSet.get(i).startsWith(stringsSet.get(j)) || stringsSet.get(j).startsWith(stringsSet.get(i))) {
                            eConjuntoRuim = true;
                            conditionStr = CONJUNTO_RUIM;
                            break;
                        }
                    }
                }
                if (eConjuntoRuim) {
                    break;
                }
            }
            
            System.out.println(conditionStr);
            stringsSet = new ArrayList<>();
            conditionStr = CONJUNTO_BOM;
            
        }
        scanner.close();
    }

}
