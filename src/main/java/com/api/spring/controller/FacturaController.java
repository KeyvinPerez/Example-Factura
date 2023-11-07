package com.api.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.spring.model.Factura;
import com.api.spring.repository.FacturaRepository;
import com.api.spring.services.FacturaService;

@RestController
	@RequestMapping("/facturas")
	public class FacturaController {
	    @Autowired
	    private FacturaService facturaService;

	    @Autowired
	    private FacturaRepository facturaRepository;
	    
	    
	    @GetMapping
	    public List<Factura> getAllFacturas() {
	        return facturaRepository.findAll();
	    }
	    
	    @Autowired
	    public FacturaController(FacturaRepository facturaRepository) {
	        this.facturaRepository = facturaRepository;
	    }

	    @PostMapping("/facturas")
	    public Factura guardarFactura(@RequestBody Factura factura) {
	        return facturaRepository.save(factura);
	    }

	    @PutMapping("/facturas/{id}")
	    public Factura modificarFactura(@PathVariable Long id, @RequestBody Factura factura) {
	        factura.setFacturaId(id);
	        return facturaRepository.save(factura);
	    }

	    @DeleteMapping("/facturas/{id}")
	    public void eliminarFactura(@PathVariable Long id) {
	        facturaRepository.deleteById(id);
	    }

	    
	}