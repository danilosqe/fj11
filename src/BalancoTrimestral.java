/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class BalancoTrimestral {

    public static void main(String[] args) {

        int gastosJaneiro = 1500;
        int gastosFevereiro = 1700;
        int gastorsMarco = 2300;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastorsMarco;
        
        int mediaMensal = gastosTrimestre / 3;
        
        System.out.println(gastosTrimestre);
        
        System.out.println("Média mensal: " + mediaMensal );

     
    }

}
