import java.io.Serializable;

public class Cuidador implements Serializable,Gestionable{
    private static final long serialVersionUID = 1L;
    public String nombre;
    public int edad;
    public String area;

    public Cuidador(String nombre, int edad, String area) {
        this.nombre = nombre;
        this.edad = edad;
        this.area = area;
    }

    public Cuidador(){}

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo(){
        return "Cuidador";
    }

    @Override
    public java.lang.String toString() {
        return "Cuidador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", area='" + area + '\'' +
                '}';
    }
}
