package AnimalesSerializables2;

import java.io.Serializable;

public class Cuidador implements Gestionable, Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int edad;
    private String areaResponsable;

    public Cuidador(String name, int edad, String areaResponsable) {
        this.name = name;
        this.edad = edad;
        this.areaResponsable = areaResponsable;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return "Cuidador";
    }

    public int getEdad() {
        return edad;
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }

    @Override
    public String toString() {
        return "Cuidador{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", areaResponsable='" + areaResponsable + '\'' +
                '}';
    }
}
