package com.Banorte.RF09;

import io.quarkus.panache.common.Sort;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/aviso-nivel-precio")
@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AvisoNivelPrecioResource {

    @Inject
    AvisoNivelPrecioRepository ar;

    @GET
    @Path("listar")
    public List<AvisoNivelPrecio> getAll() {
        return ar.listAll(Sort.by("fecha_registro", Sort.Direction.Descending));
        //return Response.ok(ar.findAll()).build();
    }

    @POST
    @Path("agregar")
    public Response create(AvisoNivelPrecio avisoNivelPrecio) {
        ar.persist(avisoNivelPrecio);
        if (ar.isPersistent(avisoNivelPrecio)) {
            return Response.status(201).entity(avisoNivelPrecio).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("modificar/{id}")
    public Response update(@PathParam("id") Long id, AvisoNivelPrecio avisoNivelPrecio) {
        AvisoNivelPrecio obj = ar.findById(id);
        obj.setClave_cliente(avisoNivelPrecio.getClave_cliente());
        obj.setClave_promotor(avisoNivelPrecio.getClave_promotor());
        obj.setDivisa_clave(avisoNivelPrecio.getDivisa_clave());
        obj.setImporte(avisoNivelPrecio.getImporte());
        obj.setPrecio(avisoNivelPrecio.getPrecio());
        obj.setTipo_transaccion(avisoNivelPrecio.getTipo_transaccion());
        ar.persist(obj);
        if (ar.isPersistent(obj)) {
            return Response.status(200).build();
        }
        return Response.status(404).build();

    }

    @DELETE
    @Path("eliminar-avisos")
    public long deleteAll() {
        return ar.deleteAll();

    }

    @DELETE
    @Path("eliminar-avisos/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        boolean deleted = ar.deleteById(id);
        return deleted ? Response.noContent().
                build() : Response.status(200).build();
    }

}
