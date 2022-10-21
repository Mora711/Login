public class Cuenta {
    private Usuario usuario;
    private Rol rol;
    private boolean estado;

    public Cuenta(Usuario usuario, Rol rol, boolean estado) {
        this.usuario = usuario;
        this.rol = rol;
        this.estado = estado;
    }

}
