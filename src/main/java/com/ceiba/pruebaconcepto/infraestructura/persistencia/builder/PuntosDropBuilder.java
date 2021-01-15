package com.ceiba.pruebaconcepto.infraestructura.persistencia.builder;

import com.ceiba.pruebaconcepto.dominio.PuntosDropDTO;
import com.ceiba.pruebaconcepto.infraestructura.persistencia.entity.PuntosDropEntity;

public final class PuntosDropBuilder {
	
	private PuntosDropBuilder(){}
	
	public static PuntosDropDTO convertEntityToDTO(PuntosDropEntity puntosDropEntity){
		return new PuntosDropDTO(puntosDropEntity.getLongitude(), puntosDropEntity.getLatitude(),puntosDropEntity.getLabelPlace());
	}
}
