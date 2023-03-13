import java.util.Scanner;

public class GeschwindigkeitAuto {
    public static void main(String [] args) {
        // main
        int geschwindigkeitsEingabe[] = new int[3];
        GeschwindigkeitAuto.einlesenGeschwindigkeit(geschwindigkeitsEingabe);
        GeschwindigkeitAuto.ausgeben(geschwindigkeitsEingabe);
    }
    public static void einlesenGeschwindigkeit(int geschwindigkeit[]) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int input;

        System.out.println("Gib Geschwindigkeitswerte: ");
        for (int i = 0; i < geschwindigkeit.length && !exit;) {
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                // Checks if Input -1
                if (input == -1) {
                    exit = true;
                }
                //Checks if in range
                else if (input >= 1 && input <=300) {
                    geschwindigkeit[i] = input;
                    i++;
                };

            }else {
                exit = true;
            }

        }
        scanner.close();
    }
    public static void ausgeben(int geschwindigkeit[]) {
        if(geschwindigkeit == null){
            System.out.println("Array ist leer.");
        }else{
            System.out.println("Array Inhalt: ");
            for (int j : geschwindigkeit){
                System.out.println("Geschwindigkeit: " + j + "km/h");
            }
        }
    }

}
