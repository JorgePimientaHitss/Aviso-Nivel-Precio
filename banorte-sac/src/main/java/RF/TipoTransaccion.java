package RF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoTransaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transaccion_clave;
    private String transaccion_nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransaccion_clave() {
        return transaccion_clave;
    }

    public void setTransaccion_clave(String transaccion_clave) {
        this.transaccion_clave = transaccion_clave;
    }

    public String getTransaccion_nombre() {
        return transaccion_nombre;
    }

    public void setTransaccion_nombre(String transaccion_nombre) {
        this.transaccion_nombre = transaccion_nombre;
    }
}
