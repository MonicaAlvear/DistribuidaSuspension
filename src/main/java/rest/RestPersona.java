package rest;

import entidades.Persona;
import servicios.PersonaServicios;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;


public class RestPersona {
    private static PersonaServicios servicios;

    public static void main(String[] args) {

        port(9090);

        get("/ListarTodos", (req, res) -> {
                    JsonObjectBuilder jsonReturn = null;
                    res.status(200);
                    res.type("application/json");
                    List<Persona> personita = servicios.litarTodos();
                    for (int i = 0; i < personita.size(); i++) {
                        jsonReturn = Json.createObjectBuilder()
                                .add("id", personita.get(i).getIdPersona())
                                .add("identificacion", personita.get(i).getIdentificacion())
                                .add("nombre", personita.get(i).getNombre())
                                .add("fechaNacimiento", personita.get(i).getFechaNacimiento())
                                .add("direccion", personita.get(i).getDireccion().toString());
                    }
                    return jsonReturn;
                }
        );

        get("/ListarPor/:id", (req, res)->{

                    res.status(200);
                    res.type("application/json");
                    Persona personita =  servicios.obtenerPersona(Long.parseLong(req.params(":id")));
                    JsonObjectBuilder jsonReturn = Json.createObjectBuilder()
                            .add("id", personita.getIdPersona())
                            .add("identificacion", personita.getIdentificacion())
                            .add("nombre", personita.getNombre())
                            .add("fechaNacimiento", personita.getFechaNacimiento())
                            .add("direccion", personita.getDireccion().toString());
        return jsonReturn;
        }
        );


    }
}
