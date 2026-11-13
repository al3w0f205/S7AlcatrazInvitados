import java.util.ArrayList;

public class GestorInvitados {

    private final ArrayList<Invitado> lista = new ArrayList<>();

    public void agregar(Invitado inv) {
        lista.add(inv);
    }

    public Invitado obtener(int posicion) {
        if (posicion < 0 || posicion >= lista.size()) {
            return null;
        }
        return lista.get(posicion);
    }

    public Invitado quitar(int posicion) {
        if (posicion < 0 || posicion >= lista.size()) {
            return null;
        }
        return lista.remove(posicion);
    }

    public int total() {
        return lista.size();
    }

    public int totalVip() {
        int vips = 0;
        for (Invitado inv : lista) {
            if (inv.isVip()) {
                vips++;
            }
        }
        return vips;
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("(la lista está vacía)");
            return;
        }
        int n = 1;
        for (Invitado inv : lista) {
            System.out.println(n + ". " + inv);
            n++;
        }
        System.out.println("Total: " + total() + " · VIP: " + totalVip());
    }
}
