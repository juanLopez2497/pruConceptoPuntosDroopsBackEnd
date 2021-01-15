package com.ceiba.pruebaconcepto.infraestructura.persistencia.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ceiba.pruebaconcepto.dominio.PuntosDropDTO;
import com.ceiba.pruebaconcepto.dominio.repositorio.PuntosDropRepository;
import com.ceiba.pruebaconcepto.infraestructura.persistencia.builder.PuntosDropBuilder;
import com.ceiba.pruebaconcepto.infraestructura.persistencia.entity.PuntosDropEntity;

@Repository
public class RepositorioPuntosPersistente implements PuntosDropRepository{
	
	private static final String BUSCA_REGISTROS_ACTIVOS = "Registros";
	
	private EntityManager entityManager;
	
	public RepositorioPuntosPersistente(EntityManager entityManager){
		this.entityManager=entityManager;
	}
	
	@Override
	public List<PuntosDropDTO> listaRegistros() {
		List<PuntosDropDTO> resultList= new ArrayList<>();
		Query queryListPuntosDrop=entityManager.createNamedQuery(BUSCA_REGISTROS_ACTIVOS);
		
		@SuppressWarnings("unchecked")
		List<PuntosDropEntity> entityResult=queryListPuntosDrop.getResultList();
		for (PuntosDropEntity puntosDropIndex : entityResult) {
			resultList.add(PuntosDropBuilder.convertEntityToDTO(puntosDropIndex));
		}
		return resultList;
	}

}
