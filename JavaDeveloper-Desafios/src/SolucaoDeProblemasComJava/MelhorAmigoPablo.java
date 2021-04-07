package SolucaoDeProblemasComJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MelhorAmigoPablo {

    public static void main(String[] args) throws IOException {

        boolean validacao = true;
        String vencedor = null;
        Integer contador = 0;

        Set<String> listaAlunosSim = new LinkedHashSet<>();
        Set<String> listaAlunosNao = new LinkedHashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String nome = st.nextToken();
        String opcao = st.nextToken();

        while (validacao) {

            if (opcao.equals("SIM")) {
                listaAlunosSim.add(nome);
            } else if (opcao.equals("NAO")) {
                listaAlunosNao.add(nome);
            }

            st = new StringTokenizer(br.readLine());
            nome = st.nextToken();
            if (nome.equals("FIM")) {
                validacao = false;
            } else {
                opcao = st.nextToken();
            }
        }

        for (String nomeAluno2 : listaAlunosSim) {

            if (nomeAluno2.length() > contador) {
                contador = nomeAluno2.length();
            }
        }

        for (String nomeAluno3 : listaAlunosSim) {

            if (nomeAluno3.length() == contador) {
                vencedor = nomeAluno3;
                break;
            }
        }

        for (String nomeAluno : listaAlunosSim.stream().sorted().collect(Collectors.toList())) {
            System.out.println(nomeAluno);
        }
        for (String nomeAluno1 : listaAlunosNao.stream().sorted().collect(Collectors.toList())) {
            System.out.println(nomeAluno1);
        }
        System.out.println("Amigo do Pablo:");
        System.out.println(vencedor);
    }
}