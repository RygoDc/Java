package AnimalesSerializables2;

import java.io.Serializable;

public abstract class Animal implements Serializable, Gestionable {

    private static final long serialVersionUID = 1L;

    protected String name;
    protected int edad;

    public Animal(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName(){
        return this.name;
    }

    abstract int getEdad();

    public String getTipo(){
        return "Animal";
    }

}
