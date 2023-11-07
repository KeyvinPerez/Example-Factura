package com.api.spring.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.model.DetalleFactura;
import com.api.spring.model.Factura;
import com.api.spring.repository.DetalleFacturaRepository;
import com.api.spring.repository.FacturaRepository;

@Service
	public class FacturaService {
	    @Autowired
	    private FacturaRepository facturaRepository;
	    
	    @Autowired
        private DetalleFacturaRepository detalleFacturaRepository;

	    public Factura guardarFactura(Factura factura) {
	        return facturaRepository.save(factura);
	    }

	   /* public Factura obtenerFactura(Long facturaID) {
	        return facturaRepository.findById(facturaID).orElse(null);
	    }
	    
	        public List<Factura> obtenerTodasLasFacturas() {
	            List<Factura> facturas = facturaRepository.findAll();
	            for (Factura factura : facturas) {
	                List<DetalleFactura> detallesFactura = detalleFacturaRepository.findByFactura(factura);
	                factura.setDetalles(detallesFactura);
	            }
	            return facturas;
	        }*/

	   /* public List<Factura> obtenerTodasLasFacturas() {
	        return facturaRepository.findAll();
	    }*/

	    public void eliminarFactura(Long facturaID) {
	        facturaRepository.deleteById(facturaID);
	    }
	}