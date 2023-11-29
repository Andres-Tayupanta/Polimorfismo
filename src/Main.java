import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();
        Producto producto = new Producto("Producto generico 1", 2.3);
        Alimento alimento = new Alimento("Leche",0.5,"30/12/2023","23/11/2023");

        Producto producto1 = (Producto) alimento;

        listaProductos.add(producto);
        listaProductos.add(alimento);

    }
}