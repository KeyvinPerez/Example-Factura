package com.api.spring.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

/*import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Facturas")
	public class Factura {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="FacturaID")
	    private Long facturaID;
	    
	    @Column(name="Nit")
	    private String nit;
	    
	    @Column(name="Nombre")
	    private String nombre;
	    
	    @Column(name="Fecha")
	    private Date fecha;
	    
	    @Column(name="Correlativo")
	    private int correlativo;

	    @OneToMany(mappedBy = "factura")
	    private List<DetalleFactura> detalles;*/

		
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="factura_id")
    private Long facturaId;

    @Column(name="correlativo")
    private Integer correlativo;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="cliente_id")
    private Long clienteId;

    @Column(name="nit")
    private String nit;

    @Column(name="nombre")
    private String nombre;
    
    @Column(name="total")
    private BigDecimal total;

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}