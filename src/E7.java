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
public class E7 {
    public static void main(String[] args){
        int numero1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        numero1 = teclado.nextInt();
        
        for(int i = 1; i < 11; i++){
            int x = i * numero1;
            System.out.println(numero1 + " x " + i + " = " + x);
        }
    }
}
