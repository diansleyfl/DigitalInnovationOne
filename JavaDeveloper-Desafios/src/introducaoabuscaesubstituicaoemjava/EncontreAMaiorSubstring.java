package introducaoabuscaesubstituicaoemjava;

import java.io.IOException;
import java.util.Scanner;

public class EncontreAMaiorSubstring {
    
        public static void main(String[] args) throws IOException {

        String string1 = new String();
        String string2 = new String();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String ocorrencia = "";
            string1 = scanner.nextLine();

            if (scanner.hasNextLine()) {
                string2 = scanner.nextLine();
            }

            if (string2.length() >= string1.length()) {
                String string3 = string1 + string2;
                int n = string3.length();
                for (int i = 0; i < n; i++) {

                    for (int j = i + 1; j < n; j++) {
                        String x = CheckSizeSequence.checkSequence(string3.substring(i, n), string3.substring(j, n));
                        if (x.length() > ocorrencia.length()) {
                            ocorrencia = x;
                        }
                    }
                }

                System.out.println(ocorrencia.length());

            }else {
                System.out.println(ocorrencia.length());
            }
        }
        scanner.close();
    }
}

class CheckSizeSequence {

    public static String checkSequence(String a, String b) {

        int n = Math.min(a.length(), b.length());
        try {

            for (int i = 0; i < n; i++) {

                if (a.charAt(i) != b.charAt(i)) {

                    return a.substring(0, i);
                }
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return a.substring(0, n);
    }

}
