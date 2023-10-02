package RF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Divisas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String divisa_clave;
    private String divisa_descripcion;
    private BigDecimal diferencial;
    private BigDecimal rango_inferior;
    private BigDecimal rango_superior;
    private Short estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDivisa_clave() {
        return divisa_clave;
    }

    public void setDivisa_clave(String divisa_clave) {
        this.divisa_clave = divisa_clave;
    }

    public String getDivisa_descripcion() {
        return divisa_descripcion;
    }

    public void setDivisa_descripcion(String divisa_descripcion) {
        this.divisa_descripcion = divisa_descripcion;
    }

    public BigDecimal getDiferencial() {
        return diferencial;
    }

    public void setDiferencial(BigDecimal diferencial) {
        this.diferencial = diferencial;
    }

    public BigDecimal getRango_inferior() {
        return rango_inferior;
    }

    public void setRango_inferior(BigDecimal rango_inferior) {
        this.rango_inferior = rango_inferior;
    }

    public BigDecimal getRango_superior() {
        return rango_superior;
    }

    public void setRango_superior(BigDecimal rango_superior) {
        this.rango_superior = rango_superior;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }
}
