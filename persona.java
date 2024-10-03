public class persona extends Estudiante {

    Float nota;


    public persona(String Nombre, Float nota, String Apellido) {
    super(Nombre,Apellido);
    this.nota = nota;
}
    @Override
    public String toString() {
        return "Nombre: " + Nombre + "\nApellido:"+Apellido+ "\nNota: " + nota+"\n------------";
    }
}
