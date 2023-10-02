package com.Banorte.RF09;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class AvisoNivelPrecio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clave_cliente;
    private String clave_promotor;
    private String divisa_clave;
    @Column(precision = 10, scale = 2)
    private BigDecimal importe;
    @Column(precision = 10, scale = 2)
    private BigDecimal precio;
    private String tipo_transaccion;
    @CreationTimestamp
    private LocalDateTime fecha_registro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClave_cliente() {
        return clave_cliente;
    }

    public void setClave_cliente(String clave_cliente) {
        this.clave_cliente = clave_cliente;
    }

    public String getClave_promotor() {
        return clave_promotor;
    }

    public void setClave_promotor(String clave_promotor) {
        this.clave_promotor = clave_promotor;
    }

    public String getDivisa_clave() {
        return divisa_clave;
    }

    public void setDivisa_clave(String divisa_clave) {
        this.divisa_clave = divisa_clave;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDateTime fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
