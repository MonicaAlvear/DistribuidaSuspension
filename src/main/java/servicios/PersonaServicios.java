package servicios;

import baseDatos.ConexionBase;
import entidades.Persona;
import org.sql2o.Connection;

import java.util.List;

public class PersonaServicios {

    public List<Persona> litarTodos() {
        String sql = "select * from Persona;";
        try (Connection cn = ConexionBase.sql2o.open()) {
            return ((org.sql2o.Connection) cn).createQuery(sql).executeAndFetch(Persona.class);
        }
    }

    public Persona obtenerPersona(long id) {
        String sql = "select * from Persona where id=:id;";
        try (Connection cn = ConexionBase.sql2o.open()) {
            Persona persona = cn.createQuery(sql).addParameter("id", id).executeAndFetchFirst(Persona.class);
            return persona;
        }
    }

    public void eliminarPersona(long id) {
        String sql = "delete from Persona where id=:id";
        try (Connection cn = ConexionBase.sql2o.open()) {
            cn.createQuery(sql).addParameter("id", id).executeAndFetchTable();
        }
    }

    public void crearNuevo(Persona persona) {
        String sql = "insert INTO Persona VALUES (:id,:identificacion,:nombre,:fechaNacimiento,:direccion);";
        try (Connection cn = ConexionBase.sql2o.open()) {
            cn.createQuery(sql).addParameter("id", persona.getIdPersona())
                    .addParameter("identificacion", persona.getIdentificacion())
                    .addParameter("nombre", persona.getNombre())
                    .addParameter("fechaNacimiento", persona.getFechaNacimiento())
                    .addParameter("direccion", persona.getDireccion())
                    .executeUpdate();
        }
    }

    public void actualizarPersona(Persona persona) {
        String sql = "update Persona set identificacion=:identificacion, nombre=:nombre, " +
                "fechaNacimiento=:fechaNacimiento, direccion=:direccion where id=:id;";
        try (Connection cn = ConexionBase.sql2o.open()) {
            cn.createQuery(sql).addParameter("identificacion", persona.getIdentificacion())
                    .addParameter("nombre", persona.getNombre())
                    .addParameter("fechaNacimiento", persona.getFechaNacimiento())
                    .addParameter("direccion", persona.getDireccion())
                    .addParameter("id", persona.getIdPersona())
                    .executeUpdate();
        }
    }
}
