package ordenacaoefiltrosemjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ComprasNoSupermercado {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer quantidadeDeCasos = scanner.nextInt();
        Integer contador = 0;
        
        List<String> listasDeCompras = new ArrayList<>();

        while (contador < quantidadeDeCasos) {
            
            String linhaAtual = scanner.nextLine();
            
            if (linhaAtual.length() > 1) {
                linhaAtual = Arrays
                        .stream(linhaAtual.split(" "))
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining(" "));
                
                listasDeCompras.add(linhaAtual);
                contador++;
                
            }
        }

        listasDeCompras.forEach((lista) -> {
            System.out.println(lista);
        });

    }

}
