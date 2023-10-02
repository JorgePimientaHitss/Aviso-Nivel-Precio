package RF;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/clientes")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Clientes_PruebaResource {

    @Inject
    Clientes_PruebaRepository cpr;

    @GET
    @Path("listar")
    public List<Clientes_Prueba> listarClientes_Prueba() {
        return cpr.getClientes_Prueba();
        //return Response.ok(ar.findAll()).build();
    }
}
