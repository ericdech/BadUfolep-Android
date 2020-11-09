package com.example.domain;

import java.io.Serializable;

public class PresenceDto implements Serializable {
	private Integer idPlateau;

	public PresenceDto(){
	}

	public PresenceDto(Integer idPlateau, Integer idJoueur, char presence) {
		this.idPlateau = idPlateau;
		this.idJoueur = idJoueur;
		this.presence = presence;
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

	public char getPresence() {
		return presence;
	}

	public void setPresence(char presence) {
		this.presence = presence;
	}

	private Integer idJoueur;
	private char presence;
}