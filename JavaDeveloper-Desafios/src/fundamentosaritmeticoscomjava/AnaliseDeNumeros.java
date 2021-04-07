package fundamentosaritmeticoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnaliseDeNumeros {
    
    public static void main(String[] args) throws IOException {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numeroPar = 0;
        int numeroImpar = 0;
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        
         for (int contador = 0; contador < 5; contador++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            double numero = Double.parseDouble(st.nextToken());
           
            if (numero %2 == 0) {numeroPar++;}
            if (numero %2 != 0) {numeroImpar++;}
            if (numero > 0) {numeroPositivo++;}
            if (numero < 0) {numeroNegativo++;}
         }
         
         System.out.println(numeroPar + " valor(es) par(es)");
         System.out.println(numeroImpar + " valor(es) impar(es)");
         System.out.println(numeroPositivo + " valor(es) positivo(s)");
         System.out.println(numeroNegativo + " valor(es) negativo(s)");
    }
    
}
