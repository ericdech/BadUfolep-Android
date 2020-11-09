package com.example.domain;


import java.io.Serializable;

public class ChampionnatDto implements Serializable {
	private Integer idChampionnat;
	private String ucChampionnat;
	private String llChampionnat;
	private byte[] logoChampionnat;
	private Integer nbJournee;
	private String statut;

	public ChampionnatDto(){
	}

	public ChampionnatDto(Integer idChampionnat, String ucChampionnat, String llChampionnat, byte[] logoChampionnat, Integer nbJournee, String statut) {
		this.idChampionnat = idChampionnat;
		this.ucChampionnat = ucChampionnat;
		this.llChampionnat = llChampionnat;
		this.logoChampionnat = logoChampionnat;
		this.nbJournee = nbJournee;
		this.statut = statut;
	}

	public Integer getIdChampionnat() {
		return idChampionnat;
	}

	public void setIdChampionnat(Integer idChampionnat) {
		this.idChampionnat = idChampionnat;
	}

	public String getUcChampionnat() {
		return ucChampionnat;
	}

	public void setUcChampionnat(String ucChampionnat) {
		this.ucChampionnat = ucChampionnat;
	}

	public String getLlChampionnat() {
		return llChampionnat;
	}

	public void setLlChampionnat(String llChampionnat) {
		this.llChampionnat = llChampionnat;
	}

	public byte[] getLogoChampionnat() {
		return logoChampionnat;
	}

	public void setLogoChampionnat(byte[] logoChampionnat) {
		this.logoChampionnat = logoChampionnat;
	}

	public Integer getNbJournee() {
		return nbJournee;
	}

	public void setNbJournee(Integer nbJournee) {
		this.nbJournee = nbJournee;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
}