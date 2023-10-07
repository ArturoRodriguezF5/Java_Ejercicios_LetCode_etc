package org.arthycode.java.letcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseCad {

    public static void main(String[] args) {
        String cadOri = "hola como cad";

        String cadRe = Arrays.stream(cadOri.split(" "))
                        .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(cadRe);
        /*StringBuilder cadRe = new StringBuilder();
        char c;
        for (int i = 0; i < cadOri.length(); i++) {
            c = cadOri.charAt(i);
            cadRe.insert(0, c);
        }
        System.out.println(cadRe);*/
        /*char[] cadArr = cadOri.toCharArray();
        char[] cadArrRe = new char[cadArr.length];
        for (int i = 0; i < cadArr.length; i++) {
            for (int j = cadArrRe.length; j >= 0; j++) {
                cadArrRe[j] = cadArr[i];
            }

        }
        System.out.println(cadArrRe);
        System.out.println(cadArr);*/
        /*String[] arrPal = {"Hola", "soy", "Arthy"};
        String newPal = "";
        for (int i = arrPal.length -1; i >= 0; i--) {
            System.out.println(arrPal[i]);
            newPal = newPal + arrPal[i] + " ";
        }
        System.out.println(newPal);*/
    }
}
