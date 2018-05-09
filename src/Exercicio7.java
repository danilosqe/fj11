/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Exercicio7 {

    public static void main(String[] args) {
        int x = 13;
        if (x == 0) {
            System.out.println("insira um valor valido para x");
        } else {

            while (x != 1) {
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = 3 * x + 1;
                }
                System.out.print(x + " , ");
                
            }

        }
    }

}
