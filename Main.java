import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista lista = new Lista();

        String nombre;
        int codigo, nota1 , nota2;
        int opcion = 0;
        Estudiante estudiante;

        while (opcion != 3) {
            System.out.println("Seleccione una opción: \n" +
                    "1. Registrar estudiante.\n" +
                    "2. Buscar estudiante.\n" +
                    "3. Salir\n");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un nombre:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese codigo");
                    codigo = Integer.parseInt(scanner.nextLine());// Convertimos el texto a entero
                    System.out.println("Ingrese nota 1");
                    nota1 = Integer.parseInt(scanner.nextLine());// Convertimos el texto a entero
                    System.out.println("Ingrese nota 2");
                    nota2 = Integer.parseInt(scanner.nextLine());// Convertimos el texto a entero
                    estudiante = new Estudiante(nombre, codigo, nota1, nota2);

                    lista.IngresarEstudiante(estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del estudiante a buscar:");
                    int codigoBuscar = Integer.parseInt(scanner.nextLine());// Convertimos el texto a entero
                    lista.MostrarEstudiantePorCodigo(codigoBuscar);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}