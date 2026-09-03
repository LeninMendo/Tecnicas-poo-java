public class Lista {
    private static Nodo primerNodo;
    private Nodo ultimoNodo;
    private Object dato;

    public Lista() {
        primerNodo = ultimoNodo = null;
    }
    public static boolean EstaVacia() {
        return primerNodo == null;
    }

    public void IngresarEstudiante(Object estudiante) {
        if (EstaVacia()) {
            primerNodo = ultimoNodo = new Nodo(estudiante, null);
        } else {
            Nodo nuevoNodo = new Nodo(estudiante, primerNodo);
            primerNodo = nuevoNodo;
        }
    }


    public void BuscarEstudiante(int codigoBuscar) {
        Nodo recorrer = primerNodo;
        while (recorrer != null) {
            Estudiante estudianteBuscar = (Estudiante) recorrer.getDato();
            if (estudianteBuscar.getCodigo() == codigoBuscar) {
                System.out.println("Elemento encontrado!");
                return;
            }
            recorrer = recorrer.getPuntero();
        }
        System.out.println("No se encontro el elemento");
    }

    public void MostrarEstudiantePorCodigo(int codigoBuscar) {
        if (EstaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo recorrer = primerNodo;
        while (recorrer != null) {
            // Extraemos el estudiante del nodo actual
            Estudiante estudiante = (Estudiante) recorrer.getDato();

            // Comparamos el código del estudiante con el que estamos buscando
            if (estudiante.getCodigo() == codigoBuscar) {
                System.out.println("\n=== Estudiante Encontrado ===");
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Código: " + estudiante.getCodigo());
                // Mostramos su promedio
                System.out.println("Promedio: " + estudiante.promedio());
                System.out.println("=============================");
                return;
            }
            recorrer = recorrer.getPuntero();
        }
        System.out.println("No se encontró ningún estudiante con el código: " + codigoBuscar);
    }

}
