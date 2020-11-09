package com.example.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PlateauDto implements Serializable {

	public PlateauDto(){
	}

	public PlateauDto(Integer idPlateau, Integer idChampionnat, Integer idClub, Integer numeroJournee, LocalDate datePlateau, LocalTime heureDebut, LocalTime heureFin, String nomSalle, String adresse1Salle, String adresse2Salle, String villeSalle, String statut, List<CategorieDto> categories) {
		this.idPlateau = idPlateau;
		this.idChampionnat = idChampionnat;
		this.idClub = idClub;
		this.numeroJournee = numeroJournee;
		this.datePlateau = datePlateau;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.nomSalle = nomSalle;
		this.adresse1Salle = adresse1Salle;
		this.adresse2Salle = adresse2Salle;
		this.villeSalle = villeSalle;
		this.statut = statut;
		this.categories = categories;
	}

	public Integer getIdPlateau() {
		return idPlateau;
	}

	public void setIdPlateau(Integer idPlateau) {
		this.idPlateau = idPlateau;
	}

	public Integer getIdChampionnat() {
		return idChampionnat;
	}

	public void setIdChampionnat(Integer idChampionnat) {
		this.idChampionnat = idChampionnat;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public Integer getNumeroJournee() {
		return numeroJournee;
	}

	public void setNumeroJournee(Integer numeroJournee) {
		this.numeroJournee = numeroJournee;
	}

	public LocalDate getDatePlateau() {
		return datePlateau;
	}

	public void setDatePlateau(LocalDate datePlateau) {
		this.datePlateau = datePlateau;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public LocalTime getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(LocalTime heureFin) {
		this.heureFin = heureFin;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getAdresse1Salle() {
		return adresse1Salle;
	}

	public void setAdresse1Salle(String adresse1Salle) {
		this.adresse1Salle = adresse1Salle;
	}

	public String getAdresse2Salle() {
		return adresse2Salle;
	}

	public void setAdresse2Salle(String adresse2Salle) {
		this.adresse2Salle = adresse2Salle;
	}

	public String getVilleSalle() {
		return villeSalle;
	}

	public void setVilleSalle(String villeSalle) {
		this.villeSalle = villeSalle;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public List<CategorieDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategorieDto> categories) {
		this.categories = categories;
	}

	private Integer idPlateau;
	private Integer idChampionnat;
	private Integer idClub;
	private Integer numeroJournee;
	private LocalDate datePlateau;
	private LocalTime heureDebut;
	private LocalTime heureFin;
	private String nomSalle;
	private String adresse1Salle;
	private String adresse2Salle;
	private String villeSalle;
	private String statut;
	private List<CategorieDto> categories;
}