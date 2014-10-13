package state.connection;

public class Conexion {

    private ConexionEstado conexionEstado;

    public Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setEstado(new Cerrado());
    }

    public Link getLink() {
        return link;
    }

    public void setEstado(ConexionEstado conexionEstado) {
        this.conexionEstado=conexionEstado;
    }
    public Estado getEstado() {
        return conexionEstado.getEstado();
    }

    public void abrir() {
        conexionEstado.abrir(this);
    }

    public void cerrar() {
        conexionEstado.cerrar(this);
    }

    public void parar() {
        conexionEstado.parar(this);
    }

    public void iniciar() {
        conexionEstado.iniciar(this);
    }

    public void enviar(String msg) {
        conexionEstado.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        conexionEstado.recibir(this, respuesta);
    }

}
