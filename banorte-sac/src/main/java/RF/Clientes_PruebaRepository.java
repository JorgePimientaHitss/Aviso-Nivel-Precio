package RF;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class Clientes_PruebaRepository {

    @Inject
    EntityManager em;

    public List<Clientes_Prueba> getClientes_Prueba(){
        return em.createQuery("select c.clave_sic, c.nombre_razon_social  from Clientes_Prueba c order by c.id asc ").getResultList();
    }
}
