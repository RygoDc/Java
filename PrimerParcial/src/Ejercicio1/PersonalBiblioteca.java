package Ejercicio1;

import java.io.Serializable;

public class PersonalBiblioteca implements Serializable,GestionableBiblioteca{
    private static final long serialVersionUID = 1L;
    public String nombre;
    public String puesto;
    public int horasTrabajo;

    public PersonalBiblioteca(String nombre, String puesto, int horasTrabajo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.horasTrabajo = horasTrabajo;
    }

    public PersonalBiblioteca(){}

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipo() {
        return "Personal de Biblioteca";
    }

    @Override
    public String toString() {
        return "PersonalBiblioteca{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", horas de Trabajo=" + horasTrabajo +
                '}';
    }
}
