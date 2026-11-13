import java.util.ArrayList;
import java.util.Iterator;

public class Laboratorio {

    public static void main(String[] args) {
        System.out.println("=== ALCATRAZ · Lista de invitados ===");

        String[] fila = new String[3];
        fila[0] = "Ana";
        fila[1] = "Luis";
        fila[2] = "Marco";
        System.out.println("Capacidad del arreglo: " + fila.length);

        ArrayList<String> invitados = new ArrayList<>();
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Marco");
        invitados.add("Sofía");

        System.out.println("Invitados: " + invitados.size());
        System.out.println("Primero de la lista: " + invitados.get(0));
        System.out.println("Lista completa: " + invitados);

        int posicion = 1;
        if (posicion >= 0 && posicion < invitados.size()) {
            String quitado = invitados.remove(posicion);
            System.out.println("Se quitó a " + quitado + " → quedan " + invitados.size());
        } else {
            System.out.println("Posición inválida");
        }
        System.out.println(invitados);

        System.out.println("--- Lista de Alcatraz ---");
        int n = 1;
        for (String nombre : invitados) {
            System.out.println(n + ". " + nombre);
            n++;
        }

        ArrayList<String> prueba = new ArrayList<>(invitados);
        Iterator<String> it = prueba.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(prueba);

        ArrayList<Invitado> lista = new ArrayList<>();
        lista.add(new Invitado("Ana", true));
        lista.add(new Invitado("Marco", false));
        lista.add(new Invitado("Sofía", true));

        int vips = 0;
        for (Invitado inv : lista) {
            System.out.println(inv);
            if (inv.isVip()) {
                vips++;
            }
        }
        System.out.println("Invitados VIP: " + vips + " de " + lista.size());
    }
}
