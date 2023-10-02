package RF;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class DivisasRepository {

    @Inject
    EntityManager em;

    public List<Divisas> getDivisas(){
        return em.createQuery("select d.divisa_clave from Divisas d order by d.id asc ").getResultList();
    }
}
