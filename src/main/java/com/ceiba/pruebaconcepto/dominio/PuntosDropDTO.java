package com.ceiba.pruebaconcepto.dominio;

public class PuntosDropDTO {
	
	private double lng;
	
	private double lat;
	
	private String label;
	
	public PuntosDropDTO(double longitude, double latitude, String labelPlace){
		this.lng=longitude;
		this.lat=latitude;
		this.label=labelPlace;
	}

	public double getLng() {
		return lng;
	}

	public double getLat() {
		return lat;
	}

	public String getLabel() {
		return label;
	}
}
