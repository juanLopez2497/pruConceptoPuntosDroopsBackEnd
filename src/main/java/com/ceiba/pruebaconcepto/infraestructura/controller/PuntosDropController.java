package com.ceiba.pruebaconcepto.infraestructura.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.pruebaconcepto.aplicacion.manejadores.puntosdrop.ManejadorObtenerPuntosDrop;
import com.ceiba.pruebaconcepto.dominio.PuntosDropDTO;

@RestController
@RequestMapping("/registros")
@CrossOrigin(origins = "http://localhost:5000")
public class PuntosDropController {
	private final ManejadorObtenerPuntosDrop manejadorObtenerPuntosDrop;
	
	public PuntosDropController(ManejadorObtenerPuntosDrop manejadorObtenerPuntosDrop){
		this.manejadorObtenerPuntosDrop=manejadorObtenerPuntosDrop;
	}
	
	@GetMapping("/puntosDrop")
	public List<PuntosDropDTO> getListPuntos(@RequestHeader("Authorization") String myHeaderAuth){
		return manejadorObtenerPuntosDrop.listaRegistros();
	}
}
