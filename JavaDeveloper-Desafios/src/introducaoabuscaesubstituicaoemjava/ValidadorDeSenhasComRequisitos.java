package introducaoabuscaesubstituicaoemjava;

import java.util.Scanner;

public class ValidadorDeSenhasComRequisitos {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String senha;
        
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String permitidos = "[a-zA-Z0-9]+";
        
        while(scr.hasNextLine()) {
            senha = scr.nextLine();
            
            if(senha.length() >=6 && senha.length() <= 32 && senha.matches(permitidos) && senha.matches(requeridos)){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }

}
