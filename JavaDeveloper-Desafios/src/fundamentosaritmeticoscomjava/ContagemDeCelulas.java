package fundamentosaritmeticoscomjava;

import java.util.Scanner;

public class ContagemDeCelulas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int nota100 = 0;
        int sobrado100 = 0;
        int nota50 = 0;
        int sobrado50 = 0;
        int nota20 = 0;
        int sobrado20 = 0;
        int nota10 = 0;
        int sobrado10 = 0;
        int nota5 = 0;
        int sobrado5 = 0;
        int nota2 = 0;
        int sobrado2 = 0;
        int nota1 = 0;
        
        int dinheiro = scanner.nextInt();
        
        nota100 = dinheiro / 100;
        sobrado100 = dinheiro % 100;
        
        nota50 = sobrado100 / 50;
        sobrado50 = sobrado100 % 50;
        
        nota20 = sobrado50 / 20;
        sobrado20 = sobrado50 % 20;
        
        nota10 = sobrado20 / 10;
        sobrado10 = sobrado20 % 10;
        
        nota5 = sobrado10 / 5;
        sobrado5 = sobrado10 % 5;
        
        nota2 = sobrado5 / 2;
        sobrado2 = sobrado5 % 2;
        
        nota1 = sobrado2 / 1;
        
        System.out.println(dinheiro);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
        
    }

}
