import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void mostrarItems() {
        System.out.println("Acciones\n--------");
        for (Item item : items) {
            item.mostrarInfo();
        }
    }

    public void usarItem(int id, Mascota mascota) {
        if (id < items.size() && items.get(id) != null) {
            items.get(id).usar(mascota);
            if (items.get(id).cantidad <= 0) {
                items.remove(id);
            }
        }
    }
}
