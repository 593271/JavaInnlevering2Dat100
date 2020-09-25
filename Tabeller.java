package academy.learnprogramming;

public class Tabeller {

    private static int[] tabell = {7, 17, 20, 4, 8, 12};
    private static int tall = 7;
    private static int[] tabell1 = {1, 2, 3, 4};
    private static int[] tabell2 = {5, 6, 7, 8, 8};


    // a)
    public static void skrivUt(int[] tabell) {

        System.out.print("[ ");
        for (int tall : tabell) {
            System.out.print(tall + " ");
        }
        System.out.println(" ]");

    }

    // b)
    // fant ikke ut hvordan vi skulle løse denne uten bruk av void
    public static void tilStreng(int[] tabell) {

        System.out.print("[ ");
        for (int i : tabell) {
            String strTabell = Integer.toString(i);
            System.out.print(strTabell + " ");


        }
        System.out.println(" ]");


    }

    // c)
    // lagde 3 forskjellige metoder for de forskjellige variantene av metoden: vanlig for løkke, while løkke og utvidet for løkke.
    public static int summer(int[] tabell) {

        System.out.print("[ ");
        int sum = 0;
        for (int tall : tabell) {
            sum = sum + tall;
            System.out.print(tall + " ");

        }
        System.out.println(" ]");
        System.out.print(" " + "Summen av tabellen med enhanced for loop blir: " + sum + " ");


        return tabell.length;


    }

    public static int summer2(int[] tabell) {

        int sum2 = 0;
        int i = 0;
        while (i < tabell.length) {
            sum2 = sum2 + tabell[i];
            i++;

        }
        System.out.println(" ");
        System.out.print(" " + "Summen av tabellen med while loop blir: " + sum2 + " ");

        return sum2;


    }

    public static int summer3(int[] tabell) {

        int sum3 = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum3 = sum3 + tabell[i];


        }
        System.out.println(" ");
        System.out.println(" " + "Summen av tabellen med en vanlig for loop blir: " + sum3 + " ");
        return sum3;


    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        boolean success = true;
        for (int i = 0; i < tabell.length; i++) {


            if (tall == tabell[i]) {
                success = true;
                break;
            } else {
                success = false;
            }
        }
        System.out.println(success);
        return success;

    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        int positionNumber = 0;
        for (int i = 0; i < tabell.length; i++) {

            if (tall == tabell[i]) {
                // den sier at 8 er i posisjon 2 og det er riktig siden det starter på posisjon 0.
                System.out.println("Tallet " + tall + " er i posisjon " + i + " på tabellen");
                positionNumber = i;
                break;

            } else if (tall != tabell[i]) {

                positionNumber = -1;


            }
        }
        System.out.println(positionNumber);


        return positionNumber;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        System.out.print("[ ");


        for (int i = tabell.length - 1; i >= 0; i--) {
            System.out.print(tabell[i] + " ");

        }


        System.out.println(" ]");

        return tabell;


    }

    // g)
    public static boolean erSortert(int[] tabell) {
        boolean sortert = true;
        int mindrearray = tabell[0];
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < mindrearray) {
                sortert = false;
            }
            mindrearray = tabell[i];
        }
        System.out.println(sortert);
        return sortert;
    }

    // h)
    // vi fant ikke ut hvordan vi skulle klare at returne den nye tabellen uten at den ble "kryptert" (Eks: I@3941a79c)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int length = tabell1.length + tabell2.length;


        int[] result = new int[length];

        int pos = 0;
        for (int element : tabell1) {
            result[pos] = element;
            pos++;
        }

        for (int element : tabell2) {
            result[pos] = element;
            pos++;
        }


        System.out.print("[ ");
        for (int tall1 : tabell1) {
            System.out.print(tall1 + " ");

        }


        for (
                int tall2 : tabell2) {

            System.out.print(tall2 + " ");

        }

        System.out.println(" ]");

        return result;

    }

    public static void main(String[] args) {

        skrivUt(tabell);
        tilStreng(tabell);
        summer(tabell);
        summer2(tabell);
        summer3(tabell);
        finnesTall(tabell, tall);
        posisjonTall(tabell, tall);
        reverser(tabell);
        erSortert(tabell);
        settSammen(tabell1, tabell2);


    }
}
