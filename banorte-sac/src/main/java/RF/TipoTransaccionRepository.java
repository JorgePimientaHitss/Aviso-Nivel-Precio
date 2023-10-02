package RF;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class TipoTransaccionRepository {
    @Inject
    EntityManager em;

   public List<TipoTransaccion> getTipoTransaccion(){
        return em.createQuery("select t.transaccion_nombre from TipoTransaccion t where t.transaccion_clave != 'A' ").getResultList();
    }

}
