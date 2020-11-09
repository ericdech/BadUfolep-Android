package com.example.domain;

import java.io.Serializable;

public class PlateauJoueurDto implements Serializable {

	public PlateauJoueurDto(){
	}

	public PlateauJoueurDto(Integer idPlateauJoueur, Integer idPlateau, Integer idJoueur, Integer idPlateauJoueurPaire, Integer idPoule, char presence, Integer point, Integer classement) {
		this.idPlateauJoueur = idPlateauJoueur;
		this.idPlateau = idPlateau;
		this.idJoueur = idJoueur;
		this.idPlateauJoueurPaire = idPlateauJoueurPaire;
		this.idPoule = idPoule;
		this.presence = presence;
		this.point = point;
		this.classement = classement;
	}

	private Integer idPlateauJoueur;

	public Integer getIdPlateauJoueur() {
		return idPlateauJoueur;
	}

	public void setIdPlateauJoueur(Integer idPlateauJoueur) {
		this.idPlateauJoueur = idPlateauJoueur;
	}

	public Integer getIdPlateau() {
		return idPlateau;
	}

	public void setIdPlateau(Integer idPlateau) {
		this.idPlateau = idPlateau;
	}

	public Integer getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(Integer idJoueur) {
		this.idJoueur = idJoueur;
	}

	public Integer getIdPlateauJoueurPaire() {
		return idPlateauJoueurPaire;
	}

	public void setIdPlateauJoueurPaire(Integer idPlateauJoueurPaire) {
		this.idPlateauJoueurPaire = idPlateauJoueurPaire;
	}

	public Integer getIdPoule() {
		return idPoule;
	}

	public void setIdPoule(Integer idPoule) {
		this.idPoule = idPoule;
	}

	public char getPresence() {
		return presence;
	}

	public void setPresence(char presence) {
		this.presence = presence;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Integer getClassement() {
		return classement;
	}

	public void setClassement(Integer classement) {
		this.classement = classement;
	}

	private Integer idPlateau;
	private Integer idJoueur;
	private Integer idPlateauJoueurPaire;
	private Integer idPoule;
	private char presence;
	private Integer point;
	private Integer classement;
}