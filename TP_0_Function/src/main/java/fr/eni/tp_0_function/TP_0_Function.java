/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_function;

/**
 *
 * @author erwan
 */
public class TP_0_Function {

    public static void main(String[] args) {
        
        tableDeMultiplication(5,13);
        String strChiffre = codeCesar("ABCD", 2);
        System.out.println(strChiffre);
        int intBinaireConverti = conversionBaseDix(111);
        System.out.println(intBinaireConverti);
    }
    
    public static void tableDeMultiplication(int intTable, int intNbLimite)
    {
        /* 
         * Ecrire la fonction tableDeMultiplication qui va afficher la table
         * intTable entrée en argument.
         * Il faudra partir de 1 et aller jusqu'à intNbLimite.
         * Vous vous aiderez de println()
         * exemple d'affichage si on appelle : tableDeMultiplication(5,13);
         * 5 * 1 = 5
         * 5 * 2 = 10
         * 5 * 3 = 15
         * ... (etc)
         * 5 * 12 = 60
         * 5 * 13 = 65
        */
    }
    
    public static int conversionBaseDix(int intNbrBinaireConvertir)
    {
    
        /*
         * Pour cette fonction, il est conseillé de comprendre comment on 
         * convertit un nombre binaire en base 10, veuillez suivre ce lien :
         * https://fr.wikihow.com/convertir-un-nombre-binaire-en-nombre-d%C3%A9cimal
         * 
         * En effet, cette fonction va prendre en paramètre un nombre binaire,
         * il faudra alors retourner sa conversion en base 10.
         * Exemple si on appelle : conversionBaseDix(int 111);
         * il faudra retourner 7 (en effet, 1*2^0 + 1*2^1 + 1*2^2 = 7)
        */
    }
    
    public static String codeCesar(String strMot, int intDecalage) //QUESTION BONUS
    {
        /*
         * Ecrire une fonction qui va permettre de chiffre un mot strMot à 
         * l'aide d'un décalage intDecalage.
         * Par exemple, si on appelle : codeCesar("ABCD", 2);  
         * Il faudra retourner la chaîne suivante : "CDEF"
        */
        
    }
}