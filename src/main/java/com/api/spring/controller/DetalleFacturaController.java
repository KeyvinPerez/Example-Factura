package com.api.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.spring.model.DetalleFactura;
import com.api.spring.services.DetalleFacturaService;

	@RestController
	@RequestMapping("/detallesfactura")
	public class DetalleFacturaController {
	    @Autowired
	    private DetalleFacturaService detalleFacturaService;

	    @PostMapping
	    public DetalleFactura crearDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
	        return detalleFacturaService.guardarDetalleFactura(detalleFactura);
	    }

	    /*@GetMapping("/factura/{facturaID}")
	    public List<DetalleFactura> obtenerDetallesPorFactura(@PathVariable Long facturaID) {
	        return detalleFacturaService.obtenerDetallesPorFactura(facturaID);
	    }*/

	    @DeleteMapping("/{detalleID}")
	    public void eliminarDetalleFactura(@PathVariable Long detalleID) {
	        detalleFacturaService.eliminarDetalleFactura(detalleID);
	    }
	
}
