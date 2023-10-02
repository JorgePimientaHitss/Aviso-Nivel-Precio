package RF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clientes_Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clave_sic;
    private String nombre_razon_social;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClave_sic() {
        return clave_sic;
    }

    public void setClave_sic(String clave_sic) {
        this.clave_sic = clave_sic;
    }

    public String getNombre_razon_social() {
        return nombre_razon_social;
    }

    public void setNombre_razon_social(String nombre_razon_social) {
        this.nombre_razon_social = nombre_razon_social;
    }
}
