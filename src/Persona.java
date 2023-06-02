public class Persona {

    private char sexo;
    private String nombre;
    private int edad;

    public Persona(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

   
    // public int getEdad() {
    //     return edad;
    // }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return "Soy: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public void decirEdad(){
        System.out.println("I´m " + edad + " years old");
    }



}