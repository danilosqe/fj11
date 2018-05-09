/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class ExercicioFibonacci {

    public static void main(String[] args) {
        
        int fibonacci = 1, resultado = 0;
        for (int i = 0; i <= 10; i++) {
            fibonacci = fibonacci + resultado;
            resultado = fibonacci - resultado;
            System.out.print(fibonacci + " , ");

        }
    }
}
