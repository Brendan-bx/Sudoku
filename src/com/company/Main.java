package com.company;

public class Main {
    static int[][] boardEasy = {
            {4, 0, 0, 1, 0, 2, 6, 8, 0},
            {1, 0, 0, 0, 9, 0, 0, 0, 4},
            {0, 3, 8, 0, 6, 4, 0, 1, 0},
            {0, 0, 5, 0, 7, 1, 9, 2, 0},
            {0, 2, 6, 0, 0, 9, 8, 0, 0},
            {8, 0, 0, 2, 5, 0, 0, 0, 0},
            {9, 0, 3, 0, 0, 0, 0, 0, 8},
            {2, 5, 0, 6, 0, 0, 1, 0, 7},
            {6, 0, 7, 9, 0, 5, 3, 0, 0}
    };

    static int[][] boardMedium = {
            {0, 7, 0, 3, 4, 0, 2, 0, 6},
            {9, 0, 0, 7, 0, 6, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 7, 9, 8, 6, 0},
            {0, 0, 0, 0, 0, 2, 3, 0, 4},
            {4, 0, 7, 5, 0, 8, 0, 0, 0},
            {0, 0, 0, 9, 0, 0, 0, 0, 0},
            {0, 0, 6, 0, 0, 0, 0, 1, 7},
            {5, 1, 0, 0, 8, 0, 4, 0, 2}
    };

    static int[][] boardHard = {
            {0, 0, 0, 0, 0, 0, 9, 4, 0},
            {6, 0, 0, 0, 0, 0, 2, 7, 0},
            {8, 2, 0, 0, 4, 9, 6, 0, 0},
            {0, 7, 4, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 7, 6, 0, 0, 0, 0},
            {0, 6, 2, 0, 0, 5, 0, 8, 0},
            {0, 0, 0, 0, 5, 7, 0, 2, 3},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {7, 5, 3, 2, 0, 4, 0, 0, 0}
    };

    static int[][] boardGodLike = {
            {0, 0, 0, 6, 0, 2, 8, 0, 4},
            {0, 0, 0, 0, 3, 0, 0, 0, 7},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {4, 0, 6, 0, 5, 0, 3, 0, 0},
            {2, 0, 8, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 9, 1, 0},
            {1, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 7, 0, 9, 0, 0, 0, 5, 0},
            {0, 0, 2, 4, 0, 0, 0, 0, 8}
    };

    /**
     * sert à afficher n'importe quel tableau
     * @param scores sert à prendre la taille du tableau en ligne et colonne
     */
    static void Boards(int[][] scores) {
        int value = 0;
        for (int i = 0; i < scores.length; i++) {     //affichage du tableau
            for (int j = 0; j < scores[i].length; j++) {
                value = scores[i][j];
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    /**
     * vérifie chacun des lignes pour savoir si elles sont dans les règles
     * @param oui prend la taille du tableau
     * @return annonce vrai ou faux lorsqu'il y'a un nombre identique ou non
     */
    static boolean Ligne (int [][] oui) {
        int ligne = 0;
        while (ligne < 9) {
            for (int i = 1; i < 10; i++) {
                int value = 0;
                for (int colonne = 0; colonne < oui.length; colonne++) {
                    if (i == oui[ligne][colonne]) {
                        value++;

                    }
                    if (value > 1) {
                        return false;
                    }
                }

            }
            ligne = ligne + 1;

        }
        return true;

    }

    /**
     * vérifie chacune des colonnes pour savoir si elles sont dans les règles
     * @param oui prend la taille du tableau
     * @return annonce vrai ou faux lorsqu'il y'a un nombre identique ou non
     */
    static boolean Colonne (int [][] oui){
        int colonne = 0;
        while (colonne < 9) {
            //vérifie tout les nombres de 1 à 9
        for (int i = 1; i < 10; i++) {
            int value = 0;
            for (int ligne = 0; ligne < oui.length; ligne++) {
                if (i == oui[ligne][colonne]) {
                    value++;

                }
                if (value > 1) {
                    return false;
                }
            }
        }
        colonne = colonne + 1;
        }
        return true;
    }

    /**
     * vérifie si la section 1 de la grille est dans les règles
     * @param oui prend le taille du tableau
     * @param colonne prends le numéro de la colonne
     * @param ligne prends le numéro de la ligne
     * @return annonce vrai ou faux si nombre identique ou non
     */
    static boolean section1 (int [][]oui, int colonne, int ligne) {
        //vérifie la premiere section (haut à gauche) en 3x3 de la grille
        int value = 3;
        for (int num = 0; num < 10; num++) {
            int counter = 0;
            for (int i = ligne; i < ligne + value; i++) {
                for (int j = colonne; j > colonne + value; j++) {
                    if (value == oui[i][j]) ;
                    counter++;
                }
                if (counter > 1) {
                    return false;
                }
            }

        }
        return true;

    }




    public static void main(String[] args) {


        System.out.println("Difficulté : easy");
        Boards(boardEasy);
        //System.out.println("Difficulté : moyen ");
        //Boards(boardMedium);
        //System.out.println("Difficulté : hard");
        //Boards(boardHard);
        //System.out.println("Difficulté : Legend");
        //Boards(boardGodLike);
        System.out.println(Ligne(boardEasy));
        System.out.println(Colonne(boardEasy));
        System.out.println(section1(boardEasy, 0, 0));




    }

}
