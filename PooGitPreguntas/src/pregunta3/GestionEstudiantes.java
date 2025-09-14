package pregunta3;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionEstudiantes {

    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> estudiantes = new ArrayList<>();
        
        // Agregar al menos 5 nombres a la lista
        estudiantes.add("Ana García");
        estudiantes.add("Carlos Rodríguez");
        estudiantes.add("María López");
        estudiantes.add("Pedro Martínez");
        estudiantes.add("Laura Sánchez");
        
        // Mostrar la lista completa de estudiantes
        System.out.println("Lista completa de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
        
        // Eliminar el tercer nombre (índice 2, ya que las listas empiezan en 0)
        if (estudiantes.size() >= 3) {
            String estudianteEliminado = estudiantes.remove(2);
            System.out.println("\nSe ha eliminado: " + estudianteEliminado);
        } else {
            System.out.println("\nNo hay suficientes elementos para eliminar el tercero.");
        }
        
        // Recorrer la lista nuevamente e imprimir los nombres restantes
        System.out.println("\nLista de estudiantes después de eliminar el tercero:");
        
        // Usando Iterator para recorrer la lista
        Iterator<String> iterator = estudiantes.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
        
        // Alternativa: usando for-each (más simple)
        System.out.println("\nLista usando for-each:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}