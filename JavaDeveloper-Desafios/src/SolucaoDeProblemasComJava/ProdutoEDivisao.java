package SolucaoDeProblemasComJava;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ProdutoEDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal currentNum, resultNum;
        String operador;
        String[] lineArgs;
        int N;
        
        N = Integer.parseInt(scanner.nextLine());
        resultNum = new BigDecimal("1.0");

        for (int i = 0; i < N; ++i) {
            
            lineArgs = scanner.nextLine().trim().split(" ");

            currentNum = new BigDecimal(lineArgs[0]);
            operador = lineArgs[1];

            if (operador.equals("*")) {
                resultNum = resultNum.multiply(currentNum);
            } else if (operador.equals("/")) {
                resultNum = resultNum.divide(currentNum, MathContext.DECIMAL128);
            }
        }

        System.out.println(resultNum.setScale(0, RoundingMode.DOWN));
        scanner.close();
    }    

}
