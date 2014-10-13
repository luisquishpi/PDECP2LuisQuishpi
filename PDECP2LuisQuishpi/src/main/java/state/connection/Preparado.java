package state.connection;

public class Preparado extends ConexionEstado {

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setEstado(new Cerrado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setEstado(new Parado());
    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setEstado(new Esperando());
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
