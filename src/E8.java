import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class E8 {
    public static void main(String[] args){
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Si desea ejecutar el programa, escriba 's': ");
        respuesta = teclado.next();
        
        if (respuesta.equals("s")){
            tabla();
        } else {
            System.out.println("El programa ha finalizado");
        }
    }
    
    public static void tabla(){
        int numero1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        numero1 = teclado.nextInt();
        
        for(int i = 1; i < 11; i++){
            int x = i * numero1;
            System.out.println(numero1 + " x " + i + " = " + x);
        }
    }
}
