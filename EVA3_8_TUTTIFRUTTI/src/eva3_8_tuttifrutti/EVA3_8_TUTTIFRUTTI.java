/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_tuttifrutti;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_TUTTIFRUTTI {
final static String USUARIO = "TUTTI";
final static String PASSWORD = "FRUTTI";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String usu;
        String pwd;
        do{
            
            System.out.println("Usuario: ");
            usu = input.nextLine();
            System.out.println("Contraseña");
            pwd = input.nextLine();
        }while(!validarUsuario(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA!!");
    }
    public static boolean validarUsuario(String usuario, String pwd){
        if(usuario.equals(USUARIO)&& pwd.equals(PASSWORD))
            return true;
        return false;
        
    }
    
}
