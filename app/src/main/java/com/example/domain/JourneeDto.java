package com.example.domain;

import java.io.Serializable;
import java.util.List;

public class JourneeDto implements Serializable {

	public JourneeDto(){
	}

	public JourneeDto(Integer numeroJournee, List<PlateauDto> plateaux) {
		this.numeroJournee = numeroJournee;
		this.plateaux = plateaux;
	}

	private Integer numeroJournee;

	public Integer getNumeroJournee() {
		return numeroJournee;
	}

	public void setNumeroJournee(Integer numeroJournee) {
		this.numeroJournee = numeroJournee;
	}

	public List<PlateauDto> getPlateaux() {
		return plateaux;
	}

	public void setPlateaux(List<PlateauDto> plateaux) {
		this.plateaux = plateaux;
	}

	private List<PlateauDto> plateaux;
}