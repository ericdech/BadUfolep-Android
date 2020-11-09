package com.example.domain;


import java.io.Serializable;

public class InscriptionDto implements Serializable {
	private Integer idPlateau;
	private Integer idJoueur;
	private boolean inscrit;

	public InscriptionDto(){
	}

	public InscriptionDto(Integer idPlateau, Integer idJoueur, boolean inscrit) {
		this.idPlateau = idPlateau;
		this.idJoueur = idJoueur;
		this.inscrit = inscrit;
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

	public boolean isInscrit() {
		return inscrit;
	}

	public void setInscrit(boolean inscrit) {
		this.inscrit = inscrit;
	}
}