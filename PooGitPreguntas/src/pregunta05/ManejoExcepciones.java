package pregunta05;

import java.util.Scanner;

// Excepción personalizada para números negativos
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ManejoExcepciones {

    public static void main(String[] args) {
        // Usar try-with-resources para manejar automáticamente el cierre del Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número entero
            System.out.print("Por favor, ingrese un número entero positivo: ");
            String entrada = scanner.nextLine();
            
            // Convertir la entrada a número entero
            int numero = Integer.parseInt(entrada);
            
            // Verificar si el número es negativo
            if (numero < 0) {
                throw new NumeroNegativoException("Error: No se permiten números negativos");
            }
            
            // Si todo está bien, mostrar el número
            System.out.println("Número ingresado correctamente: " + numero);
            
        } catch (NumberFormatException e) {
            // Manejar la excepción de formato numérico incorrecto
            System.out.println("Error: Debe ingresar un número entero válido");
        } catch (NumeroNegativoException e) {
            // Manejar la excepción personalizada de número negativo
            System.out.println(e.getMessage());
        }
        // El Scanner se cierra automáticamente gracias a try-with-resources
    }
}