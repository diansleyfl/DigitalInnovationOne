package SolucaoDeProblemasComJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaNumeros {
    
  public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int quantidadeValores = scr.nextInt();
        Map<Integer, Integer> numeros = new HashMap<>();
    
        for (int i = 0; i < quantidadeValores; i++) {
            int numero = scr.nextInt();
    
            if(numeros.containsKey(numero)) {
                int qtde = numeros.get(numero);
                numeros.put(numero, ++qtde);
            } else {
                numeros.put(numero, 1);
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }

}
