package com.api.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.spring.model.Factura;

@Repository
	public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
