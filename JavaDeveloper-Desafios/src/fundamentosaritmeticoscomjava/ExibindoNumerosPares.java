package fundamentosaritmeticoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExibindoNumerosPares {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st = new StringTokenizer(br.readLine());
        double numero = Double.parseDouble(st.nextToken());
        
         for (int contador = 1; contador <= numero; contador++) {
            if ( contador %2 == 0) {System.out.println(contador);}
         }
                
    }
}