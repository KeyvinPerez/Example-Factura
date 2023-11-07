package com.api.spring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.spring.model.DetalleFactura;
import com.api.spring.model.Factura;

/*public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {
	@Query("SELECT df FROM DetalleFactura df WHERE df.factura.facturaID = :facturaID")
	public List<DetalleFactura> obtenerDetallesPorFactura(@Param("facturaID") Long facturaID);

	public List<DetalleFactura> findByFactura_FacturaID(Long facturaID);
	
}*/

@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {

    List<DetalleFactura> findByFactura(Factura factura);
}

