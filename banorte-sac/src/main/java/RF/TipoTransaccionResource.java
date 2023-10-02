package RF;

import com.Banorte.RF09.AvisoNivelPrecio;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/tipo-transaccion")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoTransaccionResource {
    @Inject
    TipoTransaccionRepository ttr;

    @GET
    @Path("listar")
    public List<TipoTransaccion> listarTipoTransaccion() {
        return ttr.getTipoTransaccion();
        //return Response.ok(ar.findAll()).build();
    }
}
