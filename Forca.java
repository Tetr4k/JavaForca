package forca;

import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char letra;
        String palavra, letrasD = "", letras = "";
        boolean verif;
        int cont = 0, contp;
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            System.out.println("Digite a palavra e aperte enter:");
            palavra = leitor.nextLine();
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
            do{
                System.out.println("Letras digitadas:"+letrasD);
                contp = 0;
                for (int i = 0; i < palavra.length(); i++) {
                    verif = false;
                    for (int j = 0; j < letrasD.length(); j++){
                        if (letrasD.charAt(j) == palavra.charAt(i)){
                            System.out.print(letrasD.charAt(j)+" ");
                            letras = letras + letrasD.charAt(j);
                            verif = false;
                            contp++;
                            break;
                        }
                        else{
                            verif = true;
                        }
                    }
                    if (verif){
                        System.out.print("_ ");
                    }
                }
                switch (cont) {
                    case 1:
                        System.out.println("\n\n________\n|     ?\n|     O\n|\n|\n|\n|\n\n");
                        break;
                    case 2:
                        System.out.println("\n\n________\n|     ?\n|     O\n|     |\n|\n|\n|\n\n");
                        break;
                    case 3:
                        System.out.println("\n\n________\n|     ?\n|    _O\n|     |\n|\n|\n|\n\n");
                        break;
                    case 4:
                        System.out.println("\n\n________\n|     ?\n|    _O_\n|     |\n|\n|\n|\n\n");
                        break;
                    case 5:
                        System.out.println("\n\n________\n|     ?\n|    _O_\n|     |\n|    /\n|\n|\n\n");
                        break;
                    case 6:
                        System.out.println("\n\n________\n|     {\n|     }\n|     O\n|    /+\\\n|    ( )\n|\n\n");
                        break;
                    default:
                        System.out.println("\n\n________\n|     ?\n|\n|\n|\n|\n\n");
                }    
                if (contp==palavra.length()){
                        System.out.println();
                        System.out.println("Voce ganhou!");
                        break;
                     
                }
                if (cont==6){
                    System.out.println("Voce perdeu! a palavra era "+ palavra);
                    break;
                }
                System.out.println("Digite uma letra e aperte enter:");
                letra = leitor.nextLine().charAt(0);
                verif = true;
                for (int i = 0; i < letrasD.length(); i++) {
                    if (letra==letrasD.charAt(i)){
                        verif = false;
                        break;
                    }
                }
                if (verif){
                    letrasD = letrasD + " " + letra;
                }
                verif = false;
                for (int i = 0; i < palavra.length(); i++) {
                    if (letra == palavra.charAt(i)){
                        verif = false;
                        break;
                    }
                    else{
                        verif = true;
                    }
                }
                if (verif){
                    cont++;
                    System.out.println("Letra incorreta");
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println();
                }
            }while (true);
        leitor.close();
    }
}