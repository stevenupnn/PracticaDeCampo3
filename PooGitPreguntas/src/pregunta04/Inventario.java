package pregunta04;

import java.util.ArrayList;

public class Inventario {
    // Clase interna para representar productos
    private static class Producto {
        String nombre;
        double precio;
        int cantidad;

        // Constructor para productos con nombre, precio y cantidad
        Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad;
        }
    }

    // ArrayList para almacenar los productos
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Método para agregar producto con solo nombre (precio y cantidad por defecto a 0)
    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre, 0.0, 0));
        System.out.println("Producto agregado: " + nombre);
    }

    // Método para agregar producto con nombre y precio (cantidad por defecto a 0)
    public void agregarProducto(String nombre, double precio) {
        // Validar que el precio no sea negativo
        if (precio < 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser negativo");
        }
        productos.add(new Producto(nombre, precio, 0));
        System.out.println("Producto agregado: " + nombre + " con precio: $" + precio);
    }

    // Método para agregar producto con nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        // Validar que el precio y la cantidad no sean negativos
        if (precio < 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser negativo");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("Error: La cantidad no puede ser negativa");
        }
        productos.add(new Producto(nombre, precio, cantidad));
        System.out.println("Producto agregado: " + nombre + " con precio: $" + precio + " y cantidad: " + cantidad);
    }

    // Método para mostrar todos los productos en el inventario
    public void mostrarInventario() {
        System.out.println("\n--- INVENTARIO ACTUAL ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    // Método main para demostrar el uso de la clase
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            // Agregar productos usando los diferentes métodos sobrecargados
            inventario.agregarProducto("Lápiz");
            inventario.agregarProducto("Cuaderno", 5.99);
            inventario.agregarProducto("Borrador", 1.50, 25);
            
            // Intentar agregar un producto con precio negativo (debe lanzar excepción)
            // inventario.agregarProducto("Producto Erróneo", -2.99);
            
            // Intentar agregar un producto con cantidad negativa (debe lanzar excepción)
            // inventario.agregarProducto("Otro Producto Erróneo", 3.99, -5);
            
            // Mostrar el inventario completo
            inventario.mostrarInventario();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}