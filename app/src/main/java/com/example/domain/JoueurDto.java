package com.example.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class JoueurDto implements Serializable {
	private Integer idJoueur;
	private Integer idChampionnat;
	private Integer idAdherent;
	private Integer idCategorie;
	private Integer idClub;
	private Integer idJoueurPaire;
	private Integer pointMeilleursPlateaux;
	private Integer pointTousPlateaux;
	private BigDecimal niveau;
	private Integer classement;

	public JoueurDto(){
	}

	public JoueurDto(Integer idJoueur, Integer idChampionnat, Integer idAdherent, Integer idCategorie, Integer idClub, Integer idJoueurPaire, Integer pointMeilleursPlateaux, Integer pointTousPlateaux, BigDecimal niveau, Integer classement) {
		this.idJoueur = idJoueur;
		this.idChampionnat = idChampionnat;
		this.idAdherent = idAdherent;
		this.idCategorie = idCategorie;
		this.idClub = idClub;
		this.idJoueurPaire = idJoueurPaire;
		this.pointMeilleursPlateaux = pointMeilleursPlateaux;
		this.pointTousPlateaux = pointTousPlateaux;
		this.niveau = niveau;
		this.classement = classement;
	}

	public Integer getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(Integer idJoueur) {
		this.idJoueur = idJoueur;
	}

	public Integer getIdChampionnat() {
		return idChampionnat;
	}

	public void setIdChampionnat(Integer idChampionnat) {
		this.idChampionnat = idChampionnat;
	}

	public Integer getIdAdherent() {
		return idAdherent;
	}

	public void setIdAdherent(Integer idAdherent) {
		this.idAdherent = idAdherent;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public Integer getIdJoueurPaire() {
		return idJoueurPaire;
	}

	public void setIdJoueurPaire(Integer idJoueurPaire) {
		this.idJoueurPaire = idJoueurPaire;
	}

	public Integer getPointMeilleursPlateaux() {
		return pointMeilleursPlateaux;
	}

	public void setPointMeilleursPlateaux(Integer pointMeilleursPlateaux) {
		this.pointMeilleursPlateaux = pointMeilleursPlateaux;
	}

	public Integer getPointTousPlateaux() {
		return pointTousPlateaux;
	}

	public void setPointTousPlateaux(Integer pointTousPlateaux) {
		this.pointTousPlateaux = pointTousPlateaux;
	}

	public BigDecimal getNiveau() {
		return niveau;
	}

	public void setNiveau(BigDecimal niveau) {
		this.niveau = niveau;
	}

	public Integer getClassement() {
		return classement;
	}

	public void setClassement(Integer classement) {
		this.classement = classement;
	}
}