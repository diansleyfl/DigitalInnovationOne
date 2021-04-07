package SolucaoDeProblemasComJava;

import java.util.Scanner;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            
            String entrada = scanner.nextLine();
            Integer limit = (int) Math.floor(entrada.length() / 2);
            Integer end = entrada.length();
            Integer aux = 0;
            
            if (entrada.length() == 1) {
                System.out.println(entrada);
            } 
            else if (limit >= 1) {
                
                for (int i = limit; i >= 1; i--) {
                    
                    if(entrada.substring(end-i, end).equals(entrada.substring(end-(2*i),end-i))) {
                        aux = i;
                        System.out.println(entrada.substring(0, (end - aux)));
                    } 
                    else if (limit == 1) {
                        System.out.println(entrada);
                    }
                }
                if(limit>1 && aux == 0) System.out.println(entrada);
            }
        }scanner.close();
    }   
}

//import java.util.Scanner;
//
//public class EntrevistaEmbaracosa {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = null;
//        StringBuilder greatestSubstring = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            line = scanner.nextLine().trim().toLowerCase();
//            String possiblyRepeatedPart = null;
//            String possiblyEqualStr = null;
//            String longestRepeatedStr = line;
//            int factor = 1;
//
//            for (int i = line.length() - 1; i >= (line.length() / 2); --i, ++factor) {
//                if (i - factor >= 0) {
//                    possiblyRepeatedPart = line.substring(i);
//                    possiblyEqualStr = line.substring(i - factor, i);
//                    
//                    if (possiblyEqualStr.equals(possiblyRepeatedPart)) {
//                        longestRepeatedStr = possiblyEqualStr;
//                    }
//                }
//            }
//            
//            String originalString = longestRepeatedStr;
//
//            if (longestRepeatedStr.length() < line.length()) {
//                int longestRepeatedStrLength = longestRepeatedStr.length();
//                int firstRepetitionIndex = line.length() - longestRepeatedStrLength;
//
//                for (int i = line.length() - (longestRepeatedStrLength * 2); i
//                        - longestRepeatedStrLength >= 0; i -= longestRepeatedStrLength) {
//                    if (line.substring(i - longestRepeatedStrLength, i).equals(longestRepeatedStr)) {
//                        firstRepetitionIndex = i;
//                    }
//                }
//                originalString = line.substring(0, firstRepetitionIndex);
//            }
//            System.out.println(originalString);
//        }
//        scanner.close();
//    }
//}