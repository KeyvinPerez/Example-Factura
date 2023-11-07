package com.api.spring.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Table(name = "detalles_factura")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="detalle_id")
    private Long detalleId;

    @Column(name="factura_id")
    private Long facturaId;

    @Column(name="producto")
    private String producto;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="monto_total")
    private BigDecimal montoTotal;

    @ManyToOne
    @NotFound ( action = NotFoundAction.IGNORE )
    @JoinColumn(name = "factura_id", referencedColumnName = "factura_id", insertable = false, updatable = false)
    private Factura factura;
    
    public Long getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Long detalleId) {
        this.detalleId = detalleId;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Factura getFactura() {
        return factura;
    }



/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="DetallesFactura")
public class DetalleFactura {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="DetalleID")
	    private Long detalleID;
	    
	    @Column(name="Producto")
	    private String producto;
	    
	    @Column(name="Cantidad")
	    private double cantidad;
	    
	    @Column(name="MontoTotal")
	    private double montoTotal;
	    
	    @ManyToOne
	    @JoinColumn(name = "facturaID")
	    @JsonIgnore
	    private Factura factura;

	    public Factura getFactura() {return factura;}
	    public void setFactura(Factura factura) {this.factura = factura;}

		public Long getDetalleID() {return detalleID;}
		public void setDetalleID(Long detalleID) {this.detalleID = detalleID;}

		public String getProducto() {return producto;}
		public void setProducto(String producto) {this.producto = producto;}

		public double getCantidad() {return cantidad;}
		public void setCantidad(double cantidad) {this.cantidad = cantidad;}

		public double getMontoTotal() {return montoTotal;}
		public void setMontoTotal(double montoTotal) {this.montoTotal = montoTotal;}*/
}
