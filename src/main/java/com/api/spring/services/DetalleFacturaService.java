package com.api.spring.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.spring.model.DetalleFactura;
import com.api.spring.repository.DetalleFacturaRepository;

@Service
	public class DetalleFacturaService {
	    @Autowired
	    private DetalleFacturaRepository detalleFacturaRepository;

	    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura) {
	        return detalleFacturaRepository.save(detalleFactura);
	    }

	    /*public List<DetalleFactura> obtenerDetallesPorFactura(Long facturaID) {
	        return detalleFacturaRepository.findByFactura_FacturaID(facturaID);
	    }*/

	    public void eliminarDetalleFactura(Long detalleID) {
	        detalleFacturaRepository.deleteById(detalleID);
	    }
	}