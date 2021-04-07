package introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class OrdenacaoDePalavrasPorTamanho {
    
    public static void main(String[] args) throws IOException {

        String linha;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int numeroDeTestes = Integer.parseInt(br.readLine());
        
        while (numeroDeTestes > 0 && (linha = br.readLine()) != null) {

            String[] entrada = linha.split(" ");
            Arrays.sort(entrada, new Ordenar());
            
            for (String s : entrada) {
                System.out.print(s + " ");
            }

            System.out.println();

            numeroDeTestes--;
        }
    }
}

class Ordenar implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {

        if (t1.length() > s.length()) {
            return 1;
        } else if (t1.length() < s.length()) {
            return -1;
        } else if (t1.length() == s.length()) {
            return s.compareToIgnoreCase(t1);
        }
        return 0;
    }
}
