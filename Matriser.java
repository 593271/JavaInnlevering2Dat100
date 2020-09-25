package academy.learnprogramming;

public class Matriser {


    private static int[][] matrise = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


    private static int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    private static int[][] mat2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};




    // a)
    public static void skrivUtv1(int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }

            System.out.println();
        }


    }

    // b)
    public static  String  tilStreng(int[][] matrise) {
        int i = 0;
        int j = 0;
        String matrisString = String.valueOf(matrise[i][j]);
        for ( i = 0; i < matrise.length; i++) {
            for ( j = 0; j < matrise[i].length; j++) {
                matrisString = String.valueOf(matrise[i][j]);

                System.out.print(matrisString + " ");
            }
            System.out.print("/n");

        }
        return matrisString;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                int multi = (matrise[i][j]) * tall;
                System.out.print(multi + " ");
            }
            System.out.println();
        }
        return matrise;
    }

    // d)
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        boolean like = true;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {


                if (mat1.length != mat2.length) {
                    like = false;
                } else if (mat1[i][j] != mat2[i][j]){
                    like = false;

                }


            }
        }
        System.out.println(like);
        return like;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        // TODO
        throw new UnsupportedOperationException("speile ikke implementert");

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("multipliser ikke implementert");

    }

    public static void main(String[] args) {


        skrivUtv1(matrise);
        tilStreng(matrise);
        skaler(8,matrise);
        erLik(mat1,mat2);


    }
}
