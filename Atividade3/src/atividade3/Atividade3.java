/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] unidade = {"zero", "um", "dois", "três", "quatro", "cinco",
        "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezena = {"vinte", "trinta", "quarenta",
        "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centena = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos",  "seiscentos", "setecentos", "oitocentos",
        "novecentos"};
        
        System.out.print("Insira um número de 0 à 999: ");
        Scanner scInput = new Scanner(System.in);
        int numInput = scInput.nextInt();
        int cent = numInput / 100;
        int dez = (numInput % 100) / 10;
        int uni = (numInput % 100) % 10;
        
//        System.out.print("Unidade: " + uni + "| Dezena: " + dez + "| Centena: " + cent);
        
        
        if(numInput < 20) {
            System.out.println(unidade[numInput]);
        }
        else if(numInput >= 20 && numInput < 100) {
            System.out.println(dezena[dez-2] + " e "+ unidade[uni]);
        }
        else if(numInput >= 100) {
            System.out.println(centena[cent] + " e " + dezena[dez-2] + " e "+ unidade[uni]);
        }
    }
    
}
