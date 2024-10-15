import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for(int numero: numeros){
            System.out.println(numero);
        }

        ArrayList<Character> letras = new ArrayList<>();

        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');

        for(char letra : letras){
            System.out.println(letra);
        }

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan",25,70));
        personas.add(new Persona("Julio",30,76));
        personas.add(new Persona("Marcos",40,75));
        personas.add(new Persona("Kike",21,72));

        for (Persona persona : personas){
            System.out.println(persona.toString());
        }
        System.out.println();
        System.out.println(personas.get(1));

        System.out.println();
        for(Persona persona : personas){
            if (persona.getNombre().equals("Kike")){
                System.out.println(persona.toString());
            }
        }

        System.out.println();
        boolean salir = false;
        int cont =0;
        while (!salir && cont < personas.size()){
            if(personas.get(cont).getNombre().equals("Marcos")){
                System.out.println("While: " + personas.get(cont).toString());
                salir = true;
            }
            else {
                System.out.println("Persona no valida: " + personas.get(cont).toString());
            }
            cont++;

        }

        }
    }

