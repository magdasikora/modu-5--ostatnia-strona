package zadanie;

import javax.xml.stream.events.Namespace;

public class Main {

    public static void main(String[] args) {

        // Zadanie domowe a)
        System.out.println("Zadanie domowe a)");


        int val_integer = 250;
        String val_string = "Akademia jest super";
        double val_double = 1.2345555;

        System.out.println("zmienna val_integer ma wartość " + val_integer);
        System.out.println("zmienna val_string ma wartość " + val_string);
        System.out.println("zmienna val_double ma wartość " + val_double);


        System.out.println("...................................................................");

// Zadania domowe b)

        System.out.println("Zadanie domowe b)");

        int[] tabl = {13, 24, 31, 46, 55, 68, 79, 80, 91, 100};

        for (int index = 0; index < 10; index++) {
            if (tabl[index] % 2 == 0) {
                System.out.println("liczba " + tabl[index] + " jest parzysta");
            } else {
                System.out.println(tabl[index]);
            }
        }
        System.out.println("...................................................................");
        // Zadanie domowe c)
        System.out.println("Zadanie domowe c)");

        boolean t = true;
        int sum = 0;
        int a = 0;

        while (t) {
            sum = sum + a++;
            if (a == 501) {
                t = false;
                System.out.println("suma liczb od 1 do 500 wynosi " + sum);
            }
        }

        System.out.println("...................................................................");
        // Zadanie domowe d)
        System.out.println("Zadanie domowe d)");
        {
            int tabl2[] = {5, 1, 4, 3, 5, 5};
            double sum2 = 0;


            for (int index = 0; index < 6; index++) {
                sum2 = sum2 + tabl2[index];
            }
            System.out.println(sum2);
            double aver = sum2 / tabl2.length;
            System.out.println(aver);

            char w ='x';

            char markA = 'A';
            char markB = 'B';
            char markC = 'C';

            if (aver >= 4) { w='A';
                System.out.println(markA);
            } else if (aver >= 3) { w='B';
                System.out.println(markB);
            } else if (aver < 3) {w='C';
                System.out.println(markC);
            }


            switch (w) {
                case 'A':
                    System.out.println(markA + " Świetnie");
                    break;
                case 'B':
                    System.out.println(markB + " Średnio");
                    break;
                case 'C':
                    System.out.println(markC + " Słabo");
                    break;
                default:
                    System.out.println("coś nie tak...");
            }
        }


        System.out.println("...................................................................");
        // Zadanie domowe e)
        System.out.println("Zadanie domowe e)");


        double[] rel = {-1.25, -0.50, 25.6, 2.9, 6.0};

        for (int i = 0; i < rel.length; i++) {
            System.out.println(Math.abs(rel[i]));
        }

        System.out.println("...................................................................");
        // Zadanie domowe f)
        System.out.println("Zadanie domowe f)");


        String name = "Magda";

        if (name.endsWith("a")) {
            System.out.println(sex.WOMAN);
        } else if (!name.endsWith("a") && name.equals("Barnaba")) {
            System.out.println(sex.MAN);
        }
    }
}




































