package com.ceiba.pruebaconcepto.dominio.servicio.puntosdrop;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.pruebaconcepto.dominio.PuntosDropDTO;
import com.ceiba.pruebaconcepto.dominio.repositorio.PuntosDropRepository;

@Component
public class ServicioObtenerPuntosDrop {
	private final PuntosDropRepository puntosDropRepository;
	
	public ServicioObtenerPuntosDrop(PuntosDropRepository puntosDropRepository){
		this.puntosDropRepository=puntosDropRepository;
	}
	
	public List<PuntosDropDTO> listRegistros(){
		return puntosDropRepository.listaRegistros();
	}
}
