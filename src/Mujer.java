public class Mujer extends Persona {   

    public Mujer(char sexo, String nombre) {
        super(sexo);
        super.setNombre(nombre);
    }

    @Override
    public void decirEdad(){
        System.out.println(".......");
        super.decirEdad();
    }
}
