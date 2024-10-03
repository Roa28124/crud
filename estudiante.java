public abstract class Estudiante{
    String Nombre;
    String Apellido;
    public Estudiante(String nombre, String apellido){
        this.Nombre=nombre;
        this.Apellido=apellido;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getApellido(){
        return this.Apellido;

    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
