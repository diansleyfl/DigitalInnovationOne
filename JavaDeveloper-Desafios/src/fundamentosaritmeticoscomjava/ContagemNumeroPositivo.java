package fundamentosaritmeticoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContagemNumeroPositivo {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         int numeroPositivo = 0;
                  
         for (int contador = 0; contador < 6; contador++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double numero = Double.parseDouble(st.nextToken());
                                    
            if (numero > 0) {numeroPositivo++;}
            
         }
         
        System.out.println(numeroPositivo + " valores positivos");
        
    }
}