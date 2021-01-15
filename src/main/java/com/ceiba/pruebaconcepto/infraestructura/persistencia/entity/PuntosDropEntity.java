package com.ceiba.pruebaconcepto.infraestructura.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity(name="PUNTOS_DROP")
@NamedQuery(name="Registros" , query="SELECT ptod FROM PUNTOS_DROP ptod")
public class PuntosDropEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name ="LNG")
	private double longitude;
	
	@Column(name ="LAT")
	private double latitude;
	
	@Column(name ="LBL_PLACE")
	private String labelPlace;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getLabelPlace() {
		return labelPlace;
	}

	public void setLabelPlace(String labelPlace) {
		this.labelPlace = labelPlace;
	}
}
