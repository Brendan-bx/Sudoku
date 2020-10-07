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

    static void Boards(int[][] scores) {
        int value = 0;
        for (int i = 0; i < scores.length; i++) { //affichage du tableau
            for (int j = 0; j < scores[i].length; j++) {
                value = scores[i][j];
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static boolean Ligne (int [][] oui, int ligne){
        for (int i = 1; i < 10; i++) {


            int value = 0;
            for (int colonne = 0;  colonne < oui.length; colonne++) {
                if (i == oui[ligne][colonne]) {
                    value ++;

                }
                if (value > 1) {
                    return false;
                }
            }

        }
        return true;
    }
    static boolean Colonne (int [][] oui, int colonne){
        for (int i = 1; i < 10; i++) {


            int value = 0;
            for (int ligne = 0;  ligne < oui.length; ligne++) {
                if (i == oui[ligne][colonne]) {
                    value ++;

                }
                if (value > 1) {
                    return false;
                }
            }

        }
        return true;
    }

    static boolean section1 (int [][]oui){
        int value = 0;
        for (int i = 0; i > 3; i++) {
            for (int j = 0; j > 3; j++) {
                if (value == oui[i][j]);
                value ++;
            }
            if (value > 1) {
                return false;
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
        System.out.println(Ligne(boardEasy,0));
        System.out.println(Colonne(boardEasy,0));
        System.out.println(section1(boardEasy));




    }

}
