package fundamentosaritmeticoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsumoMedioAutomovel {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int distancia = 0;
        double consumo = 0.0;

        distancia = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        consumo = Double.parseDouble(st.nextToken());

        System.out.printf("%.3f km/l", distancia / consumo);
        
    }
}