package com.example.domain;


import java.io.Serializable;

public class CategorieDto implements Serializable {
	private Integer idCategorie;
	private Integer idChampionnat;
	private String categorieAge;
	private String sexe;
	private Integer anneeNaissanceMin;

	public CategorieDto(){
	}

	public CategorieDto(Integer idCategorie, Integer idChampionnat, String categorieAge, String sexe, Integer anneeNaissanceMin) {
		this.idCategorie = idCategorie;
		this.idChampionnat = idChampionnat;
		this.categorieAge = categorieAge;
		this.sexe = sexe;
		this.anneeNaissanceMin = anneeNaissanceMin;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Integer getIdChampionnat() {
		return idChampionnat;
	}

	public void setIdChampionnat(Integer idChampionnat) {
		this.idChampionnat = idChampionnat;
	}

	public String getCategorieAge() {
		return categorieAge;
	}

	public void setCategorieAge(String categorieAge) {
		this.categorieAge = categorieAge;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Integer getAnneeNaissanceMin() {
		return anneeNaissanceMin;
	}

	public void setAnneeNaissanceMin(Integer anneeNaissanceMin) {
		this.anneeNaissanceMin = anneeNaissanceMin;
	}
}