package resolvendoalgoritmoscomjava;

import java.util.Scanner;

public class HashMagico {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        int N = Integer.parseInt(entrada);
        
        for (int i = 0; i < N; i++) {
            
            int L = scanner.nextInt();
            int result = 0;
            
            for (int j = 0; j < L; j++) {
                
                String linhas = scanner.next();
                char[] array = linhas.toCharArray();
                
                for (int z = 0; z < array.length; z++) {
                    int alPos = (int) array[z] - 65;
                    result += alPos + j + z;
                }
            }
            
            System.out.println(result);
        
        }
    }
}
