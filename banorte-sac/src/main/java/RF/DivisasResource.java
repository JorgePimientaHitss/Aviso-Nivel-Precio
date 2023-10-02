package RF;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/divisas")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DivisasResource {

    @Inject
    DivisasRepository dr;

    @GET
    @Path("listar")
    public List<Divisas> listarDivisas() {
        return dr.getDivisas();
        //return Response.ok(ar.findAll()).build();
    }

}
