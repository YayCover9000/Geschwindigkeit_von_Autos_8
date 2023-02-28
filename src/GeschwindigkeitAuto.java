import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
public class GeschwindigkeitAuto {
    public static void main(String [] args) {
        // TEST
        System.out.println("\t=====\n!TESTTREIBER!\n\tANFANG:\t\n");
        // tests on -1
        int abbruch[] = new int[3];
        //GeschwindigkeitAuto.einlesenGeschwindigkeit(abbruch);

        // End
        System.out.println("\n\tENDE!!\n!TESTTREIBER!\t\n\t=====");

        // main
        int GeschwindigkeitsEingaben[] = new int[3];
        GeschwindigkeitAuto.einlesenGeschwindigkeit(GeschwindigkeitsEingaben);
        GeschwindigkeitAuto.ausgeben(GeschwindigkeitsEingaben);


        /* Input mit weniger Zahlen als Array.length
            23
            5
         */
        /* Input mit mehr Zahlen als Array.length
        67
        43
        85
        2
        69
        */

        /* Input mit Array.length
         124
         233
         54
         */
        /* Input außerhalb der Range
        negative Zahl (except. -1)
        -56
        -43
        -123
        oder:
        4576
        654
        345
         */


    }
    public static void einlesenGeschwindigkeit(int geschwindigkeit[]) {
        /* Die Methode liest Geschwindigkeiten für ein Auto mit ganzzahligen, realistischen Werten ein (d.h. zwischen 1 und 300 km/h, Randwerte einschließlich).
        Die Werte werden, solange eingegeben bis -1 eingegeben wird oder das Array voll ist. */
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean jump = true;
        int input;


        while(jump) {
            for (int i = 0; i < geschwindigkeit.length && !exit;) {
                System.out.println("Gib Geschwindigkeitswerte: ");
                input = scanner.nextInt();
                // Checks if Input -1
                if (input == -1) {
                    exit = true;
                    jump = false;
                } //Checks if in range
                else if (input >= 1 && input <= 300) {
                    geschwindigkeit[i] = input;
                    i++;
                }
            }
        }
        scanner.close();
    }
    public static void ausgeben(@NotNull int geschwindigkeiten[]) {
        System.out.println("Array inhalt: ");
        for (int j : geschwindigkeiten) {
            System.out.println("Geschwindigkeit: " + j + "km/h");
        }
    }
}