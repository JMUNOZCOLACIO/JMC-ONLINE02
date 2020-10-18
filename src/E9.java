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
public class E9 {
    public static void main(String[] args){
        int numero1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Indique numero positivo: ");
        numero1 = teclado.nextInt();
        
        if (numero1 > 0){
            divisible(numero1);
        } else {
            System.out.println("El numero indicado es negativo");
        }
    }
    public static int divisible(int numero){
        int totalFactors=0;
        for(int i = 1; i <= numero; ++i) {
            /*Verificamos si no sobra nada en la división*/
            if (numero % i == 0) {
                totalFactors++;
                System.out.printf("%02d. %d\n", totalFactors, i);
                /*Detenemos el bucle cuando haya 10 factores*/
                if (totalFactors==10){
                    break;
                }
            }
        }
        return 0;
    }
}
