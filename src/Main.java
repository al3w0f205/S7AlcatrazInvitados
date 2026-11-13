import java.util.Scanner;

public class Main {

    private static int leerEntero(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorInvitados gestor = new GestorInvitados();
        int opcion;

        do {
            System.out.println();
            System.out.println("=== ALCATRAZ · Lista de invitados ===");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Ver invitado por posición");
            System.out.println("3. Quitar invitado por posición");
            System.out.println("4. Listar invitados");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío.");
                    } else {
                        System.out.print("¿Zona VIP? (s/n): ");
                        boolean vip = sc.nextLine().trim().equalsIgnoreCase("s");
                        gestor.agregar(new Invitado(nombre, vip));
                        System.out.println("Agregado. Total: " + gestor.total());
                    }
                }
                case 2 -> {
                    System.out.print("Posición (1 a " + gestor.total() + "): ");
                    Invitado inv = gestor.obtener(leerEntero(sc) - 1);
                    if (inv == null) {
                        System.out.println("Posición inválida.");
                    } else {
                        System.out.println(inv);
                    }
                }
                case 3 -> {
                    System.out.print("Posición a quitar (1 a " + gestor.total() + "): ");
                    Invitado quitado = gestor.quitar(leerEntero(sc) - 1);
                    if (quitado == null) {
                        System.out.println("Posición inválida.");
                    } else {
                        System.out.println("Se quitó a " + quitado + ". Quedan " + gestor.total());
                    }
                }
                case 4 -> gestor.listar();
                case 5 -> System.out.println("Hasta pronto: ¡que se encienda la noche en Alcatraz!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
