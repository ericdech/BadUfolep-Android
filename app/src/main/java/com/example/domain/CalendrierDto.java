package com.example.domain;

import java.io.Serializable;
import java.util.List;

public class CalendrierDto implements Serializable {
	private Integer idChampionnat;
	private Integer nbJournee;
	private List<JourneeDto> journees;

	public CalendrierDto(){
	}

	public CalendrierDto(Integer idChampionnat, Integer nbJournee, List<JourneeDto> journees) {
		this.idChampionnat = idChampionnat;
		this.nbJournee = nbJournee;
		this.journees = journees;
	}

	public Integer getIdChampionnat() {
		return idChampionnat;
	}

	public void setIdChampionnat(Integer idChampionnat) {
		this.idChampionnat = idChampionnat;
	}

	public Integer getNbJournee() {
		return nbJournee;
	}

	public void setNbJournee(Integer nbJournee) {
		this.nbJournee = nbJournee;
	}

	public List<JourneeDto> getJournees() {
		return journees;
	}

	public void setJournees(List<JourneeDto> journees) {
		this.journees = journees;
	}
}