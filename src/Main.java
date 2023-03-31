import java.util.Scanner;

public class Main {
    final static int maxAlumnos = 10;

    public static void main(String[] args) {
        System.out.println("bienvenido al sistema de gestion de alumnos de una clase");
        boolean salir = false;
        String alumnos[] = new String[maxAlumnos];
        int numLista;

        while (!salir) {
            System.out.println("elija una opcion:");
            displayMenu();
            Scanner sc = new Scanner(System.in);
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (int i = 0; i < maxAlumnos; i++) {
                        System.out.println("introduzca el numero de lista que desea introducir");
                        sc = new Scanner(System.in);
                        numLista = sc.nextInt();
                        numLista = numLista -1;

                        System.out.println("ahora introduzca el nombre del alumno con numero de lista " + (numLista+1));
                        sc = new Scanner(System.in);
                        String nombre = sc.nextLine();

                        alumnos[numLista] = nombre;

                        for (int j = 0; j < maxAlumnos; j++) {
                            if (alumnos[j] == null) {
                                System.out.println((j + 1) + "- ");
                            } else {
                                System.out.println((j + 1) + "- " + alumnos[j]);
                            }
                        }
                        System.out.println("");

                        System.out.println("si NO desea añadir mas alumnos pulse 1, si desea añadir mas pulse cualquier tecla:");
                        sc = new Scanner(System.in);
                        opcion = sc.nextLine();
                        if (opcion.equals("1")) {
                            i = maxAlumnos;
                        }
                    }
                    break;

                case "2":
                    System.out.println("introduzca el numero de lista del alumno que desea eliminar:");
                    sc = new Scanner(System.in);
                    numLista = sc.nextInt();
                    numLista = numLista -1;
                    alumnos[numLista] = "";

                    for (int i = 0; i < maxAlumnos; i++) {
                        if (alumnos[i] == null) {
                            System.out.println((i + 1) + "- ");
                        } else {
                            System.out.println((i + 1) + "- " + alumnos[i]);
                        }
                    }
                    System.out.println("");
                    break;

                case "3":
                    System.out.println("Los alumnos actualmente son:");
                    for (int i = 0; i < maxAlumnos; i++) {
                        if (alumnos[i] == null) {
                            System.out.println((i + 1) + "- ");
                        } else {
                            System.out.println((i + 1) + "- " + alumnos[i]);
                        }
                    }
                    System.out.println("");
                    break;

                case "q":
                    salir = true;
                    break;

                case "Q":
                    salir = true;
                    break;
                default:
                    System.out.println("procura poner una opcion del tipo numerla o 'q' para salir");
            }
        }
    }
    private static void displayMenu() {
        System.out.println("1. Añadir a un alumno\n" +
                "2. Eliminar a un alumno\n" +
                "3. Mostrar alumnos\n" +
                "Q → Salir del programa.");
    }
}
