public class Alumno {

    private String name;
    private String edad;
    private String grado;
    private float nota;

    public Alumno() {

    }

    public Alumno(String name, String edad, String grado, String nota) {
        this.name = name;
        this.edad = edad;
        this.grado = grado;
        this.nota = Float.parseFloat(nota);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getgrado() {
        return grado;
    }

    public void setgrado(String grado) {
        this.grado = grado;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = Float.parseFloat(nota);
    }


    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                ", edad='" + edad + '\'' +
                ", grado='" + grado + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
