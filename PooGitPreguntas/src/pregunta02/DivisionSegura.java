package pregunta02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        // Usar try-with-resources para manejar automáticamente el cierre del Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar el primer número al usuario
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();
            
            // Solicitar el segundo número al usuario
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();
            
            // Realizar la división y mostrar el resultado
            int resultado = dividir(numero1, numero2);
            System.out.println("Resultado de la división: " + resultado);
            
        } catch (ArithmeticException e) {
            // Manejar la excepción de división por cero
            System.out.println("Error: división entre cero no permitida");
        } catch (InputMismatchException e) {
            // Manejar la excepción de entrada no válida
            System.out.println("Error: debe ingresar números enteros válidos");
        }
    }
    
    /**
     * Método para dividir dos números enteros con manejo de excepción
     * @param dividendo El número que será dividido
     * @param divisor El número por el cual se divide
     * @return El resultado de la división
     * @throws ArithmeticException Si el divisor es cero
     */
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return dividendo / divisor;
    }
}