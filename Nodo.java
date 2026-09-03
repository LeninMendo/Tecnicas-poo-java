public class Nodo {
    private Object dato;
    private Nodo puntero;

    public Nodo(Object dato, Nodo puntero) {
        this.dato = dato;
        this.puntero = puntero;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPuntero() {
        return puntero;
    }

    public void setPuntero(Nodo puntero) {
        this.puntero = puntero;
    }
}
