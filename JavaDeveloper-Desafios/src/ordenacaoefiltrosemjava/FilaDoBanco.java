package ordenacaoefiltrosemjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FilaDoBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numeroCasos = sc.nextInt();
        sc.nextLine();

        Integer numeroClientes;
        String sms;
        String[] splitSms;

        List<String> lista = new ArrayList<>();
        List<Integer> listaReordenada = new ArrayList<>();
        List<Integer> listaFinal = new ArrayList<>();

        Integer posicoesMantidas;

        for (int i = 0; i < numeroCasos; i++) {

            numeroClientes = sc.nextInt();
            sc.nextLine();

            sms = sc.nextLine();
            splitSms = sms.split(" ");

            for (int j = 0; j < splitSms.length; j++) {
                lista.add(splitSms[j]);
            }

            for (String customer : lista) {
                listaReordenada.add(Integer.parseInt(customer));
            }

            Collections.sort(listaReordenada, Collections.reverseOrder());

        
            posicoesMantidas = 0;

            for (int count = 0; count < listaReordenada.size(); count++) {
                if (listaReordenada.get(count) == Integer.parseInt(lista.get(count))) {
                    posicoesMantidas++;
                }
            }

            listaFinal.add(posicoesMantidas);

            lista.clear();
            listaReordenada.clear();
        }

        sc.close();

        for (Integer alterar : listaFinal) {
            System.out.println(alterar);
        }
    }
}