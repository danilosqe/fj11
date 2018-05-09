/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class ExercicioX {
    
    public static void main(String[] args) {
        // calcula o fatorial
        long fatorial = 0;
        for (int n = 1; n<=10; n++){
            fatorial = n;
            for(int i = n; i >= 1; i--){
                fatorial *= (n - (i - 1));
            }
            System.out.println(fatorial);
        }
        System.out.println("fatorial final " + fatorial);
        
        long fatorial2 = 0;
        for(int n = 1; n<=20; n++){
            fatorial2 = n;
            for(int i = n; i >= 1; i--){
                fatorial2 *= (n - (i-1));
            }
            System.out.println(fatorial2);
        }
        System.out.println("Fatorial2 final " + fatorial2);
    
        long fatorial3 = 0;
        for(int n = 1; n<=30; n++){
            fatorial3 = n;
            for(int i = n; i >= 1; i--){
                fatorial3 *= (n - (i-1));
            }
            System.out.println(fatorial3);
        }
        System.out.println("Fatorial3 final " + fatorial2);
    }
    
    
}
