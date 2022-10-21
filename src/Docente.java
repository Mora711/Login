import java.util.Date;

public class Docente extends Usuario{
    int sueldo;

    public Docente(String nombre, String primerApellido, String segundoApellido, String ci, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña, int sueldo) {
        super(nombre, primerApellido, segundoApellido, ci, fechaNacimiento, direccion, celular, telefono, email, usuario, contraseña);
        this.sueldo = sueldo;
    }
}
