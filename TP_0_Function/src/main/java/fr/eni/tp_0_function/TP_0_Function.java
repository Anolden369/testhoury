/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_function;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class TP_0_Function {

    public static void main(String[] args) {
        //t
        
        int intResultatSoustraction = simpleSoustraction(3,4);
        System.out.println(intResultatSoustraction);

        tableDeMultiplication(5,15);
        
        simpleAffichageSoustraction(3,4);
        
        simpleEntreeEtAffichage();
        
        int intBinaireConverti = conversionBaseDix(111);
        System.out.println(intBinaireConverti);
        
        String strChiffre = codeCesar("ABCD", 2);
        System.out.println(strChiffre);
       
    }

     public static void simpleEntreeEtAffichage()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quel nombre voulez-vous afficher : ");
        int nombre = Integer.parseInt(input.next());
        System.out.println(nombre);
        
        /*
         * Vous devez simplement demander dans cette fonction à l'utilisateur 
         * de rentrer un nombre. Ensuite, à l'aide de println(), vous devrez
         * afficher ce nombre
         * Par exemple, si j'appelle la fonction simpleEntreeEtAffichage();
         * Elle demandera "Quel nombre voulez-vous afficher", et si l'utilisateur
         * entre 3, la fonction devra afficher 3
         * Cette fonction ne retourne rien.
        */
    }
    public static int simpleSoustraction(int intA, int intB)
    {
        int soustraction = intA - intB;
        return(soustraction);
        /*
         * Vous devez simplement coder une fonction qui retourne le résultat
         * de la soustraction intA - intB.
         * Par exemple, si j'appelle la fonction simpleSoustraction(3,4);
         * Elle devra retourner -1
        */
    }
    
    public static void simpleAffichageSoustraction(int intA, int intB)
    {
        int resultat = intA - intB;
        System.out.println(resultat);
        /*
         * Vous devez simplement coder une fonction qui affiche le résultat
         * de la soustraction intA - intB.
         * Par exemple, si j'appelle la fonction simpleAffichageSoustraction(3,4);
         * Elle devra afficher dans la console -1
        */
    }
    
    public static void tableDeMultiplication(int intTable, int intNbLimite)
    {
       if (intNbLimite > 0)
       {
        for (int compteur = 1; compteur <= intNbLimite; compteur++ )
        {
           
           int resultat = intTable * compteur;
           System.out.println(intTable + " * " + compteur + " = " + resultat);
            
        }
       } else {
           System.out.println("Le nombre limite est inférieur à 0. Il ne doit pas être négatif !");
       }
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
        // Il faut créer un tableau et mettre le nombre intNbrBinaireConvertir puis séparer par une virgule les chiffres du nombre,
        // et selectionner chaque chiffre avec intNbrBinaireConvertir[0] etc , enfin faire le calcul ci dessous.
        int resultat = 0;
        for (int compteur = 0; compteur <= 7; compteur++ )
        {   
            int reste = intNbrBinaireConvertir % 2;
            int total = reste;
            int calcul = reste*2^compteur;
            resultat = resultat + calcul;
        }
        return(resultat);
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