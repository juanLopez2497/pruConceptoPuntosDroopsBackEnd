package com.ceiba.pruebaconcepto.aplicacion.manejadores.puntosdrop;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.pruebaconcepto.dominio.PuntosDropDTO;
import com.ceiba.pruebaconcepto.dominio.servicio.puntosdrop.ServicioObtenerPuntosDrop;

@Component
public class ManejadorObtenerPuntosDrop {
	private final ServicioObtenerPuntosDrop servicioObtenerPuntosDrop;
	
	public ManejadorObtenerPuntosDrop(ServicioObtenerPuntosDrop servicioObtenerPuntosDrop){
		this.servicioObtenerPuntosDrop=servicioObtenerPuntosDrop;
	}
	
	public List<PuntosDropDTO> listaRegistros(){
		return servicioObtenerPuntosDrop.listRegistros();
	}
}
