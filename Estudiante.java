public class Estudiante {

    private int codigo, nota1 , nota2;
    private String nombre;

    public Estudiante(String nom, int cod, int n1, int n2){
        nombre = nom;
        codigo = cod;
        nota1 = n1;
        nota2 = n2;
    }

    public double promedio (){
        return (nota1 + nota2) / 2.0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

}
