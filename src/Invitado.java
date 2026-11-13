public class Invitado {

    private String nombre;
    private boolean vip;

    public Invitado(String nombre, boolean vip) {
        this.nombre = nombre;
        this.vip = vip;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public String toString() {
        return nombre + (vip ? " (VIP)" : " (General)");
    }
}
