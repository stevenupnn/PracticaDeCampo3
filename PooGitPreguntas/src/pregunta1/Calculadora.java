package pregunta1;

public class Calculadora {

    // Método para sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado para sumar tres enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecargado para sumar dos números decimales
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Demostración de los métodos sobrecargados
        System.out.println("Suma de dos enteros (5 + 3): " + sumar(5, 3));
        System.out.println("Suma de tres enteros (4 + 2 + 7): " + sumar(4, 2, 7));
        System.out.println("Suma de dos decimales (6.3 + 1.7): " + sumar(6.3, 1.7));
    }
}